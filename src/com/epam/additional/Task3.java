package com.epam.additional;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String str1 = "Silent hill";
        String str2 = "listen";
        String[] str = str1.split("\\s");

        Arrays.stream(str)
                .filter(w -> isAnagram(w, str2))
                .forEach(System.out::println);
    }

    public static boolean isAnagram(String str1, String str2) {
        return Arrays.equals(str1.toLowerCase().chars().sorted().toArray(), str2.chars().sorted().toArray());
    }
}
