package Strings;

import java.util.*;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String s = scanner.next();
        final int k = scanner.nextInt();

        SortedSet<String> strSet = new TreeSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            strSet.add(s.substring(i, i + k));
        }

        System.out.println(strSet.first() + "\n" + strSet.last());
    }

}
