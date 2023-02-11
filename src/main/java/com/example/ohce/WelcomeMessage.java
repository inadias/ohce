package com.example.ohce;

public enum WelcomeMessage {
    MATIN("Bonjour_am","Good_Morning_am",8),
    APRESMIDI("Bonjour_pm","Good morning_pm",14),
    SOIR("Bonjour_soir","Good_Evening",18),
    NUIT("Bonjour_nuit","Good_Night",22);



    public int getHeure() {
        return heure;
    }

    public String getWelcomeMessageEng() {
        return welcomeMessageEng;
    }

    public String getWelcomeMessageFr() {
        return welcomeMessageFr;
    }

    private String welcomeMessageEng;
    private String welcomeMessageFr;

    private int heure;
    WelcomeMessage(String welcomeMessageFr,String welcomeMessageEng,int heure) {
        this.welcomeMessageFr=welcomeMessageFr;
        this.welcomeMessageEng=welcomeMessageEng;
        this.heure=heure;
    }
}
