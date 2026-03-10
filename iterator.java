import java.util.*;

public class iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);

            if (value.equals("B")) {
                it.remove(); 
            }
        }
        System.out.println("Updated List: " + list);
    }
}

