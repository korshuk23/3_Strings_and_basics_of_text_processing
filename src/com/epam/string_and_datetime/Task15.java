package com.epam.string_and_datetime;

/**
 * Напишите программу, которая получает на вход строку и находит в ней наибольшее количество
 * подряд идущих символов, которые являются гласными буквами.
 */
public class Task15 {
    public static void main(String[] args) {
        String str = "aeiouuuu";
        int longestVowelSubstringLength = findLongestVowelSubstring(str);
        System.out.println("Наибольшая длина подстроки с гласными буквами: " + longestVowelSubstringLength);
    }

    public static int findLongestVowelSubstring(String str) {
        int maxLength = 0;
        int currentLength = 1;

        for (int i = 1; i < str.length(); i++) {
            char currentChar = Character.toLowerCase(str.charAt(i));
            if (isVowel(currentChar) && str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }
        return maxLength;
    }


    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
