package Abstraction;

class Triangle extends Shape{
 
	// variables
    double a;
    double b;
    double angle;
    public Triangle(double a,double b, double angle, String color) {
    	
        // Shape constructor
        super(color);
        System.out.println("Triangle constructor is called");
        this.a = a;
        this.b = b;
        this.angle = angle;
        
    }
     
    
    @Override
    double area() {
        return  ( 0.5 * a * b * Math.sin(Math.toRadians( angle ))) ;
    }
 
    @Override
    public String toString() {
        return "Triangle color is " + super.color + " and area is : " + area() ;
    }
 }
