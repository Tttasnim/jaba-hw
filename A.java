/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;


public abstract class A {
    public void move(){
        System.out.println("Move the eliments");
    }
    public abstract void play();
}

class B extends A{
    public void play(){
         System.out.println(" Start the game");
    }
}
