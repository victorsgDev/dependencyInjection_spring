package com.example.victor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

       ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

       EmailClient emailClient = context.getBean("emailClient", EmailClient.class);
       emailClient.sendEmail("Este es mi primer email");
       emailClient.sendEmail("Este es mi segundo email");
    }

}
