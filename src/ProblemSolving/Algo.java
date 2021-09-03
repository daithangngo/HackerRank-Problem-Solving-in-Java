package ProblemSolving;

import java.util.Iterator;
import java.util.List;

public class Algo {

    //A Very Big Sum
    public static long aVeryBigSum(List<Long> ar) {
        Iterator<Long> it = ar.iterator();
        long sum = 0;
        while (it.hasNext())
            sum += it.next();
        return sum;
    }

    //Diagonal Difference
    public static int diagonalDifference(List<List<Integer>> arr) {
        int i = 0;
        int j = arr.size() - 1;
        int primaryDiag = 0;
        int secondaryDiag = 0;

        while (i != arr.size()) {
            primaryDiag += arr.get(i).get(i);
            secondaryDiag += arr.get(j).get(i);
            i++;
            j--;
        }
        return Math.abs(primaryDiag - secondaryDiag);
    }

    //Plus Minus
    public static void plusMinus(List<Integer> arr) {
        int pos, zero, neg;
        pos = zero = neg = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                pos++;
            } else if (arr.get(i) < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f\n", (double) pos / (double) arr.size());
        System.out.printf("%.6f\n", (double) neg / (double) arr.size());
        System.out.printf("%.6f\n", (double) zero / (double) arr.size());
    }

    //Staircase
    public static void staircase(int n) {
        char[] s = new char[n];
        for (int i = n - 1; i >= 0; i--) {
            s[i] = ' ';
        }
        for (int i = n - 1; i >= 0; i--) {
            s[i] = '#';
            String str = String.valueOf(s);
            System.out.println(str);
        }
    }

    //Mini-Max Sum
    public static void miniMaxSum(List<Integer> arr) {

    }


}
