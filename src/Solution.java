import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    //A Very Big Sum
    public static long aVeryBigSum(List<Long> ar) {
        Iterator<Long> it = ar.iterator();
        long sum = 0;
        while (it.hasNext())
            sum += it.next();
        return sum;
    }

    //Diagonal Difference
    public static int diagonalDifference(List<List<Integer>> arr) {
        int i = 0;
        int j = arr.size()-1;
        int primaryDiag =0;
        int secondaryDiag = 0;

        while (i != arr.size()){
            primaryDiag += arr.get(i).get(i);
            secondaryDiag += arr.get(j).get(i);
            i++;
            j--;
        }

        return Math.abs(primaryDiag-secondaryDiag);
    }


}
