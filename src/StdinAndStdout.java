import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StdinAndStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + "\n" + b + "\n" + c + "\n");
    }
}