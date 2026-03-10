public class Person {
    void introduce(){
        System.out.println("Hi I am a person");
    }
}
class Demo1{
    public static void main(String[] args){
         Person p = new Person(){
            void introduce(){
            System.out.println("Hi I am anonymous class");
            }
         };
         p.introduce();
    }
}
