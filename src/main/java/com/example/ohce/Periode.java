package com.example.ohce;

public class Periode {


    private int heure;
    private String welcomeMessage;
    private String farwellMessage;


    public int getHeure() {
        return heure;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String getFarwellMessage() {
        return farwellMessage;
    }


    public static class CaseBuilder{
        private int heure;
        private String welcomeMessage;
        private String farwellMessage;


        public CaseBuilder withWelcomeMessage(String message){
            this.welcomeMessage=message;
            return this;
        }
        public CaseBuilder withFarwellMessage(String message){
            this.farwellMessage=message;
            return this;
        }
        public CaseBuilder withHeure(int heure){
            this.heure=heure;
            return this;
        }

        public Periode build(){
            Periode periode= new Periode();
            periode.heure=heure;
            periode.welcomeMessage=welcomeMessage;
            periode.farwellMessage=farwellMessage;

            return periode;
        }

    }




}
