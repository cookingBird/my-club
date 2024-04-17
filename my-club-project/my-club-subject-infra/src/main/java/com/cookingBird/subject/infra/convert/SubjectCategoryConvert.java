package com.cookingBird.subject.infra.convert;

import com.cookingBird.subject.infra.basic.entity.SubjectCategory;
import com.cookingBird.subject.infra.generate.entity.GenSubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectCategoryConvert {

    SubjectCategoryConvert INSTANCE = Mappers.getMapper(SubjectCategoryConvert.class);

    @Mappings({
            @Mapping(source = "createBy", target = "createdBy"),
            @Mapping(source = "createTime", target = "createdTime")
    })
    GenSubjectCategory po2gen(SubjectCategory subjectCategory);


    @Mappings({
            @Mapping(source = "createdBy", target = "createBy"),
            @Mapping(source = "createdTime", target = "createTime")
    })
    SubjectCategory gen2po(GenSubjectCategory genSubjectCategory);

}
