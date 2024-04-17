package com.cookingBird.subject.infra.convert;

import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import com.cookingBird.subject.infra.generate.entity.GenSubjectCategory;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-17T12:34:21+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
public class SubjectCategoryConvertImpl implements SubjectCategoryConvert {

    @Override
    public GenSubjectCategory po2gen(SubjectCategory subjectCategory) {
        if ( subjectCategory == null ) {
            return null;
        }

        GenSubjectCategory genSubjectCategory = new GenSubjectCategory();

        genSubjectCategory.setCreatedBy( subjectCategory.getCreateBy() );
        genSubjectCategory.setCreatedTime( subjectCategory.getCreateTime() );
        genSubjectCategory.setId( subjectCategory.getId() );
        genSubjectCategory.setCategoryName( subjectCategory.getCategoryName() );
        genSubjectCategory.setCategoryType( subjectCategory.getCategoryType() );
        genSubjectCategory.setImageUrl( subjectCategory.getImageUrl() );
        genSubjectCategory.setParentId( subjectCategory.getParentId() );
        genSubjectCategory.setUpdateBy( subjectCategory.getUpdateBy() );
        genSubjectCategory.setUpdateTime( subjectCategory.getUpdateTime() );
        genSubjectCategory.setIsDeleted( subjectCategory.getIsDeleted() );

        return genSubjectCategory;
    }

    @Override
    public SubjectCategory gen2po(GenSubjectCategory genSubjectCategory) {
        if ( genSubjectCategory == null ) {
            return null;
        }

        SubjectCategory subjectCategory = new SubjectCategory();

        subjectCategory.setCreateBy( genSubjectCategory.getCreatedBy() );
        subjectCategory.setCreateTime( genSubjectCategory.getCreatedTime() );
        subjectCategory.setIsDeleted( genSubjectCategory.getIsDeleted() );
        subjectCategory.setUpdateBy( genSubjectCategory.getUpdateBy() );
        subjectCategory.setUpdateTime( genSubjectCategory.getUpdateTime() );
        subjectCategory.setId( genSubjectCategory.getId() );
        subjectCategory.setCategoryName( genSubjectCategory.getCategoryName() );
        subjectCategory.setCategoryType( genSubjectCategory.getCategoryType() );
        subjectCategory.setImageUrl( genSubjectCategory.getImageUrl() );
        subjectCategory.setParentId( genSubjectCategory.getParentId() );

        return subjectCategory;
    }
}
