package PolymorphismOverLoading;

class OverloadingExample
 {
     public void show(char c1,  char  c2)
     {
         System.out.println(c1 +" , "+ c2);
     }
     public void show(char c, int num1, int num2)  
     {
         System.out.println(c + " , num1 "+num1 + ", num2 "+num2);
     }
 }
