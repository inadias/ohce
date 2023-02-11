package com.example.ohce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OhceApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void inversedValue(){
        String intialValue="ana";
        Object getLang;

        OHCE iversevalue1=new OHCE(intialValue);
        OHCE iversevalue2=new OHCE("ziad");
        String resultat1= iversevalue1.inversedValue();
        String resultat2= iversevalue1.inversedValue();
        Assertions.assertEquals(intialValue,resultat1);
        Assertions.assertNotEquals(intialValue,resultat2);

    }

}
