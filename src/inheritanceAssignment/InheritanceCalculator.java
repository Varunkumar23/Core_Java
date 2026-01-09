package inheritanceAssignment;

public class InheritanceCalculator {

    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }
    }

    static class AdvancedCalculator extends Calculator {
        int multiply(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
    }
}
