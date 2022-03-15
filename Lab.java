import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter first operand: ");
        double firstOperand = scnr.nextDouble();
        System.out.println("");
        System.out.print("Enter second operand: ");
        double secondOperand = scnr.nextDouble();
        System.out.println("");
        System.out.print("Enter 1 for Addition or 2 for Subtraction: ");
        int choice = scnr.nextInt();
        System.out.println("");

        if (choice == 1) {
            double result = firstOperand + secondOperand;
            System.out.print("Result of Addition: " + result);
        }
        if (choice == 2) {
            double result = firstOperand - secondOperand;
            System.out.print("Result of Subtraction: " + result);
        }
    }
}
