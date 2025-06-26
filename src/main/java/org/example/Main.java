package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int option = 0;
        float amountToConvert = 0;

        Scanner number = new Scanner(System.in);
        SearchCurrency consulta =  new SearchCurrency();

        System.out.println("***Welcome to the Currency Converter App!***");

        do{
            System.out.println("***Options***");
            System.out.println("1. Dolar to brazilian real");
            System.out.println("2. Brazilian real to dolar");
            System.out.println("3. Dolar to argentine peso");
            System.out.println("4. Argentine peso to dolar");
            System.out.println("5. Brazilian real to argentine peso");
            System.out.println("6. Argentine peso to brazilian real");
            System.out.println("7. Exit");
            System.out.println("***Please choice an option***");


            option = number.nextInt();

            if(option > 0 && option <= 7){


                switch (option){
                    case 1:
                        System.out.println("Please write the amount to convert");
                        amountToConvert = number.nextFloat();

                        PairConversion pairConversion = consulta.USDtoBRL(amountToConvert);
                        System.out.println("Dolars " + amountToConvert + " is equals to " + pairConversion.conversion_result() + " brazilian real");
                        break;
                    case 2:
                        System.out.println("Please write the amount to convert");
                        amountToConvert = number.nextFloat();

                        PairConversion pairConversion2 = consulta.BRLtoUSD(amountToConvert);
                        System.out.println("Brazilian real " + amountToConvert + " is equals to " + pairConversion2.conversion_result() + " dolars");
                        break;
                    case 3:
                        System.out.println("Please write the amount to convert");
                        amountToConvert = number.nextFloat();

                        PairConversion pairConversion3 = consulta.USDtoARS(amountToConvert);
                        System.out.println("Dolars " + amountToConvert + " is equals to " + pairConversion3.conversion_result() + " argentine peso");
                        break;
                    case 4:
                        System.out.println("Please write the amount to convert");
                        amountToConvert = number.nextFloat();

                        PairConversion pairConversion4 = consulta.ARStoUSD(amountToConvert);
                        System.out.println("Argentine peso " + amountToConvert + " is equals to " + pairConversion4.conversion_result() + " dolars");
                        break;
                    case 5:
                        System.out.println("Please write the amount to convert");
                        amountToConvert = number.nextFloat();

                        PairConversion pairConversion5 = consulta.BRLtoARS(amountToConvert);
                        System.out.println("Brazilian real " + amountToConvert + " is equals to " + pairConversion5.conversion_result() + " argentine peso");
                        break;
                    case 6:
                        System.out.println("Please write the amount to convert");
                        amountToConvert = number.nextFloat();

                        PairConversion pairConversion6 = consulta.ARStoBRL(amountToConvert);
                        System.out.println("Argentine peso " + amountToConvert + " is equals to " + pairConversion6.conversion_result() + " brazilian real");
                        break;

                    default:
                        System.out.println("You've exited the app! See you later!");
                        break;
                }

            } else {
                System.out.println("Invalid option, please try again");
            }


        } while (option > 0 && option < 7);

        number.close();

    }
}