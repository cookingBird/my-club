package com.cookingBird.subject.domain.service.impl;

import com.alibaba.fastjson.JSON;
import com.cookingBird.subject.common.enums.IsDeletedFlagEnum;
import com.cookingBird.subject.domain.convert.SubjectLabelConverter;
import com.cookingBird.subject.domain.models.SubjectLabelBO;
import com.cookingBird.subject.domain.service.SubjectLabelDomainService;
import com.cookingBird.subject.infra.basic.entity.SubjectLabel;
import com.cookingBird.subject.infra.basic.service.SubjectCategoryService;
import com.cookingBird.subject.infra.basic.service.SubjectLabelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
@Slf4j
public class SubjectLabelDomainServiceImpl implements SubjectLabelDomainService {
    @Resource
    private SubjectLabelService subjectLabelService;


    @Resource
    private SubjectCategoryService subjectCategoryService;

    @Override
    public Boolean add(SubjectLabelBO subjectLabelBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectLabelDomainServiceImpl.add.bo:{}", JSON.toJSONString(subjectLabelBO));
        }
        SubjectLabel subjectLabel = SubjectLabelConverter.INSTANCE
                .BO2PO(subjectLabelBO);
        subjectLabel.setIsDeleted(IsDeletedFlagEnum.UN_DELETE.getCode());
        return subjectLabelService.insert(subjectLabel);
    }

    @Override
    public Boolean update(SubjectLabelBO subjectLabelBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectLabelDomainServiceImpl.update.bo:{}", JSON.toJSONString(subjectLabelBO));
        }
        SubjectLabel subjectLabel = SubjectLabelConverter.INSTANCE
                .BO2PO(subjectLabelBO);
        return subjectLabelService.update(subjectLabel);
    }

    @Override
    public Boolean delete(SubjectLabelBO subjectLabelBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectLabelDomainServiceImpl.update.bo:{}", JSON.toJSONString(subjectLabelBO));
        }
        SubjectLabel subjectLabel = SubjectLabelConverter.INSTANCE
                .BO2PO(subjectLabelBO);
        subjectLabel.setIsDeleted(IsDeletedFlagEnum.DELETE.getCode());
        return subjectLabelService.update(subjectLabel);
    }

    @Override
    public List<SubjectLabelBO> queryLabelByCategoryId(SubjectLabelBO subjectLabelBO) {

        return null;
    }
}
