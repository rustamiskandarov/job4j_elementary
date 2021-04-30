package ru.job4j;

public class Main {
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int expected2 = 3;
        int result = Converter.rubleToDollar(180);
        boolean passed2 = expected2 == result;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed2);
    }
}