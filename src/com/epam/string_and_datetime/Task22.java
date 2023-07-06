package com.epam.string_and_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Task22 {
    public static void main(String[] args) {
        String input = "15-03-2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate inputDate = LocalDate.parse(input, formatter);
        long firstDayOfYear = ChronoUnit.DAYS.between(inputDate.with(TemporalAdjusters.firstDayOfYear()), inputDate) + 1;
        System.out.println(firstDayOfYear);
        // Period period = Period.between(firstDayOfYear,inputDate);
        //System.out.println(period.getDays());
    }
}
