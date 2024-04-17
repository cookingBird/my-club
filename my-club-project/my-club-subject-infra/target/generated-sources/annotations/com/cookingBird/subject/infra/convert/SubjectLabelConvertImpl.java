package com.cookingBird.subject.infra.convert;

import com.cookingBird.subject.infra.basic.entity.SubjectLabel;
import com.cookingBird.subject.infra.generate.entity.GenSubjectLabel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-18T00:39:54+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
public class SubjectLabelConvertImpl implements SubjectLabelConvert {

    @Override
    public GenSubjectLabel po2gen(SubjectLabel subjectLabel) {
        if ( subjectLabel == null ) {
            return null;
        }

        GenSubjectLabel genSubjectLabel = new GenSubjectLabel();

        genSubjectLabel.setId( subjectLabel.getId() );
        genSubjectLabel.setLabelName( subjectLabel.getLabelName() );
        genSubjectLabel.setSortNum( subjectLabel.getSortNum() );
        genSubjectLabel.setUpdateBy( subjectLabel.getUpdateBy() );
        genSubjectLabel.setUpdateTime( subjectLabel.getUpdateTime() );
        genSubjectLabel.setIsDeleted( subjectLabel.getIsDeleted() );

        return genSubjectLabel;
    }

    @Override
    public List<GenSubjectLabel> po2genList(List<SubjectLabel> subjectLabelList) {
        if ( subjectLabelList == null ) {
            return null;
        }

        List<GenSubjectLabel> list = new ArrayList<GenSubjectLabel>( subjectLabelList.size() );
        for ( SubjectLabel subjectLabel : subjectLabelList ) {
            list.add( po2gen( subjectLabel ) );
        }

        return list;
    }

    @Override
    public SubjectLabel gen2po(GenSubjectLabel genSubjectCategory) {
        if ( genSubjectCategory == null ) {
            return null;
        }

        SubjectLabel subjectLabel = new SubjectLabel();

        subjectLabel.setIsDeleted( genSubjectCategory.getIsDeleted() );
        subjectLabel.setUpdateBy( genSubjectCategory.getUpdateBy() );
        subjectLabel.setUpdateTime( genSubjectCategory.getUpdateTime() );
        subjectLabel.setId( genSubjectCategory.getId() );
        subjectLabel.setLabelName( genSubjectCategory.getLabelName() );
        subjectLabel.setSortNum( genSubjectCategory.getSortNum() );

        return subjectLabel;
    }

    @Override
    public List<SubjectLabel> gen2poList(List<GenSubjectLabel> genSubjectLabelList) {
        if ( genSubjectLabelList == null ) {
            return null;
        }

        List<SubjectLabel> list = new ArrayList<SubjectLabel>( genSubjectLabelList.size() );
        for ( GenSubjectLabel genSubjectLabel : genSubjectLabelList ) {
            list.add( gen2po( genSubjectLabel ) );
        }

        return list;
    }
}
