package com.example.ohce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OhceApplication {

    public static void main(String[] args) {
        Enlang lang= new Enlang();
        OHCE show = new OHCE("rzadar");
        System.out.println(show.lang(lang));
        System.out.println(show.checkTime());
        System.out.println(show.customMessage());;
        // TODO PERSONALISATION DES MESSAGE SELON LEUR ET LANGAGE SYSTEM
        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("user.language"));
    }

}
