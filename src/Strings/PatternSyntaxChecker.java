package Strings;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for (int i = 0; i < testCases; i++) {
            String str = in.nextLine();
            try {
                Pattern.compile(str);
                System.out.println("Valid");
            } catch (PatternSyntaxException exception) {
                System.out.println("Invalid");
            }
        }
    }
}