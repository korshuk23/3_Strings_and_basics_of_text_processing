package com.epam.string_and_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Напишите программу, которая получает на вход дату в формате "dd-MM-yyyy"
 * и находит дату следующего понедельника.
 */
public class Task13 {
    public static void main(String[] args) {
        String date = "06-07-2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateObject = LocalDate.parse(date, formatter);
        DayOfWeek dayOfWeek = dateObject.getDayOfWeek();
        int daysToAdd = DayOfWeek.MONDAY.getValue() - dayOfWeek.getValue() + 7;
        LocalDate nextMonday = dateObject.plusDays(daysToAdd);
        System.out.println(nextMonday.format(formatter));
    }
}
