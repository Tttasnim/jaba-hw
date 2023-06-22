
package Abstraction;



public abstract class Animal {
    
    abstract void eat();
    public abstract void move();
}


 class Human extends Animal{
    
    void eat(){
        System.out.println(" Love to eat food");
    }
    
    public void move(){
         System.out.println(" Lazy to move");
    }
    
    public void talk(){
        
         System.out.println(" A good comminucator");
    }
    
}

 class Lion extends Animal{
    
    void eat(){
        System.out.println(" Love to eat Meat");
    }
    
    public void move(){
         System.out.println(" Fast to move");
    }
    
    public void hunt(){
        
         System.out.println("King of the forest ");
    }
 }

class Bird extends Animal{
    
    void eat(){
        System.out.println(" Love to eat everything");
    }
    
    public void move(){
         System.out.println(" move to anywhere");
    }
    
    public void fly(){
        
         System.out.println("fly higher in the sky ");
    }
 }
    
