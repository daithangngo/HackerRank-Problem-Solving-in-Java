package Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegers {

    //primeChecker: //System.out.println(sc.nextBigInteger().isProbablePrime(1)? "prime": "not prime");

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        BigInteger b1 = sc.nextBigInteger();
        BigInteger b2 = sc.nextBigInteger();

        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}

