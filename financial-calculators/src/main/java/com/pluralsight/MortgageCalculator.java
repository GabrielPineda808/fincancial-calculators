package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void mortgageCalculator(){
        double p = answer("Please enter the principal amount of your mortgage loan: ");
        double i = answer("Please enter the interest amount of your mortgage loan: ");
        double t = answer("Please enter the term length on your mortgage loan in months: ");
    }

    public static double answer(String message){
        System.out.println(message);
        double ans = scanner.nextDouble();
        return ans;
    }


}
