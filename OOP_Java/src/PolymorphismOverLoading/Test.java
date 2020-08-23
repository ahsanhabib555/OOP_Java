package PolymorphismOverLoading;

class Test
{
   public static void main(String args[])
   {
	   OverloadingExample obj = new OverloadingExample();
       obj.show( 'a', 'b' );
       
       obj.show( 'a', 10, 10 );
   } 
}
