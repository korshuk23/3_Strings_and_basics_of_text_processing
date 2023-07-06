package com.epam.string_and_datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * Напишите программу, которая получает на вход дату в формате "dd-MM-yyyy"
 * и находит, сколько дней осталось до конца месяца.
 */
public class Task21 {
    public static void main(String[] args) {
        String input = "20-06-2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate inputDate = LocalDate.parse(input, formatter);
        LocalDate lastDay = inputDate.with(TemporalAdjusters.lastDayOfMonth());
        Period period = Period.between(inputDate, lastDay);
        System.out.println(period.getDays());
    }
}
