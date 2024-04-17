package com.cookingBird.subject.application.convert;

import com.cookingBird.subject.application.dto.SubjectCategoryDTO;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.domain.models.SubjectCategoryBO.SubjectCategoryBOBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-17T12:34:24+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
public class SubjectCategoryDTOConverterImpl implements SubjectCategoryDTOConverter {

    @Override
    public SubjectCategoryDTO Bo2Dto(SubjectCategoryBO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SubjectCategoryDTO subjectCategoryDTO = new SubjectCategoryDTO();

        subjectCategoryDTO.setId( arg0.getId() );
        subjectCategoryDTO.setCategoryName( arg0.getCategoryName() );
        subjectCategoryDTO.setCategoryType( arg0.getCategoryType() );
        subjectCategoryDTO.setImageUrl( arg0.getImageUrl() );
        subjectCategoryDTO.setParentId( arg0.getParentId() );
        subjectCategoryDTO.setCount( arg0.getCount() );

        return subjectCategoryDTO;
    }

    @Override
    public SubjectCategoryBO Dto2Bo(SubjectCategoryDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SubjectCategoryBOBuilder subjectCategoryBO = SubjectCategoryBO.builder();

        subjectCategoryBO.id( arg0.getId() );
        subjectCategoryBO.categoryName( arg0.getCategoryName() );
        subjectCategoryBO.categoryType( arg0.getCategoryType() );
        subjectCategoryBO.imageUrl( arg0.getImageUrl() );
        subjectCategoryBO.parentId( arg0.getParentId() );
        subjectCategoryBO.count( arg0.getCount() );

        return subjectCategoryBO.build();
    }

    @Override
    public List<SubjectCategoryBO> ListDto2Bo(List<SubjectCategoryDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SubjectCategoryBO> list = new ArrayList<SubjectCategoryBO>( arg0.size() );
        for ( SubjectCategoryDTO subjectCategoryDTO : arg0 ) {
            list.add( Dto2Bo( subjectCategoryDTO ) );
        }

        return list;
    }
}
