package Strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //System.out.println(reverseString(str).equals(str) ? "Yes" : "No");
        System.out.println(reverseStringWithComp(str));
        ;
        //System.out.println(str.equals(new StringBuilder(str).reverse().toString())?"Yes":"No");
    }

    //O(n)
    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    //O(n/2)
    private static String reverseStringWithComp(String str) {
        int l = -1;
        int r = str.length();

        while (r > l) {
            l++;
            r--;
            if (str.charAt(l) != str.charAt(r)) return "No";
        }
        return "Yes";
    }
}
