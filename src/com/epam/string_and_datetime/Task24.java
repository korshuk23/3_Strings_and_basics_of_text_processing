package com.epam.string_and_datetime;

/**
 * Напишите программу, которая принимает строку и использует StringBuilder
 * для удаления всех цифр из этой строки.
 */
public class Task24 {
    public static void main(String[] args) {
        String input = "Hello123World456";
        String result = removeDigits(input);
        System.out.println(result);
    }

    public static String removeDigits(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        int i = 0;
        while (i < stringBuilder.length()) {
            char ch = stringBuilder.charAt(i);
            if (Character.isDigit(ch)) {
                stringBuilder.deleteCharAt(i);
            } else {
                i++;
            }
        }
        return stringBuilder.toString();
    }
}