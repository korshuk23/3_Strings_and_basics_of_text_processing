package com.epam.regex.xml_parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlParser {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
        String parsedString = xmlAnalyzer(xml);
        System.out.println(parsedString);
    }

    private static String xmlAnalyzer(String xml) {
        String[] lines = xml.split(" ");
        Pattern pOpen = Pattern.compile("<([^/].+?>)");
        Pattern pClose = Pattern.compile("(</.+?>)");
        Pattern pBody = Pattern.compile("(<[^/].+?>)(.+?)(</.+?>)");
        Pattern pWithoutBody = Pattern.compile("<(.+?/)>");

        Matcher mOpen = pOpen.matcher(xml);
        Matcher mClose = pClose.matcher(xml);
        Matcher mBody = pBody.matcher(xml);
        Matcher mWithoutBody = pWithoutBody.matcher(xml);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < lines.length * 3; i++) {
            if (mOpen.find()) {
                stringBuilder.append(mOpen.group())
                        .append(" - open tag\n");
            } else if (mClose.find()) {
                stringBuilder.append(mClose.group())
                        .append(" - closed tag\n");
            } else if (mBody.find()) {
                stringBuilder.append(mBody.group())
                        .append(" - body of tag\n");
            } else if (mWithoutBody.find()) {
                stringBuilder.append(mWithoutBody.group())
                        .append(" - tag without body\n");
            }
        }
        return stringBuilder.toString();
    }
}
