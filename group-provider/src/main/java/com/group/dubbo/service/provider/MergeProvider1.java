package com.group.dubbo.service.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MergeProvider1 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("merge-provider1.xml");
        context.start();
        System.in.read();
    }
}

