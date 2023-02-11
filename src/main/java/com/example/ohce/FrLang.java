package com.example.ohce;

public class FrLang extends Message {


    public FrLang() {
    }


    public String welcomeMessage(Timer timer) {
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
