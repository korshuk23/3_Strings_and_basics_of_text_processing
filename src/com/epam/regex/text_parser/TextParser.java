package com.epam.regex.text_parser;

import java.util.Arrays;
import java.util.List;

public class TextParser {
    public List<String> parseParagraph(String text) {
        String[] paragraphs = text.split("\n");
        return Arrays.asList(paragraphs);

    }

    public List<String> parseSentences(String paragraph) {
        String[] sentences = paragraph.split("[.!?]");
        return Arrays.asList(sentences);

    }

    public List<String> parseLexemes(String sentence) {
        String[] lexemes = sentence.trim().replaceAll("[^a-zA-Z]", "\s").split("\s+");
        return Arrays.asList(lexemes);
    }
}
