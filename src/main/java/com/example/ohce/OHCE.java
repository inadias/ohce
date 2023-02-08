package com.example.ohce;

import java.time.LocalTime;

public class OHCE {


        private String value = "";

        public OHCE( String value){
            this.value=value;
        }
        private final String farwell = "Au revoir !!";
        String palindrome = "";
        private final String sucess = " Bien dit";
        LocalTime timeNow = LocalTime.now();
        LocalTime timeLimit = LocalTime.of(13, 30, 0);


        public String lang(GetLangInterface getLangInterface) {
            return getLangInterface.getLang();
        }

        public String checkTime() {
            String morning = "Bonjour";
            String everning = "Bonsoir";
            return this.timeNow.isBefore(this.timeLimit) ? morning : everning;
        }

        public String inversedValue() {
            int valueLen = this.value.length();

            for(int i = 0; i < valueLen; ++i) {
                char letter = this.value.charAt(i);
                this.palindrome = "" + letter + this.palindrome;
            }

            return this.palindrome.toLowerCase();
        }

        public String customMessage() {
            return this.value.toLowerCase().equals(this.inversedValue()) ? "bien dit" : this.value;
        }


    }

