package com.example.ohce;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OhceApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.example.ohce");
        appContext.refresh();
        InputCli cli= new InputCli();
        OHCE show = new OHCE(cli.inputValue());
        Message messageEng = (Message) appContext.getBean("engWelcomeMsg");
        Message messageFr = (Message) appContext.getBean("frWelcomeMsg");
        System.out.println("*************************************************");
        System.out.println( show.resultat(messageFr,messageEng));
        System.out.println("*************************************************");

    }

}
