package com.cookingBird.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.cookingBird.subject.application.convert.SubjectCategoryDTOConverter;
import com.cookingBird.subject.application.dto.SubjectCategoryDTO;
import com.cookingBird.subject.common.entity.Result;
import com.cookingBird.subject.domain.entity.SubjectCategoryBO;
import com.cookingBird.subject.domain.service.SubjectCategoryDomainService;
import com.google.common.base.Preconditions;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/subject/category")
public class SubjectCategoryController {
    @Resource
    SubjectCategoryDomainService subjectCategoryDomainService;

    /**
     * 新增分类
     */
    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectCategoryController.add.dto:{}", JSON.toJSONString(subjectCategoryDTO));
            }
            Preconditions.checkNotNull(subjectCategoryDTO.getCategoryType(), "分类类型不能为空");
            Preconditions.checkArgument(!StringUtils.isBlank(subjectCategoryDTO.getCategoryName()), "分类名称不能为空");
            Preconditions.checkNotNull(subjectCategoryDTO.getParentId(), "分类父级id不能为空");
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convertDtoToCategoryBO(subjectCategoryDTO);
            subjectCategoryDomainService.add(subjectCategoryBO);
            return Result.ok(true);
        }
        catch (Exception e) {
            log.error("SubjectCategoryController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增分类失败");
        }
    }

}


