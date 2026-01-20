package org.example.chapter01;
/**
 * Example 1: Code Smell (Switch-Statement) → Strategy Pattern
 *
 * Visar: Hur man refaktorerar från switch-statement till Strategy-mönstret
 * Komplexitet: ⭐ Enkel
 * Tid: ~5 minuter
 *
 * Koncept:
 * - Code Smell: Switch-statement för algoritm-val
 * - Refactoring: Strategy Pattern (Behavioral Pattern, Kapitel 16)
 * - Open-Closed Principle: Öppen för utökning, stängd för modifiering
 */
public class Example01_CodeSmellToPattern {
    // ========================================
    // BAD: Code Smell - Switch Statement
    // ========================================

    /**
     * ❌ CODE SMELL: Switch-statement för att välja algoritm
     *
     * Problem:
     * - Varje ny leveransmetod kräver att switch-statement ändras
     * - Bryter mot Open-Closed Principle
     * - Svår att testa (måste testa alla cases tillsammans)
     */
    static class ShippingCalculator_BAD {

        public double calculate(String method, double weight) {
            switch (method) {
                case "STANDARD":
                    return weight * 2.0;
                case "EXPRESS":
                    return weight * 5.0;
                default:
                    throw new IllegalArgumentException("Unknown method: " + method);
            }
        }
    }

    // ========================================
    // GOOD: Strategy Pattern
    // ========================================

    /**
     * ✅ STRATEGY PATTERN: Interface för olika algoritmer
     */
    interface ShippingStrategy {
        double calculate(double weight);
        String getName();
    }

    /**
     * Strategi 1: Standard leverans (billigast)
     */
    static class StandardShipping implements ShippingStrategy {
        @Override
        public double calculate(double weight) {
            return weight * 2.0;
        }

        @Override
        public String getName() {
            return "Standard";
        }
    }

    /**
     * Strategi 2: Express leverans (snabbare, dyrare)
     */
    static class ExpressShipping implements ShippingStrategy {
        @Override
        public double calculate(double weight) {
            return weight * 5.0;
        }

        @Override
        public String getName() {
            return "Express";
        }
    }

    /**
     * Strategi 3: Overnight leverans (snabbast, dyrast)
     *
     * NOTERA: Denna klass lades till UTAN att ändra befintlig kod!
     * Detta är Open-Closed Principle i praktiken.
     */
    static class OvernightShipping implements ShippingStrategy {
        @Override
        public double calculate(double weight) {
            return weight * 10.0;
        }

        @Override
        public String getName() {
            return "Overnight";
        }
    }

    /**
     * Context class som använder Strategy
     */
    static class ShippingCalculator_GOOD {
        private ShippingStrategy strategy;

        public ShippingCalculator_GOOD(ShippingStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(ShippingStrategy strategy) {
            this.strategy = strategy;
        }

        public double calculate(double weight) {
            return strategy.calculate(weight);
        }
    }

    // ========================================
    // Main: Demonstrera skillnaden
    // ========================================

    public static void main(String[] args) {
        double weight = 5.0;  // kg

        System.out.println("=== CODE SMELL: Switch Statement ===");
        ShippingCalculator_BAD badCalculator = new ShippingCalculator_BAD();
        System.out.println("Standard shipping cost: " + badCalculator.calculate("STANDARD", weight) + " kr");
        System.out.println("Express shipping cost: " + badCalculator.calculate("EXPRESS", weight) + " kr");
        // Problem: Lägga till "OVERNIGHT" kräver att vi ändrar switch-statement!
        System.out.println();

        System.out.println("=== AFTER REFACTORING: Strategy Pattern ===");
        ShippingCalculator_GOOD goodCalculator = new ShippingCalculator_GOOD(new StandardShipping());
        System.out.println("Standard shipping cost: " + goodCalculator.calculate(weight) + " kr");

        goodCalculator.setStrategy(new ExpressShipping());
        System.out.println("Express shipping cost: " + goodCalculator.calculate(weight) + " kr");

        // ✅ Ny leveransmetod läggs till UTAN att ändra befintlig kod!
        goodCalculator.setStrategy(new OvernightShipping());
        System.out.println("Overnight shipping cost: " + goodCalculator.calculate(weight) + " kr");
        System.out.println();

        System.out.println("✅ Ny leveransmetod (Overnight) lades till UTAN att ändra befintlig kod!");
        System.out.println("Detta är Open-Closed Principle (OCP) i praktiken.");
    }

}
