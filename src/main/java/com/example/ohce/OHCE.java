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

        public String getSystemLanguage(){
            return   System.getProperty("user.language");
        }

        public String isPalindromeMessage()
        {
            if(getSystemLanguage().equals("fr")){
                return this.value.toLowerCase().equals(this.inversedValue()) ? ResultMessage.SUCCESS_MESSAGE.getFrenchSucessMessage() : this.value;
            }else {
                return this.value.toLowerCase().equals(this.inversedValue()) ? ResultMessage.SUCCESS_MESSAGE.getEnglishSucessMessage() : this.value;
            }

        }



        public String resultat(Message messageFr,Message messageEng){

            String newLine = System.getProperty("line.separator");
            if(getSystemLanguage().equals("fr")){

                return messageFr.welcomeMessage()+
                        newLine+isPalindromeMessage()+
                        newLine+messageFr.farwellMessage();
            }else {
                return messageEng.welcomeMessage()+
                        newLine+isPalindromeMessage()+
                        newLine+messageEng.farwellMessage();
            }

         }


}


