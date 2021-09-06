package ProblemSolving.DataStructures.Array.TwoSubArrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class TwoSubArraysTest {


    @Test
    public void testCreatePermutation() {
        List<List<Integer>> permList = new LinkedList<>();
        List a = new LinkedList();
        List b = new LinkedList();
        List c = new LinkedList();

        a.add(1);
        b.add(1);
        b.add(2);
        c.add(1);
        c.add(2);
        c.add(3);

        permList.add(a);
        permList.add(b);
        permList.add(c);

        int[]arr = {1,2,3};

        Assertions.assertEquals(permList, TwoSubArrays.createPermutation(0, arr));
    }
}
