package com.example.ohce;

import org.springframework.stereotype.Component;

import java.time.LocalTime;
@Component("timer")
public class Timer implements TimerInterface {

   private LocalTime timeNow = LocalTime.now();
    public int getHeureSystem() {
        return this.timeNow.getHour();
    }

}
