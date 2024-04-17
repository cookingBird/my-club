package com.cookingBird.subject.application.convert;

import com.cookingBird.subject.application.dto.SubjectCategoryDTO;
import com.cookingBird.subject.common.converter.BODTOConverter;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectCategoryDTOConverter extends BODTOConverter<SubjectCategoryBO, SubjectCategoryDTO> {

    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

}
