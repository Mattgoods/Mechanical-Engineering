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

        double result = firstOperand + secondOperand;
        System.out.print("Result of Addition: " + result);

    }
}
