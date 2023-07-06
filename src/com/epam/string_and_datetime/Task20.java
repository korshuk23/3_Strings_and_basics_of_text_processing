package com.epam.string_and_datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Напишите программу, которая получает на вход две даты в формате "dd-MM-yyyy"
 * и находит количество месяцев между ними.
 */
public class Task20 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate firstDateObject = LocalDate.parse("06-02-2023", formatter);
        LocalDate secondDateObject = LocalDate.parse("06-07-2023", formatter);
        Period period = Period.between(firstDateObject, secondDateObject);
        System.out.println(period.getMonths());
    }
}
