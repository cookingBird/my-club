package com.cookingBird.subject.infra.convert;


import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertUtils {
    public static <S, T> List<T> convertList(List<S> sourceList, Function<S, T> converter) {
        return sourceList.stream().map(converter).collect(Collectors.toList());
    }
}
