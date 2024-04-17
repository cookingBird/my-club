package com.cookingBird.subject.application.convert;

import com.cookingBird.subject.application.dto.SubjectCategoryDTO;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectCategoryDTOConverter {

    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

    SubjectCategoryDTO Bo2Dto(SubjectCategoryBO target);

    SubjectCategoryBO Dto2Bo(SubjectCategoryDTO target);

}
