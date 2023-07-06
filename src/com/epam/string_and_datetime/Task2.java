package com.epam.string_and_datetime;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Напишите программу, которая получает на вход строку и определяет,
 * сколько различных символов в ней содержится.
 */

public class Task2 {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(countUniqueCharacters2(str));
    }

    public static int countUniqueCharacters(String str) {
        Set<Character> uniqueSet = new HashSet<>();
        return (int) IntStream.range(0, str.length())
                .filter(i -> uniqueSet.add(str.charAt(i)))
                .count();
    }

    public static int countUniqueCharacters2(String str) {
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            unique.add(str.charAt(i));
        }
        return unique.size();
    }
}
