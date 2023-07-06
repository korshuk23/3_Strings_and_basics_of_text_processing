package com.epam.string_and_datetime;

import java.util.stream.IntStream;

/**
 * Напишите программу, которая получает на вход строку и определяет,
 * является ли она полиндромом, если игнорировать пробелы, знаки препинания и регистр символов.
 */
public class Task18 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama!";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        String formattedString = str.replaceAll("[\\s,!]+", "").toLowerCase();
        return IntStream.range(0, str.length() / 2)
                .allMatch(i -> formattedString.charAt(i) == formattedString.charAt(formattedString.length() - i - 1));
    }
}
