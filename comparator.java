import java.util.Stack;

public class comparator {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        for (Integer num : stack) {
            if (num == 20) {
                stack.remove(num);
            }
        }
    }
}


// import java.util.Iterator;
// import java.util.Stack;

// public class comparator{
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         Iterator<Integer> it = stack.iterator();
//         while (it.hasNext()) {
//             Integer value = it.next();
//             if (value == 20) {
//                 it.remove();  
//             }
//         }

//         System.out.println(stack);
//     }
// }


