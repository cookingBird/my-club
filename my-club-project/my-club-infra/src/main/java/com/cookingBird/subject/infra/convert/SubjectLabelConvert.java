package com.cookingBird.subject.infra.convert;

import com.cookingBird.subject.infra.basic.entity.SubjectLabel;
import com.cookingBird.subject.infra.generate.entity.GenSubjectLabel;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface SubjectLabelConvert {

    SubjectLabelConvert INSTANCE = Mappers.getMapper(SubjectLabelConvert.class);

    GenSubjectLabel po2gen(SubjectLabel subjectLabel);

    List<GenSubjectLabel> po2genList(List<SubjectLabel> subjectLabelList);

    SubjectLabel gen2po(GenSubjectLabel genSubjectCategory);

    List<SubjectLabel> gen2poList(List<GenSubjectLabel> genSubjectLabelList);
}
