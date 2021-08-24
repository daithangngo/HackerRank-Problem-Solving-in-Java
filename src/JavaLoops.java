import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args) throws IOException {
        /*
        // I
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }

         */

        // II
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            return;
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int prevNumber = a;

        for (int i = 0; i < n; i++) {
            prevNumber = prevNumber + (1 << i) * b;
            sb.append(prevNumber).append(" ");

        }

        System.out.println(sb.toString());
    }
}
