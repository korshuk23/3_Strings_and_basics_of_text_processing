package com.epam.string_and_datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Напишите программу, которая получает на вход дату и время в формате "dd-MM-yyyy HH:mm:ss"
 * и добавляет к ней 3 часа, 20 минут и 15 секунд.
 */
public class Task12 {
    public static void main(String[] args) {
        String dateTime = "03-06-2023 10:20:20";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime dateObject = LocalDateTime.parse(dateTime, formatter);
        LocalDateTime modifiedDateTime = dateObject.plusHours(3).plusMinutes(20).plusSeconds(15);
        System.out.println(modifiedDateTime.format(formatter));
    }
}
