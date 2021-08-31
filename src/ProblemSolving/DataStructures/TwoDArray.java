package ProblemSolving.DataStructures;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class TwoDArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int[][] intArray = arr.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
        System.out.println(hourGlassLargestSum(intArray));

    }

    private static int hourGlassLargestSum(int[][] arr) {
        int largestSum = Integer.MIN_VALUE;
        for (int i = 1; i <= arr.length - 2; i++) {
            for (int j = 1; j <= arr[0].length - 2; j++) {
                //top left, top mid, top right, mid, bottom left, bottom mid, bottom right
                int tl = arr[i - 1][j - 1];
                int om = arr[i - 1][j];
                int tr = arr[i - 1][j + 1];

                int m = arr[i][j];

                int bl = arr[i + 1][j - 1];
                int bm = arr[i + 1][j];
                int br = arr[i + 1][j + 1];

                int sum = tl + om + tr + m + bl + bm + br;

                if (sum > largestSum) {
                    largestSum = sum;
                }
            }
        }
        return largestSum;
    }
}