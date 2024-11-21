import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        checkLeapYear(scanner);


        TriangleArea triangleArea = new TriangleArea();
        triangleArea.calculateAndDisplayArea(scanner);


        scanner.close();
    }

    // Method to check if a year is a leap year
    public static void checkLeapYear(Scanner scanner) {
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }

    // Method to ask for base and height of the triangle
    public void getTriangleDimensions(Scanner scanner) {
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        computeArea(base, height);
    }

    // Method to compute the area of the triangle
    public void computeArea(double base, double height) {
        double area = 0.5 * base * height;
        displayArea(area);
    }

    // Method to display the calculated area
    public void displayArea(double area) {
        System.out.println("The area of the triangle is: " + area);
    }

    // Method to calculate and display the area of the triangle
    public void calculateAndDisplayArea(Scanner scanner) {
        getTriangleDimensions(scanner);
    }
}