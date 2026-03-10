public class Test {
    public static void main(String[] args){
        Thread t1 = new Thread(){
            public void run(){
               System.out.println("Thread1 started ");
            }
        };
        Thread t2 = new Thread(){
            public void run(){
               System.out.println("Thread2 started ");
            }
        };
        t1.start();
        t2.start();
    }
}
