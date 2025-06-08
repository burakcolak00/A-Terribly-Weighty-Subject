package org.example;

public class Converter {
  String toPounds(int ounces) {
    double pounds = ounces / 16.0;
    return String.format("%.4f %s", pounds, (pounds == 1.0 ? "lb" : "lbs"));
  }
  String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    int remainingOunces = ounces % 16;
    return pounds + (pounds == 1.0 ? " lb" : " lbs") + " " + remainingOunces + " oz";
  }
}
