import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // program code
//        System.out.println("How many times?");
//        int input = Integer.valueOf(scanner.nextLine());
//
//        for (int i = 0; i < input; i++){
//            printText();
//        }
//
//    }
//    public static void printText() {
//        System.out.println("In a hole in the ground there lived a method");
//    }
        sum(6, 8);

        int num1 = 4;
        int num2 = 15;

        sum(num1, num2);
    }

    public static void sum(int numOne, int numTwo) {
        System.out.println("" + numOne + " + " + numTwo + " = " + (numOne + numTwo));
    }
}
