package com.pluralsight;
import java.util.Scanner;


import static com.pluralsight.AnnuityCalculator.aCalc;
import static com.pluralsight.CDFV.CDcalc;
import static com.pluralsight.MortgageCalculator.mortgageCalculator;


public class financialCalculators {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        calcChoice();
    }
    public static void calcChoice(){
        System.out.println("Hello please enter which calculator you would like to use below: \n"+
        "Your calculator options include: \n" +
        "( M ) Mortgage Calculator \n" +
        "( C ) CD Maturity Value \n" +
        "( A ) Ordinary Annuity Present Value\n");
        String ans = scanner.nextLine();

        switch (ans.toUpperCase()){
            case "M":
                mortgageCalculator();
              break;
            case "C":
                CDcalc();
                break;
            case "A":
                aCalc();
                break;
            default:
                System.out.println( "Please enter a proper calculator choice.\n");
        }
    }
}
