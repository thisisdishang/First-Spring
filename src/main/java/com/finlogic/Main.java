package com.finlogic;

import beans.BubbleSort;
import beans.MessagePrinter;
import config.AppConfig;
import config.ProjectConfig;
import messages.MessageReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class[] configClasses = {AppConfig.class, ProjectConfig.class};
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configClasses);


        MessagePrinter mp = context.getBean(MessagePrinter.class);
        mp.printMessage();

        String value = context.getBean("getName", String.class);
        System.out.println(value);

        MessageReader message = context.getBean(MessageReader.class);
        message.display();

        int[] numbers = {9, 12, 1, 4, 6, 3};
        BubbleSort bubbleSort = context.getBean(BubbleSort.class);
        bubbleSort.sort(numbers);
        Arrays.stream(numbers).forEach(System.out::println);
    }
}