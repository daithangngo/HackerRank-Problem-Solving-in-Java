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
    public void testCreatePermutation2(){
        int[]array = {2, 3, 1};
        List a = new ArrayList();
        List b = new ArrayList();
        List c = new ArrayList();
        List d = new ArrayList();
        List e = new ArrayList();
        List f = new ArrayList();

        a.add(2);
        b.add(3);
        c.add(1);
        d.add(2);d.add(3);
        e.add(3);e.add(1);
        f.add(2);f.add(3);f.add(1);

        List<List<Integer>> perm = new ArrayList<>();
        perm.add(a);
        perm.add(d);
        perm.add(f);
        Assertions.assertEquals(perm, TwoSubArrays.createPermutation(0,array ));

        List<List<Integer>> perm2 = new ArrayList<>();
        perm2.add(b);
        perm2.add(e);
        Assertions.assertEquals(perm2, TwoSubArrays.createPermutation(1,array ));

        List<List<Integer>> perm3 = new ArrayList<>();
        perm3.add(c);
        Assertions.assertEquals(perm3, TwoSubArrays.createPermutation(2,array ));
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

    @Test
    public void testInc(){
        List<Integer> perm = new ArrayList<>();
        perm.add(1);

        Assertions.assertEquals(1, TwoSubArrays.inc(perm));
    }
}
