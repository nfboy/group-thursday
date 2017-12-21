package com.group.dubbo.consumer;

import com.group.dubbo.service.MergeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MergeConsumer1 {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("merge-consumer1.xml");
        context.start();
        MergeService mergeService = (MergeService) context.getBean("mergeService");
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            try{
                List<String> result = mergeService.mergeResult();
                System.out.println("(" + i +")" + result);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
