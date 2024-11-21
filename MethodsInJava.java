import java.util.Scanner;

public class MethodsInJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        findLargestAndSmallest(scanner);


        scanner.close();
    }

    public static void findLargestAndSmallest(Scanner scanner) {

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();


        int largest = num1;
        int smallest = num1;


        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }


        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }


        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
    }
}