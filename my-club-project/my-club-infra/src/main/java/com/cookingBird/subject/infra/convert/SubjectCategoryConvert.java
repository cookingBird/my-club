package com.cookingBird.subject.infra.convert;

import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import com.cookingBird.subject.infra.generate.entity.GenSubjectCategory;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface SubjectCategoryConvert {

    SubjectCategoryConvert INSTANCE = Mappers.getMapper(SubjectCategoryConvert.class);

    GenSubjectCategory po2gen(SubjectCategory subjectCategory);

    List<GenSubjectCategory> po2genList(List<SubjectCategory> subjectCategory);

    SubjectCategory gen2po(GenSubjectCategory genSubjectCategory);

    List<SubjectCategory> gen2poList(List<GenSubjectCategory> genSubjectCategory);
}
