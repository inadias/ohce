package com.example.ohce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("frWelcomeMsg")
public class FrLang implements Message {
    private final Timer timer;
    public FrLang(Timer timer) {
        this.timer = timer;

    }



    public String welcomeMessage() {
        if(timer.getHeureSystem()<14){
            return WelcomeMessage.MATIN.getWelcomeMessageFr();
        } else if (timer.getHeureSystem()>=14 && timer.getHeureSystem()<18) {
            return WelcomeMessage.APRESMIDI.getWelcomeMessageFr();
        } else if (timer.getHeureSystem()>=18 && timer.getHeureSystem()<22) {
            return WelcomeMessage.SOIR.getWelcomeMessageFr();
        } else {
            return WelcomeMessage.NUIT.getWelcomeMessageFr();

        }
    }

}
