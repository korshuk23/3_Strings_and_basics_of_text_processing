package com.epam.string_and_datetime;

/**
 * Напишите программу, которая принимает строку и использует StringBuilder
 * для переворачивания каждого слова в этой строке задом наперед.
 */
public class Task25 {
    public static void main(String[] args) {
        String input = "Hello World Java";
        String result = reverseWords(input);
        System.out.println(result);
    }

    public static String reverseWords(String str) {
        String[] words = str.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            wordBuilder.reverse();
            stringBuilder.append(wordBuilder).append(" ");
        }

        return stringBuilder.toString().trim();
    }
}
