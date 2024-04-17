package com.cookingBird.subject.domain.convert;

import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectCategoryConverter {
    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);

    SubjectCategoryBO Po2Bo(SubjectCategory target);

    SubjectCategory Bo2Po(SubjectCategoryBO target);
}
