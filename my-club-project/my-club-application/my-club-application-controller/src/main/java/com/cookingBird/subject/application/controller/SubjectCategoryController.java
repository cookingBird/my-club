package com.cookingBird.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.cookingBird.subject.application.convert.SubjectCategoryDTOConverter;
import com.cookingBird.subject.application.dto.SubjectCategoryDTO;
import com.cookingBird.subject.application.dto.SubjectCategoryQueryDTO;
import com.cookingBird.subject.common.entity.Result;
import com.cookingBird.subject.common.factory.FactoryUnSupportException;
import com.cookingBird.subject.common.factory.Handler;
import com.cookingBird.subject.domain.entity.SubjectCategoryBO;
import com.cookingBird.subject.domain.factory.categoryType.CategoryTypeHandlerFactory;
import com.cookingBird.subject.domain.service.SubjectCategoryDomainService;
import com.google.common.base.Preconditions;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/subject/category")
@NoArgsConstructor
public class SubjectCategoryController {
    @Resource
    SubjectCategoryDomainService subjectCategoryDomainService;
    @Resource
    CategoryTypeHandlerFactory categoryTypeHandlerFactory;

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
            Handler categoryTypeHandler = categoryTypeHandlerFactory.getHandler(subjectCategoryDTO.getCategoryType());
            if (categoryTypeHandler == null) throw FactoryUnSupportException.create();
            categoryTypeHandler.process(SubjectCategoryDTOConverter.INSTANCE.Dto2Bo(subjectCategoryDTO));
            return Result.ok(true);
        }
        catch (Exception e) {
            log.error("SubjectCategoryController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增分类失败");
        }
    }

    @PostMapping("/delete/{categoryId}")
    public Result<Boolean> delete(@PathVariable Long categoryId) {
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectCategoryController.delete.dto:{}", JSON.toJSONString(categoryId));
            }
            Preconditions.checkNotNull(categoryId, "分类类型不能为空");
            subjectCategoryDomainService.delete(
                    SubjectCategoryBO
                            .builder()
                            .id(categoryId)
                            .build());
            return Result.ok();
        }
        catch (Exception e) {
            log.error("SubjectCategoryController.delet.error:{}", e.getMessage(), e);
            return Result.fail("删除分类失败");
        }
    }

    @PostMapping("/query")
    public Result<List<SubjectCategoryDTO>> queryPrimary(@RequestBody SubjectCategoryQueryDTO subjectCategoryQueryDTO) {
        List<SubjectCategoryDTO> subjectCategoryDTOS = new LinkedList<>();
        if (log.isInfoEnabled()) {
            log.info("SubjectCategoryController.query.dto:{}", JSON.toJSONString(subjectCategoryQueryDTO));
        }
        return Result.ok(subjectCategoryDTOS);
    }

}


