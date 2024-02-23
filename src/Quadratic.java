import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user
        System.out.println("Enter coefficients for A, B, and C: ");
        double a = input(scanner, "A");
        double b = input(scanner, "B");
        double c = input(scanner, "C");

        //Processing results
        double result = b * b - 4 * a * c;
        if (result > 0) {
            double r1 = (-b + Math.sqrt(result)) / (2 * a);
            double r2 = (-b - Math.sqrt(result)) / (2 * a);
            System.out.println("Different real roots:\nRoot 1 = " + r1 + "\nRoot 2 = " + r2);
        } else if (result == 0) {
            double r = -b / (2 * a);
            System.out.println("One real root:\nRoot = " + r);
        } else {
            System.out.println("There's no real roots.");
        }
        scanner.close();
    }
    //Validate the input
    private static double input(Scanner s, String c) {
        while (true) {
            System.out.print("Enter coefficient " + c + ": ");
            if (s.hasNextDouble()) return s.nextDouble();
            else { System.err.println("Error: Enter a valid number."); s.next(); }
        }
    }
}

