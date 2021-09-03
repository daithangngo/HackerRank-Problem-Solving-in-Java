import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    //A Very Big Sum
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        Iterator<Long> it = ar.iterator();
        long sum = 0;
        while(it.hasNext())
            sum += it.next();
        return sum;
    }

}
