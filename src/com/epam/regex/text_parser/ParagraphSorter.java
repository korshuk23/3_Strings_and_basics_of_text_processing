package com.epam.regex.text_parser;

import java.util.Comparator;
import java.util.List;

public class ParagraphSorter {
    public List<String> sortBySentenceCount(List<String> paragraphs) {
        paragraphs.sort(Comparator.comparingInt(this::getSentenceCount));
        return paragraphs;
    }

    private int getSentenceCount(String paragraph) {
        List<String> sentences = new TextParser().parseSentences(paragraph);
        return sentences.size();
    }
}
