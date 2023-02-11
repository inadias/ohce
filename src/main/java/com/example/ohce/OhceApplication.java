package com.example.ohce;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OhceApplication {

    public static void main(String[] args) {

        OHCE show = new OHCE("radar");
        Timer hour= new Timer();
        FrLang msg =new FrLang();


      // System.out.println(show.resultat(hour,msg.welcomeMessage(hour)));


        System.out.println(show.resultat(hour));




        // TODO PERSONALISATION DES MESSAGE SELON LEUR ET LANGAGE SYSTEM

    }

}
