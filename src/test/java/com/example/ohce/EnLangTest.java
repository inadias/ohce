package com.example.ohce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnLangTest {

    @Test
    void welcomeMessageBefore_14h() {
        Timer timer = new Timer();
            int hour = timer.getHeureSystem();
        EnLang messageInEnglish = new EnLang(timer);

        String welcomeMsg =messageInEnglish.welcomeMessage();
        System.out.println(welcomeMsg);
        Assertions.assertFalse((hour>4 && hour<14),welcomeMsg);
    }
    @Test
    void welcomeMessageBetween_14_18() {
        Timer timer = new Timer();
            int hour = timer.getHeureSystem();
        EnLang messageInEnglish = new EnLang(timer);

        String welcomeMsg =messageInEnglish.welcomeMessage();
        Assertions.assertFalse(( hour>14 && hour<18 ), welcomeMsg);
    }
    @Test
    void welcomeMessageBetween_18_22() {
        Timer timer = new Timer();
            int hour = timer.getHeureSystem();
        EnLang messageInEnglish = new EnLang(timer);

        String welcomeMsg =messageInEnglish.welcomeMessage();
        Assertions.assertFalse(( hour>=18 && hour<22 ),welcomeMsg);
    }
    @Test
    void welcomeMessageAfter_22_before_14() {
        Timer timer = new Timer();
            int hour = timer.getHeureSystem();
        EnLang messageInEnglish = new EnLang(timer);

        String welcomeMsg =messageInEnglish.welcomeMessage();
        System.out.println(welcomeMsg);
        Assertions.assertTrue(!( hour>=22 && hour<6 ),welcomeMsg);
    }



    @Test
    void farwellMessage() {

    }
}