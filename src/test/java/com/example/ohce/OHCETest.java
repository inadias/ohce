package com.example.ohce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OHCETest {

    @Test
    void inversedValueWithPalindromeValue() {
        String expected ="radar";
        OHCE inversedValue=new OHCE("radar");
        Assertions.assertEquals(expected,inversedValue.inversedValue());
       //Assertions.assertFalse(inversedValue.inversedValue().isEmpty(),expected);
      // Assertions.assertNotNull(expected,inversedValue.inversedValue());

    }
    @Test
    void inversedValueWithNotPalindromeValue() {
        String expected ="ziad";
        OHCE inversedValue=new OHCE("ziad");
        Assertions.assertNotEquals(expected,inversedValue.inversedValue());
    }
    @Test
    void inversedValueIsNotEmpty() {
        String expected ="radar";
        OHCE inversedValue=new OHCE("radar");
        Assertions.assertFalse(inversedValue.inversedValue().isEmpty(),expected);
    }


    @Test
    void getLanguageSystemFr(){
        String expected ="fr";
        OHCE getLanguage=new OHCE("test");
         String getLangsystem=getLanguage.getSystemLanguage();
         assertEquals(expected,getLangsystem);

    }
    @Test
    void getLanguageSystemEn(){
        String expected ="en";
        OHCE getLanguage=new OHCE("test");
        String getLangsystem=getLanguage.getSystemLanguage();
        assertEquals(expected,getLangsystem);

    }
    @Test
    void getLanguageSystemNull(){
        String expected ="en";
        OHCE getLanguage=new OHCE("test");
        String getLangsystem=getLanguage.getSystemLanguage();

        assertNotNull(getLangsystem);

    }


}