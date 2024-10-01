package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mortgageCalculator();
    }
    public static void mortgageCalculator(){
        System.out.println("Welcome to the Mortgage calculator! Enjoy!:)\n");
        double p = answer("Please enter the principal amount of your mortgage loan: ");
        double i = answer("\nPlease enter the interest amount of your mortgage loan: ");
        double t = answer("\nPlease enter the term length on your mortgage loan in years: ");
        monthly(p,i,t);

    }

    public static double answer(String message){
        System.out.println(message);
        double ans = scanner.nextDouble();
        return ans;
    }

    public static void monthly(double p, double i, double t){
        double n = t*12;
        double r = i/100/12;

        double monthly = p*((r*Math.pow((1+r), n)) / (Math.pow((1+r),n) -1));

        double totalInterest = (monthly*12) * 15 - p;

        System.out.printf("\nYour monthly payment is $%.2f", monthly);
        System.out.printf("\nThe total interest paid on this loan is $%.2f\n", totalInterest);
    }



}
