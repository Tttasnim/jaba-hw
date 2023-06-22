
package Abstraction;

public class Main {

   
    public static void main(String[] args) {
        
        Human H = new Human();
        H.talk();
        H.eat();
        H.move();
        System.out.println("\n ");
        
        Lion l = new Lion();
        l.eat();
        l.move();
        l.hunt();
        System.out.println("\n ");
        
        Bird b = new Bird();
        b.eat();
        b.move();
        b.fly();
        
    }
    
}
