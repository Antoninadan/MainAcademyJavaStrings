package com.mainacad;

import org.apache.commons.lang3.StringUtils;
import com.mainacad.service.NumberManipulationService;

import java.util.Scanner;
import java.util.logging.Logger;

public class ApplicationRunner {
    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {
        String text = "Text tratatat";

        LOGGER.info(text + 7);
        LOGGER.warning("Some warrning");
        LOGGER.severe("Some error");

        int number = 12345;
        LOGGER.info("Sum by division for " + number + " is " + NumberManipulationService.getSumByDivision(number));

        StringBuilder stringBuilder = new StringBuilder("some str builder");
        StringBuffer stringBuffer = new StringBuffer("some str buffer");

        stringBuilder.append("  ,  add some text");
        stringBuffer.append("  ,  add some text");

        LOGGER.info(stringBuilder.toString());
        LOGGER.info(stringBuffer.toString());
        LOGGER.info(stringBuffer.reverse().toString());

        String testText = " abc1de   2fg3h     fghmn";

        String modifiedText = testText.trim();

        LOGGER.info("original " + testText + " trimmed=" + modifiedText);

        modifiedText = testText.replaceAll("1", "");
        LOGGER.info("original " + testText + " without 1=" + modifiedText);

        modifiedText = testText.replaceAll("\\d", "");  //[0..9]
        LOGGER.info("original " + testText + " without all digits=" + modifiedText);

        modifiedText = testText.replaceAll("\\D", "");  // all exsept digits
        LOGGER.info("original " + testText + " all exsept digits=" + modifiedText);

        modifiedText = testText.replaceAll("[a-zA-Z]", "");  // all exsept digits
        LOGGER.info("original " + testText + " [a-zA-Z]=" + modifiedText);


        String name = "\"Antony\"";   // ecranirovanie
        int age = 34;
        double money = 3904.56;
        LOGGER.info(String.format("My name is %s, I'm %d years old \n and my money is %f", name, age, money));  // s, f, d

        String[] words = testText.split(" ");

        LOGGER.info("original " + testText + " dvfcbdx=" + StringUtils.join(words, ", "));

//        // input
//        Scanner sc = new Scanner(System.in);
//        String textInput = sc.nextLine();
//        System.out.println(textInput);

    }
}
