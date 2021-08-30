package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Anagram: 2 strings contain  the same characters with the same frequencies
public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(isAnagramHRSolution(a, b));
    }

    //O(n)
    static String isAnagram(String a, String b) {
        if (a.length() != b.length()) return "Not Anagrams";

        HashMap<Character, Integer> charFrequencyA = new HashMap<>();
        HashMap<Character, Integer> charFrequencyB = new HashMap<>();
        String A = a.toLowerCase();
        String B = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            Character charA = A.charAt(i);
            Character charB = B.charAt(i);

            //String I
            if (!charFrequencyA.containsKey(charA)) {
                charFrequencyA.put(charA, 1);
            } else {
                charFrequencyA.put(charA, charFrequencyA.get(charA) + 1);
            }
            //String II
            if (!charFrequencyB.containsKey(charB)) {
                charFrequencyB.put(charB, 1);
            } else {
                charFrequencyB.put(charB, charFrequencyB.get(charB) + 1);
            }
        }
        return charFrequencyA.equals(charFrequencyB) ? "Anagrams" : "Not Anagrams";
    }

    //O(n)
    static String isAnagramHRSolution(String a, String b) {
        if (a.length() != b.length()) return "Not Anagrams";

        Map<Character, Integer> charFrequencyA = new HashMap<>();
        String A = a.toUpperCase();
        String B = b.toUpperCase();

        for (int i = 0; i < A.length(); i++) {
            Character charA = A.charAt(i);
            if (!charFrequencyA.containsKey(charA)) {
                charFrequencyA.put(charA, 1);
            } else {
                charFrequencyA.put(charA, charFrequencyA.get(charA) + 1);
            }
        }
        for (int i = 0; i < B.length(); i++) {
            Character charB = B.charAt(i);
            //does not contain key or frequency is higher
            if (!charFrequencyA.containsKey(charB) || charFrequencyA.get(charB) == 0) {
                return "Not Anagrams";
            }
            charFrequencyA.put(charB, charFrequencyA.get(charB)-1);
        }
        return "Anagrams";
    }
}
