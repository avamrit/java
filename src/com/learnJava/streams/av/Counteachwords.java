package com.learnJava.streams.av;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counteachwords {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ram","sam","ram","tom","tom","dev");
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
