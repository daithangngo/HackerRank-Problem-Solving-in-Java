package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }


    private static void excerciseI(Scanner scanner) {
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);

        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e instanceof InputMismatchException
                    ? "java.util.InputMismatchException" : "java.lang.ArithmeticException: / by zero");
        }
    }

    class MyCalculator {
        long power(int n, int p) throws Exception {
            if(n < 0 || p < 0){
                throw new Exception("n and p should not be zero.");
            }else if(n == 0 && p == 0){
                throw new Exception("n or p should not be negative.");
            }
            return (long) Math.pow(n, p);
        }
    }
}
