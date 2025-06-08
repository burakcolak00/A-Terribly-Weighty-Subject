package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Ounce Conversion Program!\n");
    Converter converter = new Converter();
    System.out.print("How many ounces do you have?");
    Scanner scanner = new Scanner(System.in);
    int ounces = scanner.nextInt();
    System.out.println("Thank you! Converting ounces to pounds.\n");
    System.out.println(ounces + " oz is equivalent to " + converter.toPounds(ounces));
    System.out.println("And in pounds and ounces, that is: " + converter.toPoundsAndOunces(ounces));
    System.out.println("Thank you for using the Ounce Conversion Program!");
    scanner.close();
  }
}
