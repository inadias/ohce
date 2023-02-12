package com.example.ohce;

import org.springframework.stereotype.Component;

@Component("engWelcomeMsg")
public class EnLang implements Message {

    public EnLang(Timer timer) {
        this.timer = timer;
    }
    private Timer timer;
    public String welcomeMessage() {

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

    public String farwellMessage(){

        if(timer.getHeureSystem()<14){
            return FarwellMessage.MATIN.getFarwellMessageEng();
        } else if (timer.getHeureSystem()>=14 && timer.getHeureSystem()<18) {
            return FarwellMessage.APRESMIDI.getFarwellMessageEng();
        } else if (timer.getHeureSystem()>=18 && timer.getHeureSystem()<22) {
            return FarwellMessage.SOIR.getFarwellMessageEng();
        } else {
            return FarwellMessage.NUIT.getFarwellMessageEng();

        }

    }
}
