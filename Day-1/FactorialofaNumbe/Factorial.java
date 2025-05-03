package FactorialofaNumbe;

public class Factorial {

    public static void main(String[] args) {
        int number = 6;
        int value = 1;

        for (int i = 1; i <= number; i++) {
            value = value * i;
        }
        System.out.println(value);
    }
}