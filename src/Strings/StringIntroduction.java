package Strings;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        /*
        Java Reflection
        ability to examine or modify the runtime behavior of applications running the Java virtual machine
        keine Optimierungen nicht möglich, da wir erst zur Laufzeit die Methoden wählen
        keine grundlegenden Änderungen nötig
         */

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


