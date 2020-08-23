package Encapsulation;

public class EncapsulationExample
{
   public static void main(String args[])
   {
	   StudentCount obj = new StudentCount ();
      
      //obj.TotalStudents = 12; will not work
      
      obj.setTotalStudents(823);
      
      System.out.println("Total Number Of Students: "+(int)obj.getTotalStudents());
    }
}
