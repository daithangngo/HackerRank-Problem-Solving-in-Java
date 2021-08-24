import java.util.Scanner;

public class JavaOutPutFormatting {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        int num1 = scanner.nextInt();

        scanner.nextLine();
        String str2 = scanner.next();
        int num2 = scanner.nextInt();

        scanner.nextLine();
        String str3 = scanner.next();
        int num3 = scanner.nextInt();

        System.out.println("================================");
        System.out.printf("%-15s%3d\n", str1, num1);
        System.out.printf("%-15s%3d\n", str2, num2);
        System.out.printf("%-15s%3d\n", str3, num3);
        System.out.println("================================");
    }
}
