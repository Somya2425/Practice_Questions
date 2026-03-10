interface Calculator {
    void add(int a, int b);
    void add(int a, int b, int c);
}
class Demo{
    public static void main(String[] args) {
        Calculator c = new Calculator() {
            public void add(int a, int b){
                System.out.println(a+b);
            }
            public void add(int a, int b, int c){
                System.out.println(a+b+c);
            }
        };
        c.add(8,2);
        c.add(2,7,1);
    }
}
