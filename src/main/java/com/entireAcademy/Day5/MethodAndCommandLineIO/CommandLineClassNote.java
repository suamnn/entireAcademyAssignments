package com.entireAcademy.Day5.MethodAndCommandLineIO;
import java.util.Scanner;

public class CommandLineClassNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String questionForUser = "What's the password: ";
        System.out.print(questionForUser);
        String password = scanner.nextLine();

        while (!password.contains("hello")) {
            System.out.println("Wrong, try again!");
            System.out.print(questionForUser);
            password = scanner.nextLine();
        }
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum(num1, num2));


    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
