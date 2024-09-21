package com.example;

import java.util.*;

public class SPEMiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------- Welcome to Calculator Program - SPE Mini Project ---------");
        System.out.println("");
        System.out.println("-------- Please Enter the Operation Code: ------------");
        System.out.println("1. Square Root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural Logarithm");
        System.out.println("4. Power");
        System.out.println("0. Exit");

        System.out.println("");
        
        while(true){
            System.out.print("Enter the Operation Code: ");
            int op = sc.nextInt();

            if(op == 0){
                System.out.println("Exiting the Program...");
                break;
            }

            double n1, n2;
            switch(op){
                case 1:
                    System.out.print("Enter the number: ");
                    n1 = sc.nextDouble();
                    System.out.println("Square Root of " + n1 + " is: " + Square_Root(n1));
                    break;
                case 2:
                    System.out.print("Enter the number: ");
                    n1 = sc.nextDouble();
                    System.out.println("Factorial of " + n1 + " is: " + Factorial((int)n1));
                    break;
                case 3:
                    System.out.print("Enter the number: ");
                    n1 = sc.nextDouble();
                    System.out.println("Natural Logarithm of " + n1 + " is: " + Logarithm(n1));
                    break;
                case 4:
                    System.out.print("Enter the number: ");
                    n1 = sc.nextDouble();
                    System.out.print("Enter the power: ");
                    n2 = sc.nextDouble();
                    System.out.println(n1 + " raised to the power " + n2 + " is: " + Power(n1, n2));
                    break;
                default:
                    System.out.println("Invalid Operation Code. Please try again.");
            }
        }

        sc.close();
    }

    public static int Factorial(int n1){
        if(n1 < 0){
            return -1;
        }

        int res=1;

        for(int i=1;i<=n1;i++) res*=i;
        
        return res;
    }

    public static double Square_Root(double n1){
        if(n1 < 0){
            return Double.NaN;
        }

        double res = Math.sqrt(n1);
        return res;
    }

    public static double Power(double n1, double n2){
        double res = Math.pow(n1, n2);
        return res;
    }

    public static double Logarithm(double n1){
        if(n1 < 0){
            return Double.NaN;
        }

        double res = Math.log(n1);
        return res;
    }
}