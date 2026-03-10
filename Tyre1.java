public interface Tyre1{
    public static final int tyre_size = 20;
    void displayTyre();
    static void concrete_method(){
        System.out.println("I am interface");
    }
    default void default_method(){
        System.out.println("Default Method in parent");
    }
}



