package com.example.ohce;

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

       /* public String resultat(Timer timer){

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
        */

    public String resultat(Timer timer, Message messageFr,Message messageEng){

        String newLine = System.getProperty("line.separator");
        if(language.equals("fr")){

            return messageFr.welcomeMessage()+
                    newLine+isPalindromeMessage()+
                    newLine+messageFr.farwellMessage();
            //return getLangInterface+newLine+isPalindromeMessage()+newLine+customFarwelleMessage(timer);
        }else {
            return messageEng.welcomeMessage()+
                    newLine+isPalindromeMessage()+
                    newLine+messageEng.farwellMessage();
        }

    }









}


