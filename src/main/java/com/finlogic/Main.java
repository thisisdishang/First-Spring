package com.finlogic;

import beans.MessagePrinter;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessagePrinter mp = context.getBean(MessagePrinter.class);
        mp.printMessage();
    }
}