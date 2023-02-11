package com.example.ohce;

import org.apache.logging.log4j.message.Message;

public class OHCE {

        private String value = "";
        //private GetLangInterface getLangInterfacee;

        public OHCE( String value)
        {
            this.value=value;
            //this.getLangInterfacee=getLangInterfacee;
        }


        public String inversedValue()

        {
           String palindrome="";
            int valueLen = this.value.length();
            if(valueLen>0)
            {
                for(int i =0; i < valueLen; ++i)
                {
                    char letter = this.value.charAt(i);
                    palindrome =letter + palindrome;
                }
            }
            return palindrome.toLowerCase();

        }


        public String isPalindromeMessage()
        {
            if(language.equals("fr")){
                return this.value.toLowerCase().equals(this.inversedValue()) ? ResultMessage.SUCCESS_MESSAGE.getFrenchSucessMessage() : this.value;
            }else {
                return this.value.toLowerCase().equals(this.inversedValue()) ? ResultMessage.SUCCESS_MESSAGE.getEnglishSucessMessage() : this.value;
            }

        }

        String language= System.getProperty("user.language");

        public String resultat(Timer timer ){

            String newLine = System.getProperty("line.separator");
            if(language.equals("fr")){

            return customWelcomeMessageFr(timer)+
                    newLine+isPalindromeMessage()+
                    newLine+customFarwelleMessageFr(timer);
            //return getLangInterface+newLine+isPalindromeMessage()+newLine+customFarwelleMessage(timer);
            }else {
                return customWelcomeMessageEng(timer)+
                        newLine+isPalindromeMessage()+
                        newLine+customFarwelleMessageEng(timer);
            }

        }


        public String customWelcomeMessageFr(Timer timer){

            if(timer.getHeureSystem()<14){
               return WelcomeMessage.MATIN.getWelcomeMessageFr();
            } else if (timer.getHeureSystem()>=14 && timer.getHeureSystem()<18) {
                return WelcomeMessage.APRESMIDI.getWelcomeMessageFr();
            } else if (timer.getHeureSystem()>=18 && timer.getHeureSystem()<22) {
               return WelcomeMessage.SOIR.getWelcomeMessageFr();
            } else {
               return WelcomeMessage.NUIT.getWelcomeMessageFr();

            }

        }
        public String customFarwelleMessageFr(Timer timer) {

            if (timer.getHeureSystem() < 14) {
                return FarwellMessage.MATIN.getFarwellMessageFr();
            } else if (timer.getHeureSystem() >= 14 && timer.getHeureSystem() < 18) {
                return FarwellMessage.APRESMIDI.getFarwellMessageFr();
            } else if (timer.getHeureSystem() >= 18 && timer.getHeureSystem() < 22) {
                return FarwellMessage.SOIR.getFarwellMessageFr();
            } else {
                return FarwellMessage.NUIT.getFarwellMessageFr();
            }
        }

            //*****************************************************************************

            public String customWelcomeMessageEng(Timer timer){

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

            public String customFarwelleMessageEng(Timer timer){

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


