package com.cookingBird.subject.infra.basic.service.impl;

import com.cookingBird.subject.infra.basic.entity.SubjectLabel;
import com.cookingBird.subject.infra.basic.service.SubjectLabelService;
import com.cookingBird.subject.infra.convert.SubjectLabelConvert;
import com.cookingBird.subject.infra.generate.dao.GenSubjectLabelDao;
import com.cookingBird.subject.infra.generate.entity.GenSubjectLabel;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

public class SubjectLabelServiceImpl implements SubjectLabelService {
    @Resource
    GenSubjectLabelDao genSubjectLabelDao;

    @Override
    public boolean insert(SubjectLabel subjectLabel) {
        GenSubjectLabel genSubjectLabel = SubjectLabelConvert.INSTANCE.po2gen(subjectLabel);
        return this.genSubjectLabelDao.insert(genSubjectLabel) > 0;
    }

    @Override
    public List<SubjectLabel> queryCategory(SubjectLabel subjectLabel) {
        GenSubjectLabel genSubjectLabel = SubjectLabelConvert.INSTANCE.po2gen(subjectLabel);
        return SubjectLabelConvert.INSTANCE.gen2poList(this.genSubjectLabelDao.queryAllByLimit(genSubjectLabel, PageRequest.of(0, 100)));
    }

    @Override
    public boolean update(SubjectLabel subjectLabel) {
        GenSubjectLabel genSubjectLabel = SubjectLabelConvert.INSTANCE.po2gen(subjectLabel);
        return this.genSubjectLabelDao.update(genSubjectLabel) > 0;
    }

    @Override
    public boolean deleteById(Long id) {
        return this.genSubjectLabelDao.deleteById(id) > 0;
    }
}
