package com.group.dubbo.service.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MergeProvider2 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("merge-provider2.xml");
        context.start();
        System.in.read();
    }
}
