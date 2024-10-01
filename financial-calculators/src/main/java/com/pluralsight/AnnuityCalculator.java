package com.pluralsight;

import static com.pluralsight.MortgageCalculator.answer;

public class AnnuityCalculator {
    public static void main(String[] args) {

    }

    public static void aCalc() {
        double payout = answer("Please enter the monthly payout: ");
        double i = answer("Please enter the expected interest rate: ");
        double t = answer("Please enter the years until payout: ");
    }

}
