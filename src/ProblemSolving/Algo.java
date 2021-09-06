package ProblemSolving;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

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
        long min = arr.stream()
                .sorted()
                .map(Long::new)
                .limit(4)
                .reduce(Long::sum)
                .get();
        long max = arr.stream()
                .sorted()
                .map(Long::new)
                .skip(1)
                .reduce(Long::sum)
                .get();
        System.out.printf("%d %d", min, max);
    }

    //Birthday Cake Candles
    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallestCount = 1;
        int tallestElem = candles.get(0);
        for (int i = 1; i < candles.size(); i++) {
            if (candles.get(i) > tallestElem) {
                tallestCount = 1;
                tallestElem = candles.get(i);
            }else if(candles.get(i) == tallestElem){
                tallestCount++;
            }
        }
        return tallestCount;
    }

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(3);
        candles.add(3);
        System.out.println(candles.toString());
        System.out.println(birthdayCakeCandles(candles));

    }

}
