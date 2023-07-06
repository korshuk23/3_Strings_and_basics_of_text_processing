package com.epam.string_and_datetime;

public class Task16 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        System.out.println("Строка является панграммой: " + isPangram);
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabets = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                alphabets[index] = true;
            }
        }

        for (boolean value : alphabets) {
            if (!value) {
                return false;
            }
        }

        return true;
    }
}
