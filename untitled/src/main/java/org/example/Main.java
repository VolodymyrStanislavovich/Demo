package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter size: ");


        int size = console.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter value: ");
            myArray[i] = console.nextInt();
        }
        for (int x : myArray) {
            System.out.println(" [" + x + "] ");
        }
        System.out.println( );

        System.out.println("Size is: " + size);
    }
}


