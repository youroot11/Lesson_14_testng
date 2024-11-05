package org.example;
public class FactorialCalculate {
    public int factorial(int n){
        if (n < 0) {throw new IllegalArgumentException("Нельзя отрицательные числа");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        static int calculateFactorial(int n){
            int result = 1;
            for (int i = 1; i <=n; i ++){
                result*= i;
            }
            return result;
        }

        public static void main(String[] args){
            FactorialCalculate calculator = new FactorialCalculate();
            int number = 13;
            System.out.println("Факториал" + number + "это" + calculator.factorial(number));
        }
    }