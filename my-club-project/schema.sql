DROP TABLE IF EXISTS subject_category;
CREATE TABLE subject_category(
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `create_by` BIGINT   COMMENT '创建人',
    `create_time` DATETIME   COMMENT '创建时间',
    `update_by` BIGINT   COMMENT '更新人',
    `update_time` DATETIME   COMMENT '更新时间',
    `delete_flag` TINYINT   COMMENT '是否删除',
    `category_name` VARCHAR(255)   COMMENT '分类名称',
    `category_type` TINYINT   COMMENT '分类类型;0为1级分类',
    `parent_id` BIGINT   COMMENT '父级id',
    PRIMARY KEY (id)
)  COMMENT = '题目分类表';

DROP TABLE IF EXISTS subject_label;
CREATE TABLE subject_label(
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `create_by` BIGINT   COMMENT '创建人',
    `create_time` DATETIME   COMMENT '创建时间',
    `update_by` BIGINT   COMMENT '更新人',
    `update_time` DATETIME   COMMENT '更新时间',
    `delete_flag` TINYINT   COMMENT '是否删除',
    `label_name` VARCHAR(255)   COMMENT '标签名称',
    `category_id` BIGINT NOT NULL  COMMENT '分类id',
    PRIMARY KEY (id)
)  COMMENT = '题目标签表';

DROP TABLE IF EXISTS subject_info;
CREATE TABLE subject_info(
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `delete_flag` TINYINT   COMMENT '是否删除',
    `update_time` DATETIME   COMMENT '更新时间',
    `update_by` BIGINT   COMMENT '更新人',
    `create_time` DATETIME   COMMENT '创建时间',
    `create_by` BIGINT   COMMENT '创建人',
    `subject_name` VARCHAR(255)   COMMENT '题目名称',
    `subject_diffcult` TINYINT   COMMENT '题目难度',
    `subject_type` VARCHAR(255)   COMMENT '题目类型',
    `subject_score` VARCHAR(255)   COMMENT '题目分数',
    `subject_parse` VARCHAR(255)   COMMENT '题目解析',
    `settle_name` VARCHAR(255)   COMMENT '出题人名',
    PRIMARY KEY (id)
)  COMMENT = '题目信息表';

DROP TABLE IF EXISTS subject_radio;
CREATE TABLE subject_radio(
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `delete_flag` TINYINT   COMMENT '是否删除',
    `update_time` DATETIME   COMMENT '更新时间',
    `update_by` BIGINT   COMMENT '更新人',
    `create_time` DATETIME   COMMENT '创建时间',
    `create_by` BIGINT   COMMENT '创建人',
    `subject_id` BIGINT   COMMENT '题目ID',
    `option_type` TINYINT   COMMENT '选项;A,B,C,D,E...',
    `option_content` VARCHAR(255)   COMMENT '选项内容',
    `is_correct` TINYINT   COMMENT '是否正确',
    PRIMARY KEY (id)
)  COMMENT = '单选信息表';


DROP TABLE IF EXISTS subject_multiple;
CREATE TABLE subject_multiple(
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `delete_flag` TINYINT   COMMENT '是否删除',
    `update_time` DATETIME   COMMENT '更新时间',
    `update_by` BIGINT   COMMENT '更新人',
    `create_time` DATETIME   COMMENT '创建时间',
    `create_by` BIGINT   COMMENT '创建人',
    `subject_id` BIGINT   COMMENT '题目ID',
    `option_type` TINYINT   COMMENT '选项;A,B,C,D,E...',
    `option_content` VARCHAR(255)   COMMENT '选项内容',
    `is_correct` TINYINT   COMMENT '是否正确',
    PRIMARY KEY (id)
)  COMMENT = '多选题信息表';


DROP TABLE IF EXISTS subject_judge;
CREATE TABLE subject_judge(
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `delete_flag` TINYINT   COMMENT '是否删除',
    `update_time` DATETIME   COMMENT '更新时间',
    `update_by` BIGINT   COMMENT '更新人',
    `create_time` DATETIME   COMMENT '创建时间',
    `create_by` BIGINT   COMMENT '创建人',
    `subject_id` BIGINT   COMMENT '题目ID',
    `is_correct` TINYINT   COMMENT '是否正确',
    `option_type` TINYINT   COMMENT '选项类型，ABCDE',
    `option_content` VARCHAR(255)   COMMENT '选项内容',
    PRIMARY KEY (id)
)  COMMENT = '判断题信息表';

DROP TABLE IF EXISTS subject_brief;
CREATE TABLE subject_brief(
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `delete_flag` TINYINT   COMMENT '是否删除',
    `update_time` DATETIME   COMMENT '更新时间',
    `update_by` BIGINT   COMMENT '更新人',
    `create_time` DATETIME   COMMENT '创建时间',
    `create_by` BIGINT   COMMENT '创建人',
    `subject_id` BIGINT NOT NULL  COMMENT '题目ID',
    `subject_answer` VARCHAR(255)   COMMENT '题目答案',
    PRIMARY KEY (id)
)  COMMENT = '简答题';

DROP TABLE IF EXISTS subject_mapping;
CREATE TABLE subject_mapping(
    `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `delete_flag` TINYINT   COMMENT '是否删除',
    `update_time` DATETIME   COMMENT '更新时间',
    `update_by` BIGINT   COMMENT '更新人',
    `create_time` DATETIME   COMMENT '创建时间',
    `create_by` BIGINT   COMMENT '创建人',
    `subject_id` BIGINT NOT NULL  COMMENT '题目id',
    `category_id` BIGINT NOT NULL  COMMENT '分类id',
    `label_id` BIGINT NOT NULL  COMMENT '标签id',
    PRIMARY KEY (id)
)  COMMENT = '题目分类关联表';


