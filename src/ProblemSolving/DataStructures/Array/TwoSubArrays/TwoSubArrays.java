package ProblemSolving.DataStructures.Array.TwoSubArrays;

import java.util.*;

public class TwoSubArrays {
    public static void main(String[] args) {
        //array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int[] array = new int[scanner.nextInt()];
        scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //map of permutations to g
        Map<List<Integer>, Integer> permuMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            List<List<Integer>> permutationList = createPermutation(i, array);
            for (List<Integer> permutation : permutationList) {
                permuMap.put(permutation, computeG(permutation));
            }
        }

        calcAndOutput(permuMap);
    }

    //calculation & output
    static void calcAndOutput(Map<List<Integer>, Integer> permuMap) {
        int minSize = 0;
        int g = Integer.MIN_VALUE;
        int numSatisfied = 0;
        for (List<Integer> a : permuMap.keySet()) {
            if (permuMap.get(a) > g) {
                g = permuMap.get(a);
                minSize = a.size();
                numSatisfied = 1;
            }
            if (a.size() < minSize) {
                minSize = a.size();
                numSatisfied = 1;
            }
            if (permuMap.get(a) == g && a.size() == minSize) {
                numSatisfied++;
            }
        }
        System.out.printf("%d %d", g, numSatisfied);
    }


    static List<List<Integer>> createPermutation(int index, int[] array) {
        List<List<Integer>> permutationList = new ArrayList<>();
        int j = index;
        while (j <= array.length - 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int i = index; i <= j; i++) {
                permutation.add(array[i]);
            }
            permutationList.add(permutation);
            j++;
        }
        return permutationList;
    }

    static int computeG(List<Integer> permutation) {
        return sum(permutation) - inc(permutation);
    }

    //sum of all the permutation's elements
    static int sum(List<Integer> permutation) {
        int sum = 0;
        for (int a : permutation) {
            sum += a;
        }
        return sum;
    }

    //sum of all strict increasing permutation's elements
    static int inc(List<Integer> permutation) {
        int sum, curr;
        sum = curr = permutation.get(0);
        if (permutation.size() > 1) {
            int i = 0;
            //TODO : index out of bounds problem
            while (permutation.get(i) > curr) {
                sum += permutation.get(i);
                curr = permutation.get(i);
                i++;
                if (i > permutation.size() - 1) break;
            }
        }
        return sum;
    }


}
