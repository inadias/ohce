package com.example.ohce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimerTest {

    @Test
    void getHeureSystemNotNull() {
        Timer timeSystem =new Timer();
        int hourSystem= timeSystem.getHeureSystem();
        Assertions.assertNotNull(hourSystem);

    }

    @Test
    void getHeureSystemNotNegative() {

        Timer timeSystem =new Timer();
        int hourSystem= timeSystem.getHeureSystem();
       Assertions.assertTrue(hourSystem>0, String.valueOf(hourSystem));



    }
}