package com.cookingBird.subject.application.job;

import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // 创建一个整数列表
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 使用reduce方法计算所有整数的平方和
        Optional<Integer> sumOfSquares1 = Arrays.stream(numbers)
                .reduce((acc, num) -> {
                    System.out.println("acc: " + acc);
                    return acc + num * num;
                });

        // 使用reduce方法计算所有整数的平方和
        Integer sumOfSquares2 = Arrays.stream(numbers)
                .reduce(
                        0,
                        (acc, num) -> {
                            System.out.println("acc: " + acc);
                            return acc + num * num;
                        }
                );
        // 使用reduce方法计算所有整数的平方和
        Integer sumOfSquares3 = Arrays.stream(numbers)
                .parallel() // 将流转换为并行流
                .reduce(
                        // 初始值为0
                        0,
                        // 副作用函数，这里是计算每个整数的平方并加上初始值再放到结果集中
                        (acc, num) -> {
                            System.out.println("acc: " + acc);
                            return acc + num * num;
                        },
                        // 组合器函数，用于将并行计算结果合并
                        (pre, cur) -> {
                            System.out.println("pre: " + pre + " , " + "cur: " + cur);
                            return pre.intValue() + cur.intValue();
                        }
                );

        System.out.println("Sum of sumOfSquares1: " + sumOfSquares1);
        System.out.println("Sum of sumOfSquares2: " + sumOfSquares2);
        System.out.println("Sum of sumOfSquares3: " + sumOfSquares3);
    }

}
