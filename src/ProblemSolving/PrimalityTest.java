package ProblemSolving;

import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println(sc.nextBigInteger().isProbablePrime(1)? "prime": "not prime");
    }
}

