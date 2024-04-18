package com.cookingBird.subject.domain.convert;

import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-19T00:42:10+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
public class SubjectCategoryConverterImpl implements SubjectCategoryConverter {

    @Override
    public SubjectCategoryBO Po2Bo(SubjectCategory target) {
        if ( target == null ) {
            return null;
        }

        SubjectCategoryBO subjectCategoryBO = new SubjectCategoryBO();

        subjectCategoryBO.setId( target.getId() );
        subjectCategoryBO.setCategoryName( target.getCategoryName() );
        subjectCategoryBO.setCategoryType( target.getCategoryType() );
        subjectCategoryBO.setImageUrl( target.getImageUrl() );
        subjectCategoryBO.setParentId( target.getParentId() );

        return subjectCategoryBO;
    }

    @Override
    public SubjectCategory Bo2Po(SubjectCategoryBO target) {
        if ( target == null ) {
            return null;
        }

        SubjectCategory subjectCategory = new SubjectCategory();

        subjectCategory.setId( target.getId() );
        subjectCategory.setCategoryName( target.getCategoryName() );
        subjectCategory.setCategoryType( target.getCategoryType() );
        subjectCategory.setImageUrl( target.getImageUrl() );
        subjectCategory.setParentId( target.getParentId() );

        return subjectCategory;
    }
}
