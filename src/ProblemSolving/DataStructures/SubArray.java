package ProblemSolving.DataStructures;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = new int[scanner.nextInt()];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = scanner.nextInt();
        }

        int negSubArrCounter = 0;
        for (int i = 0; i < numArr.length; i++) {
            int j = i;
            int sum = 0;
            while (j != numArr.length) {
                sum += numArr[j];
                if (sum < 0) negSubArrCounter++;
                j++;
            }
        }
        System.out.println(negSubArrCounter);
    }
}
