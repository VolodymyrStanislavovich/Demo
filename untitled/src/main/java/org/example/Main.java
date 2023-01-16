package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(2, 8, 8));
        System.out.println(calculator.sum(2.4f, 8.5f, 8.5f));
    }
}




