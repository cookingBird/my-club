package com.cookingBird.subject.common.converter;

import org.mapstruct.factory.Mappers;

import java.util.List;

public interface POBOConverter<PO, BO> {


    BO Po2Bo(PO target);

    PO Bo2Po(BO target);

    List<PO> ListBo2Po(List<BO> list);
}
