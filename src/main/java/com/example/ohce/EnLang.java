package com.example.ohce;

public class EnLang  {

    public EnLang() {
    }

    public String welcomeMessage(Timer timer) {

        if(timer.getHeureSystem()<14){
            return WelcomeMessage.MATIN.getWelcomeMessageEng();
        } else if (timer.getHeureSystem()>=14 && timer.getHeureSystem()<18) {
            return WelcomeMessage.APRESMIDI.getWelcomeMessageEng();
        } else if (timer.getHeureSystem()>=18 && timer.getHeureSystem()<22) {
            return WelcomeMessage.SOIR.getWelcomeMessageEng();
        } else {
            return WelcomeMessage.NUIT.getWelcomeMessageEng();

        }
    }
}
