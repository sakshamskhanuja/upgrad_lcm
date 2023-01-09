import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scan = new Scanner(System.in);

        // Enter the two numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.print(lcm(number1, number2));
    }

    public static int lcm(int number1, int number2) {
        // Stores the minimum of number1 and number2.
        int small = Math.min(number1, number2);

        // Stores the HCF of number1 and number2.
        int hcf = 1;

        for (int i = 1; i <= small; i++) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                hcf = i;
            }
        }

        // Calculates and returns the LCM.
        return (number1 * number2) / hcf;
    }
}