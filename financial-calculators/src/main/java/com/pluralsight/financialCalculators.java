package com.pluralsight;
import java.util.Scanner;


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
        "( A ) Ordinary Annuity Present Value");
        String ans = scanner.nextLine();

        switch (ans.toUpperCase()){
            case "M":
                System.out.println("Mortgage");
              break;
            case "C":
                System.out.println("CD");
                break;
            case "A":
                System.out.println("Annuity");
                break;
            default:
                System.out.println( "Please enter a proper calculator choice.");
        }
    }
}
