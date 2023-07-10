package com.epam.regex.text_parser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LexemeSorter {
    public List<String> sortByCharacterCount(List<String> paragraphs, char symbol) throws NullPointerException {
        List<String> sortedLexemes = new ArrayList<>();
        for (String paragraph : paragraphs) {
            List<String> sentences = new TextParser().parseSentences(paragraph);
            for (String sentence : sentences) {
                List<String> lexemes = new TextParser().parseLexemes(sentence);
                Comparator<String> byCharacterCount = Comparator.comparingInt(s -> countCharacterOccurrences(s, symbol));
                lexemes.sort(byCharacterCount
                        .reversed()
                        .thenComparing(Comparator.naturalOrder()));
                String sortedLexeme = String.join("\s", lexemes);
                sortedLexemes.add(sortedLexeme);
            }
        }
        return sortedLexemes;
    }

    private static int countCharacterOccurrences(String s, char symbol) {
        int count = 0;
        for (char symb : s.toCharArray()) {
            if (symb == symbol) {
                count++;
            }
        }
        return count;
    }
}
