package com.pluralsight;
import static com.pluralsight.MortgageCalculator.answer;
import java.util.Scanner;

public class CDFV {
    public static void main(String[] args) {
        CDcalc();
    }

    public static void CDcalc(){
        System.out.println("Welcome to the CD Future Value calculator! Enjoy!:)\n");
        double p = answer("Please enter the amount you deposited: ");
        double  i = answer("\nPlease enter the interest amount: ");
        double t = answer("\nPlease enter the term length in years: ");

        value(p,i,t);

    }

    public static void value(double p, double i, double t){
        double n = 365;
        double r = i/100;
        double fv = p*(Math.pow((1+(r/n)),(n*t)));
        double intMade = fv - p;

        System.out.printf("\nThe end balance of your CD would be $%.2f",fv);

        System.out.printf("The total interest earned on your deposit is $%.2f\n", intMade);

    }
}