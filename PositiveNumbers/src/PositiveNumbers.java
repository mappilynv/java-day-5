import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                System.out.println("Number must be a positive number.");
                continue;
            } else if (input == 0) {
                break;
            }
            System.out.println("Number is "+input);
        }
    }


}
