package com.epam.additional;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Напишите программу, которая получает на вход дату и время в формате "dd-MM-yyyy HH:mm:ss"
 * и проверяет, является ли она выходным днем.
 */
public class Task9 {
    public static void main(String[] args) {
        String inputDateTime = "08-07-2023 11:25:45";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime inputDataObject = LocalDateTime.parse(inputDateTime, formatter);
        DayOfWeek dayOfWeek = inputDataObject.getDayOfWeek();
        boolean isWeekend = dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
        System.out.println(isWeekend);
    }
}
