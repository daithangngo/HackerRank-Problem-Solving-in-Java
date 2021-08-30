package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);

        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e instanceof InputMismatchException
                    ? "java.util.InputMismatchException":"java.lang.ArithmeticException: / by zero");
        }
    }
}
