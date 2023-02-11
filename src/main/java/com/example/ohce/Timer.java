package com.example.ohce;

import java.time.LocalTime;

public class Timer {

   private LocalTime timeNow = LocalTime.now();

    LocalTime timeLimit = LocalTime.of(13,00);

    public int getHeureSystem() {
        return this.timeNow.getHour();


    }

}
