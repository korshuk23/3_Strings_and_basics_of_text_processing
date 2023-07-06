package com.epam.additional;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Напишите программу, которая получает на вход дату и время в формате "dd-MM-yyyy HH:mm:ss"
 * и выводит на экран разницу между ней и текущей датой и временем в минутах.
 */
public class Task8 {
    public static void main(String[] args) {
        String inputDateTime = "06-07-2023 11:25:45";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime inputDataObject = LocalDateTime.parse(inputDateTime, formatter);
        LocalDateTime now = LocalDateTime.now();
        Duration difference = Duration.between(inputDataObject, now);
        System.out.println("Разница в минутах: " + difference.toMinutes());
    }
}
