public class sealedDemo {
    public sealed static class Shape permits Circle, Square{}
    // final subclass cant be extended
    public static final class Circle extends Shape{
        double radius;
        Circle(double radius){
            this.radius = radius;
        }
    }
    //non - sealed subclass can be extended
    public static non-sealed class Square extends Shape{
        double side;
        Square(double side){
            this.side = side;
        }
    }
}


