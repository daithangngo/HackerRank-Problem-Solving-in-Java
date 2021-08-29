package Strings;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.next();
        String secondStr = scanner.next();

        System.out.println(firstStr.length() + secondStr.length());
        if(firstStr.charAt(0) > secondStr.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(firstStr.substring(0, 1).toUpperCase() + firstStr.substring(1) + " "
                + secondStr.substring(0, 1).toUpperCase() + secondStr.substring(1));
    }
}


