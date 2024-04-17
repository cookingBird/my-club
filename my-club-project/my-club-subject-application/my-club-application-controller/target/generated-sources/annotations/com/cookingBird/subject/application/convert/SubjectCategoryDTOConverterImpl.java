package com.cookingBird.subject.application.convert;

import com.cookingBird.subject.application.dto.SubjectCategoryDTO;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.domain.models.SubjectCategoryBO.SubjectCategoryBOBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-18T00:33:59+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
public class SubjectCategoryDTOConverterImpl implements SubjectCategoryDTOConverter {

    @Override
    public SubjectCategoryDTO Bo2Dto(SubjectCategoryBO target) {
        if ( target == null ) {
            return null;
        }

        SubjectCategoryDTO subjectCategoryDTO = new SubjectCategoryDTO();

        subjectCategoryDTO.setId( target.getId() );
        subjectCategoryDTO.setCategoryName( target.getCategoryName() );
        subjectCategoryDTO.setCategoryType( target.getCategoryType() );
        subjectCategoryDTO.setImageUrl( target.getImageUrl() );
        subjectCategoryDTO.setParentId( target.getParentId() );
        subjectCategoryDTO.setCount( target.getCount() );

        return subjectCategoryDTO;
    }

    @Override
    public SubjectCategoryBO Dto2Bo(SubjectCategoryDTO target) {
        if ( target == null ) {
            return null;
        }

        SubjectCategoryBOBuilder subjectCategoryBO = SubjectCategoryBO.builder();

        subjectCategoryBO.id( target.getId() );
        subjectCategoryBO.categoryName( target.getCategoryName() );
        subjectCategoryBO.categoryType( target.getCategoryType() );
        subjectCategoryBO.imageUrl( target.getImageUrl() );
        subjectCategoryBO.parentId( target.getParentId() );
        subjectCategoryBO.count( target.getCount() );

        return subjectCategoryBO.build();
    }
}
