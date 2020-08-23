package Abstraction;

abstract class Shape 
{
    String color;
    
 // abstract class constructor taking color as a parameter
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }
    
 // a method
    public String getColor() {
        return color;
    }
     
    // abstract methods of area and toString
    abstract double area();
    public abstract String toString();
     
    
}
