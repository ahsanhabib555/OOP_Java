package Encapsulation;

class StudentCount
{
   private int TotalStudents= 0;
   
   public void setTotalStudents (int count)
   {
	   TotalStudents = count;
   }
   public double getTotalStudents () 
   {
       return TotalStudents;
   }
}
