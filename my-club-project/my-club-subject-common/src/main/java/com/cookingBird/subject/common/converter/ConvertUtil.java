package com.cookingBird.subject.common.converter;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertUtil {
    public static <S, T> List<T> convertList(List<S> sourceList, Function<S, T> converter) {
        return sourceList.stream().map(converter).collect(Collectors.toList());
    }
}
