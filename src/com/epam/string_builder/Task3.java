package com.epam.string_builder;

import java.util.stream.IntStream;

/**
 * 3. Проверить, является ли заданное слово палиндромом.
 */
public class Task3 {
    public static void main(String[] args) {
        String[] words = {"madam", "level", "abcbba"};
        printResult(words);
    }

    private static void printResult(String[] words) {
        for (String word : words) {
            String result = isPalindrome(word) ? " - palindrome" : " - not palindrome";
            System.out.println(word + result);
        }
    }
    public static boolean isPalindrome(String word) {
        return IntStream.range(0, word.length() / 2)
                .allMatch(i -> word.charAt(i) == word.charAt(word.length() - i - 1));
    }
    public static boolean isPalindrome2(String word) {
        for (int i = 0; i < (word.length() / 2); ++i) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
