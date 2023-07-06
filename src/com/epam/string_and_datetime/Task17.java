package com.epam.string_and_datetime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Напишите программу, которая получает на вход строку и находит в ней все числа и выводит их сумму.
 */
public class Task17 {
    public static void main(String[] args) {
        String input = "abc123def456";
        int sum = findSumOfNumbers(input);
        System.out.println("Сумма чисел: " + sum);
    }

    public static int findSumOfNumbers(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            String number = matcher.group();
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}
