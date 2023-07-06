package com.epam.string_and_datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Напишите программу, которая получает на вход две даты в формате "dd-MM-yyyy"
 * и находит количество дней между ними.
 */
public class Task11 {
    public static void main(String[] args) {
        String inputDate = "03-07-2023";
        String inputDate2 = "08-07-2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Period period = Period.between(LocalDate.parse(inputDate, formatter), LocalDate.parse(inputDate2, formatter));
        System.out.println("Разница в днях: " + period.getDays());
    }
}
