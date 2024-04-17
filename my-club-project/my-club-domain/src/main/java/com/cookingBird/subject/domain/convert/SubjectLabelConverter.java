package com.cookingBird.subject.domain.convert;


import com.cookingBird.subject.domain.models.SubjectLabelBO;
import com.cookingBird.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectLabelConverter {
    SubjectLabelConverter INSTANCE = Mappers.getMapper(SubjectLabelConverter.class);

    SubjectLabel BO2PO(SubjectLabelBO subjectLabelBO);

    List<SubjectLabelBO> ListPO2BO(List<SubjectLabel> subjectLabelList);

}
