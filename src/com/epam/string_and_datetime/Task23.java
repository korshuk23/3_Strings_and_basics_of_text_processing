package com.epam.string_and_datetime;

/**
 * Напишите программу, которая принимает две строки и использует StringBuffer
 * для объединения этих строк в одну строку. При этом все символы из второй строки,
 * которые встречаются в первой строке, должны быть удалены.
 */
public class Task23 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result = mergeStrings(str1, str2);
        System.out.println(result);
    }

    private static String mergeStrings(String str1, String str2) {
        StringBuffer stringBuffer = new StringBuffer(str1);
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (stringBuffer.indexOf(String.valueOf(ch)) == -1) {
                stringBuffer.append(ch);
            }
        }
        return stringBuffer.toString();
    }
}
