package com.epam.string_and_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * Напишите программу, которая получает на вход дату в формате "dd-MM-yyyy"
 * и находит первый день месяца, на который выпадает эта дата  и последний.
 */
public class Task19 {
    public static void main(String[] args) {
        String input = "25-07-2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(input, formatter);
        LocalDate firstDay = localDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Первый день месяца: " + firstDay.format(formatter));
        System.out.println("Последний день месяца: " + lastDay.format(formatter));
    }
}
