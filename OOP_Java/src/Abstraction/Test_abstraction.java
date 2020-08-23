package Abstraction;

public class Test_abstraction 
{
    public static void main(String[] args)
    {
    	
        Shape shape1 = new Circle(2.5, "Blue");
        
        Shape shape2 = new Triangle(5, 6, 60, "Yellow");
         
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
    }
}
