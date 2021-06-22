package com.tengyun.java.jdk.stream;

import java.util.stream.Stream;

/**
 * @author Adam Zhao
 */
public class StreamTest {
    public static void main(String[] args) {
        streamTest1();
    }

    public static void streamTest1() {
        Stream<String> strStream = Stream.of("Java", "Python", "JS");
        strStream.forEach(str -> System.out.println(str));
        strStream.forEach(System.out::println);
    }
}
