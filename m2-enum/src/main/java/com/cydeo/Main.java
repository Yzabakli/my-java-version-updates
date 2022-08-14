package com.cydeo;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;

        System.out.println(c);

        System.out.println(Currency.PENNY);

        System.out.println("How to get all constant");
        Currency[] currencies = Currency.values();

        for (Currency currency : currencies) {

            System.out.println(currency);
        }

        System.out.println("How to use switch-case with enums");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;

            case NICKLE:
                System.out.println("It is 5 cent");
                break;

            case DIME:
                System.out.println("It is 10 cent");
                break;

            case QUARTER:
                System.out.println("It is 25 cent");
        }

        System.out.println(calculate(12, Operation.DIVIDE, 4));

    }
    private static int calculate(int number1, Operation operator, int number2){

        switch (operator){
            case PLUS:
                return number1 + number2;

            case MINUS:
                return number1 - number2;

            case DIVIDE:
                return number1 / number2;

            case MULTIPLY:
                return number1 * number2;
        }

        return 0;
    }
}