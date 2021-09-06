package ProblemSolving.DataStructures.Array.TwoSubArrays;

import java.util.*;

public class TwoSubArrays {
    public static void main(String[] args) {
        //array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //Todo
        Map<List<Integer>, Integer> permuMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            List<List<Integer>> permutationList = createPermutation(i, array);
            for (List<Integer> permutation : permutationList) {
                permuMap.put(permutation, computeG(permutation));
            }
        }

    }

    //Todo
     static List<List<Integer>> createPermutation(int index, int[] array) {
        List<List<Integer>> permutationList = new LinkedList<>();
        for (int i = index; i < array.length; i++) {
            List<Integer> permutation = new LinkedList<>();
            permutation.add(array[i]);
        }
        return null;
    }

    //Todo
     static int computeG(List<Integer> permutation) {
        return 0;
    }

    //Todo
     static int sum(List<Integer> permutation) {
        return 0;
    }

    //Todo
     static int inc(List<Integer> permutation) {
        return 0;
    }


}
