package com.epam.additional;

/**
 * Напишите программу, которая получает на вход строку и выводит на экран все ее подстроки.
 */
public class Task14 {
    public static void main(String[] args) {
        String input = "abcd";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
