package ProblemSolving.Algorithms;

import java.util.LinkedList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int pointsA = 0;
        int pointsB = 0;

        while (!a.isEmpty()) {
            int A = a.remove(0);
            int B = b.remove(0);
            if (A > B) {
                pointsA++;
            } else if (A < B) {
                pointsB++;
            }
        }
        List<Integer> tripCompRes = new LinkedList<>();
        tripCompRes.add(pointsA);
        tripCompRes.add(pointsB);
        return tripCompRes;
    }
}
