package Basics;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6));

        System.out.println(findDay(month, day, year));
    }

    static String  findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}
