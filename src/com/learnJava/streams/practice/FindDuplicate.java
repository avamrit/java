package com.learnJava.streams.practice;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(10,15,14,12,10,14,12);
        Set<Integer> hset = new HashSet<>();
        //Object collect = mylist.stream().filter(e -> !hset.add(e)).collect(Collectors.toList);
        mylist.stream().filter(e -> !hset.add(e)).forEach(System.out::print);

    }
}
