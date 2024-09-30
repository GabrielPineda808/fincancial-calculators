package com.pluralsight;
import java.util.Scanner;


public class financialCalculators {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void calcChoice(){
        System.out.println("Hello please enter which calculator you would like to use below: \n"+
        "Your calculator options include: \n" +
        "( M ) Mortgage Calculator \n" +
        "( C ) CD Maturity Value \n " +
        "( A ) Ordinary Annuity Present Value");
        String ans = scanner.nextLine();
    }
}
