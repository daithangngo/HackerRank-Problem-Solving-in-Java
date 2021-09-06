package ProblemSolving.DataStructures.Array.TwoSubArrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TwoSubArraysTest {


    @Test
    public void testCreatePermutation() {
        List<List<Integer>> permList = new ArrayList<>();
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
        int[] arr = {1, 2, 3};
        Assertions.assertEquals(permList, TwoSubArrays.createPermutation(0, arr));
    }

    @Test
    public void testSum() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(-12);
        Assertions.assertEquals(-4, TwoSubArrays.sum(list));
    }

    @Test
    public void testSumSingle() {
        List<Integer> list = new ArrayList<>();
        list.add(-12);
        Assertions.assertEquals(-12, TwoSubArrays.sum(list));
    }

    @Test
    public void testSumMultiNeg() {
        List<Integer> list = new ArrayList<>();
        list.add(-12);
        list.add(-5);
        Assertions.assertEquals(-17, TwoSubArrays.sum(list));
    }

    @Test
    public void testCreateG() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(-12);
        Assertions.assertEquals(3 + 5 - 12 - 8, TwoSubArrays.computeG(list));
    }

    @Test
    public void testCreateGSingle() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Assertions.assertEquals(0, TwoSubArrays.computeG(list));
    }
}
