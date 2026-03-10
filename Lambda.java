public interface Lambda {
    void test(int x);
}
 interface Lambda2 {
    void test(String y);
} 
 class LambdaDemo{
    public static void main(String[] args) {
        Lambda l1 = (x)-> 
        {System.out.println("Lambda 1 ");
            
        };
        l1.test(10);

        Lambda2 l2 = (y)-> System.out.println("Lambda 2 ");
        l2.test("s");
    }
    
}
