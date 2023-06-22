/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

public class MyClass implements A {
    int a,b ;
   void MyClass(int a, int b ){
        this.a = a;
        this.b = b ;
    }
    public void meth1(){
    System.out.println("print the sum = "+(a+b));
    }
    public void meth2(){
         System.out.println("print the sum = "+(a-b));
    }
}
