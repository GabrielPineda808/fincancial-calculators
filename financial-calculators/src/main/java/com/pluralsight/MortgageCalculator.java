package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void mortgageCalculator(){
        double p = principalMortgage();
    }
    public static double principalMortgage(){
        System.out.println("Please enter the principal amount of your mortgage loan: ");
        double ans = scanner.nextDouble();
        return ans;
    }
}
