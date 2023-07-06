package com.epam.string_and_datetime;

/**
 * Напишите программу, которая получает на вход строку и заменяет в ней
 * все вхождения одного символа на другой символ.
 */
public class Task5 {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str.replaceAll("l","x"));
    }
}
