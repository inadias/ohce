package com.example.ohce;

public enum FarwellMessage {
    MATIN("auRevoir_am","Good bye morning",8),
    APRESMIDI("auRevoir_pm","Good bye afternoon",14),
    SOIR("auRevoir_soir","Good bye evening",18),
    NUIT("auRevoir_nuit","Good bye night",22);

    public String getFarwellMessageFr() {
        return farwellMessageFr;
    }

    private String farwellMessageFr;

    public String getFarwellMessageEng() {
        return farwellMessageEng;
    }

    private String farwellMessageEng;
    private int heure;
    FarwellMessage(String farwellMessageFr,String farwellMessageEng,int heure) {
        this.farwellMessageFr=farwellMessageFr;
        this.farwellMessageEng=farwellMessageEng;
        this.heure=heure;
    }
}
