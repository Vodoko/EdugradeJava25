package org.example;
package

public class Main {
    public static void main(String[] args) {

        goodCalculator.setStrategy(new SameDayDelivery());
        System.out.println("Same-day shipping cost: " + goodCalculator.calculate(weight) + " kr");
    }
}