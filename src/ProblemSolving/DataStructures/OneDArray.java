package ProblemSolving.DataStructures;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = scanner.nextInt();
        int[] arr = new int[numInputs];

        for (int i = 0; i < numInputs; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}

