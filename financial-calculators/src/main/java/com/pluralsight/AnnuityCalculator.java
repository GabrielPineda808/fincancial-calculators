package com.pluralsight;

import static com.pluralsight.MortgageCalculator.answer;

public class AnnuityCalculator {
    public static void main(String[] args) {
        aCalc();
    }

    public static void aCalc() {
        System.out.println("Welcome to the Ordinary Annuity Present Value calculator! Enjoy!:)\n");
        double payout = answer("Please enter the monthly payout: ");
        double i = answer("\nPlease enter the expected interest rate: ");
        double t = answer("\nPlease enter the years until payout: ");

        pV(payout,i,t);

    }

    public static void pV(double p, double i, double t) {
        double r = i/100 / 12;
        double n = t*12;

        double value = p* ((1 -(1 / Math.pow((1+ r),n))) / r);

        System.out.printf("\nThe present value of your Annuity Order is $%.2f\n", value);
    }

}
