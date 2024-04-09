package com.cookingBird.subject.infra.basic.service;

import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import com.cookingBird.subject.infra.basic.entity.SubjectLabel;

import java.util.List;

public interface SubjectLabelService {
    boolean insert(SubjectLabel subjectLabel);

    List<SubjectLabel> queryCategory(SubjectLabel subjectLabel);

    boolean update(SubjectLabel subjectLabel);

    boolean deleteById(Long id);
}
