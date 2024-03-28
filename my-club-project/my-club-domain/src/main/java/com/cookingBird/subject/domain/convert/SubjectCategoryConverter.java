package com.cookingBird.subject.domain.convert;

import com.cookingBird.subject.domain.entity.SubjectCategoryBO;
import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectCategoryConverter {
    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);

    SubjectCategory convertBoToPo(SubjectCategoryBO subjectCategoryBO);

    List<SubjectCategoryBO> convertPoToBo(List<SubjectCategory> categories);
}
