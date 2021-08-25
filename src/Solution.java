import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine().trim();
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(2, 4));
        int year = Integer.parseInt(date.substring(4));

        System.out.println(getDay(month, day, year));
    }

    static String getDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month, day);
        return switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "WEDNESDAY";
            case 4 -> "THURSDAY";
            case 5 -> "FRIDAY";
            case 6 -> "SATURDAY";
            case 7 -> "SUNDAY";
            default -> throw new IllegalStateException("Unexpected value: " + calendar.get(Calendar.DAY_OF_WEEK));
        };
    }
}
