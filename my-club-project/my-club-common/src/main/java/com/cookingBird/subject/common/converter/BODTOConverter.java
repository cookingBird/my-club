package com.cookingBird.subject.common.converter;

import java.util.List;

public interface BODTOConverter<BO, DTO> {
    DTO Bo2Dto(BO target);

    BO Dto2Bo(DTO target);

    List<BO> ListDto2Bo(List<DTO> list);

}
