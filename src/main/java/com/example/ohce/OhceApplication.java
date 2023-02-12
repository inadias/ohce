package com.example.ohce;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OhceApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.example.ohce");
        appContext.refresh();

        OHCE show = new OHCE("radar");
        Timer hour= new Timer();

        Message messageEng = (Message) appContext.getBean("engWelcomeMsg");
        Message messageFr = (Message) appContext.getBean("frWelcomeMsg");
        System.out.println("*************************************************");
        System.out.println( show.resultat(hour,messageFr,messageEng));
        System.out.println("*************************************************");


        // TODO PERSONALISATION DES MESSAGE SELON LEUR ET LANGAGE SYSTEM

    }

}
