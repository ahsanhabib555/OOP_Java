package ClassAndObject;

public class Test
 {
     public static void main(String args[])
     {
       Home obj = new Home();
       obj.address = "Dhaka";
       System.out.println(obj.address);
       obj.openDoor();
       obj.closeDoor();
  }
 }
