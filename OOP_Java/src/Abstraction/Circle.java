package Abstraction;

import java.text.DecimalFormat;

class Circle extends Shape
{
	// variables
    double radius;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
     
    public Circle(double radius, String color) {
    
 
    	// calling Shape constructor
        super(color);
        System.out.println("Circle constructor is called");
        this.radius = radius;
    }
    
    
    
    @Override
    double area() {
        return (Math.PI * Math.pow(radius, 2));
    }
 
    @Override
    public String toString() {
        return "Color of Circle is " + super.color + " and area of circle is : " + df2.format(area())  ;
    }
     
}
