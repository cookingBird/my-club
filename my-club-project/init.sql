SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `auth_permission`;
CREATE TABLE `auth_permission` (
                                   `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                   `name` varchar(64) DEFAULT NULL COMMENT '权限名称',
                                   `parent_id` bigint(20) DEFAULT NULL COMMENT '父id',
                                   `type` tinyint(4) DEFAULT NULL COMMENT '权限类型 0菜单 1操作',
                                   `menu_url` varchar(255) DEFAULT NULL COMMENT '菜单路由',
                                   `status` tinyint(2) DEFAULT NULL COMMENT '状态 0启用 1禁用',
                                   `show` tinyint(2) DEFAULT NULL COMMENT '展示状态 0展示 1隐藏',
                                   `icon` varchar(128) DEFAULT NULL COMMENT '图标',
                                   `permission_key` varchar(64) DEFAULT NULL COMMENT '权限唯一标识',
                                   `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                   `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                   `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                                   `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                                   `is_deleted` int(11) DEFAULT '0' COMMENT '是否被删除 0为删除 1已删除',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `auth_role`;
CREATE TABLE `auth_role` (
                             `id` bigint(20) NOT NULL AUTO_INCREMENT,
                             `role_name` varchar(32) DEFAULT NULL COMMENT '角色名称',
                             `role_key` varchar(64) DEFAULT NULL COMMENT '角色唯一标识',
                             `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                             `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                             `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                             `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                             `is_deleted` int(11) DEFAULT '0' COMMENT '是否被删除 0未删除 1已删除',
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;




DROP TABLE IF EXISTS `auth_role_permission`;
CREATE TABLE `auth_role_permission` (
                                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                        `auth_role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
                                        `auth_permission_id` bigint(20) DEFAULT NULL COMMENT '权限id',
                                        `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                        `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                        `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                                        `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                                        `is_deleted` int(11) DEFAULT '0',
                                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='角色权限关联表';




DROP TABLE IF EXISTS `auth_user`;
CREATE TABLE `auth_user` (
                             `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                             `user_name` varchar(32) DEFAULT NULL COMMENT '用户名称/账号',
                             `nick_name` varchar(32) DEFAULT NULL COMMENT '昵称',
                             `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
                             `phone` varchar(32) DEFAULT NULL COMMENT '手机号',
                             `password` varchar(64) DEFAULT NULL COMMENT '密码',
                             `sex` tinyint(2) DEFAULT NULL COMMENT '性别',
                             `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
                             `status` tinyint(2) DEFAULT NULL COMMENT '状态 0启用 1禁用',
                             `introduce` varchar(255) DEFAULT NULL COMMENT '个人介绍',
                             `ext_json` varchar(255) DEFAULT NULL COMMENT '特殊字段',
                             `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                             `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                             `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                             `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                             `is_deleted` int(11) DEFAULT '0' COMMENT '是否被删除 0未删除 1已删除',
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';


DROP TABLE IF EXISTS `auth_user_role`;
CREATE TABLE `auth_user_role` (
                                  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                                  `auth_user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
                                  `auth_role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
                                  `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                  `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                  `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                                  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                                  `is_deleted` int(11) DEFAULT '0',
                                  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';


DROP TABLE IF EXISTS `practice_detail`;
CREATE TABLE `practice_detail`
(
    `id`             bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `practice_info_id`    bigint(20) DEFAULT NULL COMMENT '练题id',
    `subject_id`     bigint(20) DEFAULT NULL COMMENT '题目id',
    `subject_type`   int(11) DEFAULT NULL COMMENT '题目类型',
    `answer_status`  int(11) DEFAULT NULL COMMENT '回答状态',
    `answer_content` varchar(64) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '回答内容',
    `created_by`     varchar(32) CHARACTER SET utf8  DEFAULT NULL COMMENT '创建人',
    `created_time`   datetime                        DEFAULT NULL COMMENT '创建时间',
    `update_by`      varchar(32) CHARACTER SET utf8  DEFAULT NULL COMMENT '更新人',
    `update_time`    datetime                        DEFAULT NULL COMMENT '更新时间',
    `is_deleted`     int(11) DEFAULT '0' COMMENT '是否被删除 0为删除 1已删除',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='练习详情表';


DROP TABLE IF EXISTS `practice_info`;
CREATE TABLE `practice_info`
(
    `id`              bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `practice_set_id`          bigint(20) DEFAULT NULL COMMENT '套题id',
    `complete_status` int(11) DEFAULT NULL COMMENT '是否完成 1完成 0未完成',
    `time_use`        varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用时',
    `submit_time`     datetime                        DEFAULT NULL COMMENT '交卷时间',
    `correct_rate`    decimal(10, 2)                  DEFAULT NULL COMMENT '正确率',
    `created_by`      varchar(32) CHARACTER SET utf8  DEFAULT NULL COMMENT '创建人',
    `created_time`    datetime                        DEFAULT NULL COMMENT '创建时间',
    `update_by`       varchar(32) CHARACTER SET utf8  DEFAULT NULL COMMENT '更新人',
    `update_time`     datetime                        DEFAULT NULL COMMENT '更新时间',
    `is_deleted`      int(11) DEFAULT '0' COMMENT '是否被删除 0为删除 1已删除',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='练习表';


DROP TABLE IF EXISTS `practice_set`;
CREATE TABLE `practice_set`
(
    `id`                  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `set_name`            varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '套题名称',
    `set_type`            int(11) DEFAULT NULL COMMENT '套题类型 1实时生成 2预设套题',
    `set_heat`            int(11) DEFAULT NULL COMMENT '热度',
    `set_desc`            varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '套题描述',
    `subject_category_id` bigint(20) DEFAULT NULL COMMENT '大类id',
    `created_by`          varchar(32) CHARACTER SET utf8   DEFAULT NULL COMMENT '创建人',
    `created_time`        datetime                         DEFAULT NULL COMMENT '创建时间',
    `update_by`           varchar(32) CHARACTER SET utf8   DEFAULT NULL COMMENT '更新人',
    `update_time`         datetime                         DEFAULT NULL COMMENT '更新时间',
    `is_deleted`          int(11) DEFAULT '0' COMMENT '是否被删除 0为删除 1已删除',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='套题信息表';


DROP TABLE IF EXISTS `practice_set_detail`;
CREATE TABLE `practice_set_detail`
(
    `id`           bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `practice_set_id`       bigint(20) NOT NULL COMMENT '套题id',
    `subject_info_id`   bigint(20) DEFAULT NULL COMMENT '题目id',
    `subject_type` int(11) DEFAULT NULL COMMENT '题目类型',
    `created_by`   varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '创建人',
    `created_time` bigint(20)                       DEFAULT NULL COMMENT '创建时间',
    `update_by`    varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '更新人',
    `update_time`  datetime                       DEFAULT NULL COMMENT '更新时间',
    `is_deleted`   int(11) DEFAULT '0' COMMENT '是否被删除 0为删除 1已删除',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='套题内容表';

DROP TABLE IF EXISTS `subject_brief`;
CREATE TABLE `subject_brief` (
                                 `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                                 `subject_info_id` int(20) DEFAULT NULL COMMENT '题目id',
                                 `subject_answer` text COMMENT '题目答案',
                                 `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                 `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                 `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                                 `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                                 `is_deleted` int(11) DEFAULT '0',
                                 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=232 DEFAULT CHARSET=utf8 COMMENT='简答题';




DROP TABLE IF EXISTS `subject_category`;
CREATE TABLE `subject_category` (
                                    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                                    `category_name` varchar(16) DEFAULT NULL COMMENT '分类名称',
                                    `category_type` tinyint(2) DEFAULT NULL COMMENT '分类类型',
                                    `image_url` varchar(64) DEFAULT NULL COMMENT '图标连接',
                                    `parent_id` bigint(20) DEFAULT NULL COMMENT '父级id',
                                    `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                    `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                    `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                                    `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                                    `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除 0: 未删除 1: 已删除',
                                    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='题目分类';




DROP TABLE IF EXISTS `subject_info`;
CREATE TABLE `subject_info` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                                `subject_name` varchar(128) DEFAULT NULL COMMENT '题目名称',
                                `subject_difficult` tinyint(4) DEFAULT NULL COMMENT '题目难度',
                                `settle_name` varchar(32) DEFAULT NULL COMMENT '出题人名',
                                `subject_type` tinyint(4) DEFAULT NULL COMMENT '题目类型 1单选 2多选 3判断 4简答',
                                `subject_score` tinyint(4) DEFAULT NULL COMMENT '题目分数',
                                `subject_parse` varchar(512) DEFAULT NULL COMMENT '题目解析',
                                `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                `update_by` varchar(32) DEFAULT NULL COMMENT '修改人',
                                `update_time` bigint(20) DEFAULT NULL COMMENT '修改时间',
                                `is_deleted` int(11) DEFAULT '0',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=273 DEFAULT CHARSET=utf8 COMMENT='题目信息表';




DROP TABLE IF EXISTS `subject_judge`;
CREATE TABLE `subject_judge` (
                                 `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                                 `subject_info_id` bigint(20) DEFAULT NULL COMMENT '题目id',
                                 `is_correct` tinyint(2) DEFAULT NULL COMMENT '是否正确',
                                 `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                 `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                 `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                                 `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                                 `is_deleted` int(11) DEFAULT '0',
                                 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='判断题';

DROP TABLE IF EXISTS `subject_label`;
CREATE TABLE `subject_label` (
                                 `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                                 `label_name` varchar(32) DEFAULT NULL COMMENT '标签分类',
                                 `sort_num` int(11) DEFAULT NULL COMMENT '排序',
                                 `category_id` varchar(50) DEFAULT NULL,
                                 `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                 `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                 `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                                 `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                                 `is_deleted` int(11) DEFAULT '0',
                                 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8 COMMENT='题目标签表';



DROP TABLE IF EXISTS `subject_mapping`;
CREATE TABLE `subject_mapping` (
                                   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                                   `subject_info_id` bigint(20) DEFAULT NULL COMMENT '题目id',
                                   `subject_category_id` bigint(20) DEFAULT NULL COMMENT '分类id',
                                   `label_id` bigint(20) DEFAULT NULL COMMENT '标签id',
                                   `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                   `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                   `update_by` varchar(32) DEFAULT NULL COMMENT '修改人',
                                   `update_time` bigint(20) DEFAULT NULL COMMENT '修改时间',
                                   `is_deleted` int(11) DEFAULT '0',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=479 DEFAULT CHARSET=utf8 COMMENT='题目分类关系表';


DROP TABLE IF EXISTS `subject_multiple`;
CREATE TABLE `subject_multiple` (
                                    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                                    `subject_info_id` bigint(20) DEFAULT NULL COMMENT '题目id',
                                    `option_type` bigint(4) DEFAULT NULL COMMENT '选项类型',
                                    `option_content` varchar(64) DEFAULT NULL COMMENT '选项内容',
                                    `is_correct` tinyint(2) DEFAULT NULL COMMENT '是否正确',
                                    `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                    `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                    `update_by` varchar(32) DEFAULT NULL COMMENT '更新人',
                                    `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
                                    `is_deleted` int(11) DEFAULT '0',
                                    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='多选题信息表';

DROP TABLE IF EXISTS `subject_radio`;
CREATE TABLE `subject_radio` (
                                 `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                                 `subject_info_id` bigint(20) DEFAULT NULL COMMENT '题目id',
                                 `option_type` tinyint(4) DEFAULT NULL COMMENT 'a,b,c,d',
                                 `option_content` varchar(128) DEFAULT NULL COMMENT '选项内容',
                                 `is_correct` tinyint(2) DEFAULT NULL COMMENT '是否正确',
                                 `created_by` varchar(32) DEFAULT NULL COMMENT '创建人',
                                 `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
                                 `update_by` varchar(32) DEFAULT NULL COMMENT '修改人',
                                 `update_time` bigint(20) DEFAULT NULL COMMENT '修改时间',
                                 `is_deleted` int(11) DEFAULT '0',
                                 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单选题信息表';

SET FOREIGN_KEY_CHECKS=1;