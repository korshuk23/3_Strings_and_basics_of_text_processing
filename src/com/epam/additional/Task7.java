package com.epam.additional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Напишите программу, которая получает текущую дату и время и выводит их на экран в формате
 * "dd-MM-yyyy HH:mm:ss".
 * Пример: Вход: (текущая дата и время) Выход: "09-03-2023 11:23:45"
 */
public class Task7 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Текущая дата и время: " + formattedDateTime);
    }
}
