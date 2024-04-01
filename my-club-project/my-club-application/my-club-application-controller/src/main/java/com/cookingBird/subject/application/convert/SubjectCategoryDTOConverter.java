package com.cookingBird.subject.application.convert;

import com.cookingBird.subject.application.dto.SubjectCategoryDTO;
import com.cookingBird.subject.common.converter.BODTOConverter;
import com.cookingBird.subject.domain.entity.SubjectCategoryBO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectCategoryDTOConverter extends BODTOConverter<SubjectCategoryBO, SubjectCategoryDTO> {

    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

}
