
package Abstraction;


public abstract class Vehicle {
    public Vehicle(){
        
        System.out.println("Hello!");
    }
    
    abstract void move();
    // method overriding
    void carry(){
        
        System.out.println("Duties");
    }
}


class Car extends Vehicle{
    public void move(){
        
        System.out.println("hey Tasnim");
    }
    public static void main(String[]args){
        
        Car c = new Car();
        c.move();
        c.carry();
    }
    
}
