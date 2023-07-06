package com.epam.string_builder;


import java.util.HashSet;
import java.util.Set;

/**
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
 * def", то должно быть выведено "abcdef".
 */
public class Task7 {
    public static void main(String[] args) {
        String str = " aa bf sffd ade ";
        System.out.println("without spaces: " + removeDuplicatesAndSpaces(str));
    }

    private static String removeDuplicatesAndSpaces(String str) {
        HashSet<String> uniqueSet = new HashSet<>();
        String strWithoutSpaces = str.replaceAll(" ", "");
        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < strWithoutSpaces.length(); i++) {
            if (uniqueSet.add(String.valueOf(strWithoutSpaces.charAt(i)))) {
                resultStr.append(strWithoutSpaces.charAt(i));
            }
        }
        return resultStr.toString();
    }
}
