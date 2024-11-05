package org.example;

public class Main {
    public static void main(String[] args){
        FactorialCalculator calculator = new FactorialCalculator();
        int number = 3;
        System.out.println("Факториал " + number +  " это " + calculator.factorial(number));
    }
}
