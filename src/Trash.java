import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Trash {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int i = 0;
        while (list.remove(0) > 0) {
            System.out.println(++i);
        }
    }
}
