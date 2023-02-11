package com.example.ohce;

public enum ResultMessage {
    SUCCESS_MESSAGE("Well said","Bien dit"),

    ;

    public String getEnglishSucessMessage() {
        return englishSucessMessage;
    }

    public String getFrenchSucessMessage() {
        return frenchSucessMessage;
    }

    ResultMessage(String englishSucessMessage, String frenchSucessMessage) {
        this.englishSucessMessage = englishSucessMessage;
        this.frenchSucessMessage = frenchSucessMessage;
    }

    private String englishSucessMessage;
    private String frenchSucessMessage;

}
