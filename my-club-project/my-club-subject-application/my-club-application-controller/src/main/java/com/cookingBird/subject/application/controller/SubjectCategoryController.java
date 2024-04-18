package com.cookingBird.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.cookingBird.subject.application.convert.SubjectCategoryDTOConverter;
import com.cookingBird.subject.application.dto.SubjectCategoryDTO;
import com.cookingBird.subject.application.dto.SubjectCategoryQueryDTO;
import com.cookingBird.subject.common.entity.impl.Result;
import com.cookingBird.subject.common.factory.FactoryUnSupportException;
import com.cookingBird.subject.common.handler.Handler;
import com.cookingBird.subject.common.processor.Processor;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.domain.factory.categoryType.CategoryTypeHandlerFactory;
import com.cookingBird.subject.domain.service.SubjectCategoryDomainService;
import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import com.google.common.base.Preconditions;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

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
            Processor<SubjectCategoryBO, Void> handler = categoryTypeHandlerFactory.getHandler(subjectCategoryDTO.getCategoryType());
            if (handler == null) throw FactoryUnSupportException.create();
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.Dto2Bo(subjectCategoryDTO);
            handler.process(subjectCategoryBO);
            log.info(subjectCategoryBO.toString() + " " + subjectCategoryBO.getId());
            return Result.ok(true);
        }
        catch (Exception e) {
            log.error("SubjectCategoryController.add.error:{}", e.getMessage(), e);
            return Result.fail(false);
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
            return Result.DELETE.ok();
        }
        catch (Exception e) {
            log.error("SubjectCategoryController.delet.error:{}", e.getMessage(), e);
            return Result.DELETE.fail();
        }
    }

    @PostMapping("/query")
    public Result<List<SubjectCategoryDTO>> queryPrimary(@RequestBody SubjectCategoryQueryDTO subjectCategoryQueryDTO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectCategoryController.query.dto:{}", JSON.toJSONString(subjectCategoryQueryDTO));
        }

        List<SubjectCategoryDTO> subjectCategoryDTOS = subjectCategoryDomainService
                .queryCategory(new SubjectCategory())
                .stream()
                .map(SubjectCategoryDTOConverter.INSTANCE::Bo2Dto)
                .collect(Collectors.toList());

        return Result.ok(subjectCategoryDTOS);
    }

}


