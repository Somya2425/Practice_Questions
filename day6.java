public class day6 {
    public static void main(String[] args) {
       var name = "Java";
       System.out.println(name);
       String n = "Somya \nMishra";
       String text = "Somya \nMishra \nhello\nworld";
       System.out.println("hi".repeat(4));
       System.out.println(n.isBlank());
       System.out.println(n.lines().count());
       text.lines().forEach(line -> System.out.println(line));
       int day = 1;
       var result =  switch(day){
        case 1 -> "Monday";
        default->"sunday";
       };
       System.out.println(result);


       String s = """
               Hllo
               world
               """;
               System.out.println(s);
        

    }
    
}
