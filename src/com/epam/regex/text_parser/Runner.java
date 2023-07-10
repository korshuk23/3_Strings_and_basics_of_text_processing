package com.epam.regex.text_parser;

import java.util.List;

/**
 * 1.Cоздать приложение,разбирающее текст(текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,а в случае равенства – по
 * алфавиту.
 */
public class Runner {
    public static void main(String[] args) {
        String myText = "   Unbundling is the division of a complete system into parts, each of which can work autonomously." +
                " For example, Facebook has one single application, but also has Messenger - an application related to" +
                " the main program, but made into a separate product, for more convenient messaging. The term is " +
                "translated from English \"separation\".\n" +
                "   Debug - search for errors in the written code and their further correction.\n" +
                "   Deploy - publishing the written and tested code to the server for its further use. It is the" +
                "final stage of development. After placing the code, its program becomes available to all users.\n" +
                "   Code review - rechecking the code - is an assessment of the correctness of writing the code and its" +
                "compliance with the task and goals of the company." +
                "In fact, this is to prevent the transition of code to legacy.\n";
        ParagraphSorter paragraphSorter = new ParagraphSorter();
        WordSorter wordSorter = new WordSorter();
        LexemeSorter lexemeSorter = new LexemeSorter();

        List<String> paragraphs = new TextParser().parseParagraph(myText);

        paragraphSorter.sortBySentenceCount(paragraphs).forEach(System.out::println);
        wordSorter.sortByLength(paragraphs).forEach(System.out::println);
        lexemeSorter.sortByCharacterCount(paragraphs, 'r').forEach(System.out::println);
    }
}
