package com.epam.string_builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 */
public class Task10 {
    public static void main(String[] args) {
        String x = "First sentence. Second sentence! Third  sentence? Fourth sentence.";
        System.out.println(countSentences(x));
        System.out.println(countSentences2(x));

    }

    private static int countSentences(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' ||
                    str.charAt(i) == '?' ||
                    str.charAt(i) == '!') {
                count++;
            }
        }
        return count;
    }

    private static int countSentences2(String str) {
        Pattern pattern = Pattern.compile("[.!?]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}