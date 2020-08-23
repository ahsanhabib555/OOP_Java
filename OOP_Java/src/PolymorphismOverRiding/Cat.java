package PolymorphismOverRiding;

public class Cat extends Animal
{
	// Over riding method
     public void animalSound()
     {
       System.out.println("Meow");
     }
     
     public static void main(String args[])
     {
       Animal obj = new Cat();
       obj.animalSound();
     }
}
