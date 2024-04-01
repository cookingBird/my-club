package com.cookingBird.subject.domain.convert;

import com.cookingBird.subject.domain.entity.SubjectCategoryBO;
import com.cookingBird.subject.domain.entity.SubjectLabelBO;
import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-02T00:46:48+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
public class SubjectCategoryConverterImpl implements SubjectCategoryConverter {

    @Override
    public SubjectCategoryBO Po2Bo(SubjectCategory arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Long id = null;
        String categoryName = null;
        Integer categoryType = null;
        String imageUrl = null;
        Long parentId = null;

        id = arg0.getId();
        categoryName = arg0.getCategoryName();
        categoryType = arg0.getCategoryType();
        imageUrl = arg0.getImageUrl();
        parentId = arg0.getParentId();

        Integer count = null;
        List<SubjectLabelBO> labelBOList = null;

        SubjectCategoryBO subjectCategoryBO = new SubjectCategoryBO( id, categoryName, categoryType, imageUrl, parentId, count, labelBOList );

        return subjectCategoryBO;
    }

    @Override
    public SubjectCategory Bo2Po(SubjectCategoryBO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SubjectCategory subjectCategory = new SubjectCategory();

        subjectCategory.setId( arg0.getId() );
        subjectCategory.setCategoryName( arg0.getCategoryName() );
        subjectCategory.setCategoryType( arg0.getCategoryType() );
        subjectCategory.setImageUrl( arg0.getImageUrl() );
        subjectCategory.setParentId( arg0.getParentId() );

        return subjectCategory;
    }

    @Override
    public List<SubjectCategory> ListBo2Po(List<SubjectCategoryBO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SubjectCategory> list = new ArrayList<SubjectCategory>( arg0.size() );
        for ( SubjectCategoryBO subjectCategoryBO : arg0 ) {
            list.add( Bo2Po( subjectCategoryBO ) );
        }

        return list;
    }
}
