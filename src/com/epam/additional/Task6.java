package com.epam.additional;

/**
 * Напишите программу, которая получает на вход две строки и определяет,
 * является ли первая строка циклической перестановкой второй строки
 * (т.е. можно ли получить первую строку, циклически сдвигая вторую строку).
 */
public class Task6 {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "cdeab";
        System.out.println(isStringRotation(str1, str2));
    }

    public static boolean isStringRotation(String str1, String str2) {
        return str2.concat(str2).contains(str1) && str1.length() == str2.length();
    }
}
