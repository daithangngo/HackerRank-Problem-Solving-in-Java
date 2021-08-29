package Basics;

import java.util.Scanner;

public class StdinAndStdout {
    public static void main(String[] args) {
        // I
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + "\n" + b + "\n" + c + "\n");


        //II
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        //bewegt diesen scanner über die aktuelle Zeile hinaus und gibt die übersprungene Eingabe zurück
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String: " + s + "\n" + "Double: " + d + "\n" + "Int: " + i);
    }
}