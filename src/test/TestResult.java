package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int m=5;
        int n=6;
        System.out.println("Функция Акермана для чисел "+n+" і " +m+ " це "+Exercise.Calculate(n,m));
    }
}
