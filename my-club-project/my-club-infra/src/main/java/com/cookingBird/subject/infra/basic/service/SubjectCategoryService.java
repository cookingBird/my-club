package com.cookingBird.subject.infra.basic.service;

import com.cookingBird.subject.infra.basic.entity.SubjectCategory;


import java.util.List;

public interface SubjectCategoryService {
    boolean insert(SubjectCategory subjectCategory);

    List<SubjectCategory> queryCategory(SubjectCategory subjectCategory);

    boolean update(SubjectCategory subjectCategory);

    boolean deleteById(Long id);
}
