package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Enter your first number: ");
        num1 = input.nextInt();

        System.out.print("Enter your second number: ");
        num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

        int sub = num1 - num2;
        System.out.println(sub);

        int multiple = num1 * num2;
        System.out.println(multiple);

        float division = (float) num1 / num2;
        System.out.println(division);

        int modulus = num1 % num2;
        System.out.println(modulus);


    }
}
