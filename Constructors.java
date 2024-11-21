public class Constructors {

    // Constructor
    public Constructors() {
        System.out.println("Calculator initialized.");
    }

    // Non-static method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Static method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Create an instance of Calculator
        Constructors constructors = new Constructors();

        // Use the non-static method
        int sum = constructors.add(5, 10);
        System.out.println("Sum: " + sum);

        // Use the static methods
        int difference = Constructors.subtract(10, 5);
        System.out.println("Difference: " + difference);

        int product = Constructors.multiply(4, 5);
        System.out.println("Product: " + product);
    }
}