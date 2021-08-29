package Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        System.out.println(str.substring(startIndex, endIndex));
    }
}
