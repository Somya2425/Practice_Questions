public class vehicle implements Tyre1, Engine{
    public static void main(String[] args){
        vehicle v1 = new vehicle();
        v1.displayTyre();
        v1.displayEngine();
        Tyre1.concrete_method();
        v1.default_method();
        Tyre1 t1 = new vehicle();
        t1.default_method();

    
    
    }
    public void displayEngine(){
        System.out.println("display engine");
    }

    public void displayTyre(){
        
        System.out.println("display tyre");
    }
    public void default_method(){
        Tyre1.super.default_method();
        System.out.println("Default Method in child");
    }
}
    

