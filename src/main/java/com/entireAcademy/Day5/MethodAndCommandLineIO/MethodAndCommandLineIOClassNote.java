package com.entireAcademy.Day5.MethodAndCommandLineIO;

import java.util.Arrays;

public class MethodAndCommandLineIOClassNote {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
//        System.out.println(sum(a, b));
//        System.out.println(greetUser("Bishal"));
//            System.out.println(max(a,b));
            System.out.println(factorial(5));


    }

    public static int sum(int a, int b) {
        int addAndB = a + b;
        return addAndB;
    }

    public static int subtract(int b, int a) {
        int addAndB = b - a;
        return addAndB;
    }

    public static String greetUser(String name) {
        return "Hello " + name + "!";
    }

    public static int max(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int factorial(int number){
        int result = 1;
        for(int i = 1; i <= number; i++){
            result *= i;
        }
        return result;
    }


}
