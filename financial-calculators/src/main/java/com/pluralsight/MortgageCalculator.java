package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mortgageCalculator();
    }
    public static void mortgageCalculator(){
        double p = answer("Please enter the principal amount of your mortgage loan: ");
        double i = answer("Please enter the interest amount of your mortgage loan: ");
        double t = answer("Please enter the term length on your mortgage loan in years: ");
        monthly(p,i,t);

    }

    public static double answer(String message){
        System.out.println(message);
        double ans = scanner.nextDouble();
        return ans;
    }

    public static void monthly(double p, double i, double t){
        double n = t*12;
        double r = (i/100)/12;
        double top = r*Math.pow((1+r), n);
        double bottom = Math.pow((1+r),n) -1;
        double fract = top / bottom;
        double monthly = (p*fract);

        System.out.printf("Your monthly payment is $%.2f", monthly);
    }

    public static void totalInterest(){

    }



}
