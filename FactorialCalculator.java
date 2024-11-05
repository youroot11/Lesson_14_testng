package org.example;
public class FactorialCalculator {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Нельзя отрицательные числа");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static void main (String[]args){
            FactorialCalculator calculator = new FactorialCalculator();
            int number = 12;
            System.out.println("Факториал " + number + " это " + calculator.factorial(number));
        }
    }