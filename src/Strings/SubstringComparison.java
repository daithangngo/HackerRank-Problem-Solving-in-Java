package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String s = scanner.next();
        final int k = scanner.nextInt();

        String[] arr = substringDecomp(s, k);
        System.out.println(arr[0] + "\n" + arr[arr.length - 1]);
    }

    private static String[] substringDecomp(String s, int k) {
        String[] subStrArr = new String[s.length() - k + 1];
        int i = 0;
        while (i < subStrArr.length) {
            subStrArr[i] = s.substring(i, i + k);
            i++;
        }
        Arrays.sort(subStrArr, String.CASE_INSENSITIVE_ORDER);
        return subStrArr;
    }
}
