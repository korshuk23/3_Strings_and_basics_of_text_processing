package com.epam.additional;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Напишите программу, которая получает на вход дату в формате "dd-MM-yyyy"
 * и выводит на экран день недели, на который выпадает эта дата.
 */
public class Task10 {
    public static void main(String[] args) {
        String inputDateTime = "07-07-2023 11:25:45";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime inputDataObject = LocalDateTime.parse(inputDateTime, formatter);
        DayOfWeek dayOfWeek = inputDataObject.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
