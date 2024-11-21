import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        calculateAverageMarks(scanner);


        scanner.close();
    }

    public static void calculateAverageMarks(Scanner scanner) {

        double javaProgrammingMarks, networkingMarks, mathsMarks;


        System.out.print("Enter marks for Java Programming: ");
        javaProgrammingMarks = scanner.nextDouble();

        System.out.print("Enter marks for Networking: ");
        networkingMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        mathsMarks = scanner.nextDouble();


        double averageMarks = (javaProgrammingMarks + networkingMarks + mathsMarks) / 3;


        System.out.println("Marks for Java Programming is: " + javaProgrammingMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);
    }
}