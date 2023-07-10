package com.epam.regex.text_parser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WordSorter {
    public List<String> sortByLength(List<String> paragraphs) {
        List<String> sortedSentences = new ArrayList<>();
        for (String paragraph : paragraphs) {
            List<String> sentences = new TextParser().parseSentences(paragraph);
            for (String sentence : sentences) {
                List<String> lexemes = new TextParser().parseLexemes(sentence);
                lexemes.sort(Comparator.comparingInt(String::length));
                String sortedSentence = String.join(" ", lexemes);
                sortedSentences.add(sortedSentence);
            }
        }
        return sortedSentences;
    }
}
