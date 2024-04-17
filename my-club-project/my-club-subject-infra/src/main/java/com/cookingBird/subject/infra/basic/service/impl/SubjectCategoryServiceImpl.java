package com.cookingBird.subject.infra.basic.service.impl;

import com.cookingBird.subject.common.converter.ConvertUtil;
import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import com.cookingBird.subject.infra.basic.service.SubjectCategoryService;
import com.cookingBird.subject.infra.convert.SubjectCategoryConvert;

import com.cookingBird.subject.infra.generate.dao.GenSubjectCategoryDao;
import com.cookingBird.subject.infra.generate.entity.GenSubjectCategory;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

public class SubjectCategoryServiceImpl implements SubjectCategoryService {

    @Resource
    GenSubjectCategoryDao genSubjectCategoryDao;

    @Override
    public boolean insert(SubjectCategory subjectCategory) {
        GenSubjectCategory genSubjectCategory1 = SubjectCategoryConvert.INSTANCE.po2gen(subjectCategory);
        return this.genSubjectCategoryDao.insert(genSubjectCategory1) > 0;
    }

    @Override
    public List<SubjectCategory> queryCategory(SubjectCategory subjectCategory) {
        GenSubjectCategory genSubjectCategory1 = SubjectCategoryConvert.INSTANCE.po2gen(subjectCategory);
        PageRequest pageRequest = PageRequest.of(0, 100);
        List<GenSubjectCategory> genSubjectCategoryList = this.genSubjectCategoryDao.queryAllByLimit(genSubjectCategory1, pageRequest);
        return ConvertUtil.convertList(genSubjectCategoryList, SubjectCategoryConvert.INSTANCE::gen2po);
    }

    @Override
    public boolean update(SubjectCategory subjectCategory) {
        GenSubjectCategory genSubjectCategory1 = SubjectCategoryConvert.INSTANCE.po2gen(subjectCategory);
        return (this.genSubjectCategoryDao.update(genSubjectCategory1) > 0);
    }

    @Override
    public boolean deleteById(Long id) {
        return this.genSubjectCategoryDao.deleteById(id) > 0;
    }
}
