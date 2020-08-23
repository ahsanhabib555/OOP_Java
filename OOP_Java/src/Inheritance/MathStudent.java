package Inheritance;

public class MathStudent extends Student
{
   String mainSubject = "Maths";
   public static void main(String args[])
   {
	   MathStudent obj = new MathStudent();
      System.out.println(obj.school);
      System.out.println(obj.designation);
      System.out.println(obj.mainSubject);
      obj.does();
   }
}
