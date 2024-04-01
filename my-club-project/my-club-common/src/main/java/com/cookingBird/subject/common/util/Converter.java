package com.cookingBird.subject.common.util;

import java.util.List;
import java.util.stream.Collectors;

public class Converter {
    public static <S, T> List<T> A2B(List<S> list) {
        return list.stream()
                .map(a -> (T) a) // 使用强制类型转换将每个元素转换为 B 类型
                .collect(Collectors.toList());
    }
}
