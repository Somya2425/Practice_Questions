
import java.util.*;

public class arraylist {
        public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer n : list) {
            if (n == 2) {
                list.remove(n);
            }
        }
        System.out.println(list);
    }
}

class IteratorRemoveSuccess {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer n = it.next();
            if (n == 2) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}

