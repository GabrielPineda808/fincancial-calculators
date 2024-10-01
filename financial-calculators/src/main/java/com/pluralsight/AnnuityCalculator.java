package com.pluralsight;

import static com.pluralsight.MortgageCalculator.answer;

public class AnnuityCalculator {
    public static void main(String[] args) {
        aCalc();
    }

    public static void aCalc() {
        double payout = answer("Please enter the monthly payout: ");
        double i = answer("Please enter the expected interest rate: ");
        double t = answer("Please enter the years until payout: ");

        pV(payout,i,t);

    }

    public static void pV(double p, double i, double t) {
        double r = i/100 / 12;
        double n = t*12;

        double value = p* (1 -(1 / Math.pow((1+ r),n)) / r);

        System.out.printf("The present value of your Annuity Order is $%.2f", value);
    }

}
