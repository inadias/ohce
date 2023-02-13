package com.example.ohce;

import java.util.Scanner;

public class InputCli {





    private String value;

    public String inputValue() {
        Scanner inputCli = new Scanner(System.in);
        System.out.println("Entrez un mot :");
        this.value = inputCli.nextLine();
        while (value.isEmpty())
        {
            System.out.println("Entrez un mot :");
            this.value = inputCli.nextLine();
        }
        return this.value;
    }


}
