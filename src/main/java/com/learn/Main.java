package com.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean("parrot3",Parrot.class);
        System.out.println(p.getName());


    }
}