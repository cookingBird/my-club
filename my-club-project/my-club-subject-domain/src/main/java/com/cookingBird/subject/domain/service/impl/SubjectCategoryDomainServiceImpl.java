package com.cookingBird.subject.domain.service.impl;

import com.alibaba.fastjson.JSON;
import com.cookingBird.subject.common.enums.IsDeletedFlagEnum;
import com.cookingBird.subject.domain.convert.SubjectCategoryConverter;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.domain.models.SubjectLabelBO;
import com.cookingBird.subject.domain.service.SubjectCategoryDomainService;

import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import com.cookingBird.subject.infra.basic.service.SubjectCategoryService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;


@Service("subjectCategoryDomainService")
@Slf4j
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {
    @Resource
    private SubjectCategoryService subjectCategoryService;


    @Override
    public void add(SubjectCategoryBO subjectCategoryBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectCategoryController.add.bo:{}", JSON.toJSONString(subjectCategoryBO));
        }
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE
                .Bo2Po(subjectCategoryBO);
        subjectCategory.setIsDeleted(IsDeletedFlagEnum.UN_DELETE.getCode());
        subjectCategoryService.insert(subjectCategory);
    }

    @Override
    public List<SubjectCategoryBO> queryCategory(SubjectCategory subjectCategory) {

        log.info("categoryDomainService:{}", subjectCategory);
        return subjectCategoryService
                .queryCategory(subjectCategory)
                .stream()
                .map(SubjectCategoryConverter.INSTANCE::Po2Bo)
                .collect(Collectors.toList());
    }

    @Override
    public Boolean update(SubjectCategoryBO subjectCategoryBO) {
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE
                .Bo2Po(subjectCategoryBO);
        subjectCategoryService.update(subjectCategory);
        return true;
    }

    @Override
    public Boolean delete(SubjectCategoryBO subjectCategoryBO) {
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE
                .Bo2Po(subjectCategoryBO);
        subjectCategory.setIsDeleted(IsDeletedFlagEnum.DELETE.getCode());
        subjectCategoryService.update(subjectCategory);
        return true;
    }

    @SneakyThrows
    @Override
    public List<SubjectCategoryBO> queryCategoryAndLabel(SubjectCategoryBO subjectCategoryBO) {
        return null;
    }

    private List<SubjectCategoryBO> getSubjectCategoryBOS(Long categoryId) {
        return null;
    }

    private Map<Long, List<SubjectLabelBO>> getLabelBOList(SubjectCategoryBO category) {
        return null;
    }
}
