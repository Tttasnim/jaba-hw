/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author HP
 */
public class Account extends Bank{
    
    int accountno ;
    int age ;
    String add ;

    public Account(String name) {
      
    }
    @Override
    public void move(){
          System.out.println("Print= "+name);
            System.out.println("Print" +age);
              System.out.println("Print" +accountno);
                System.out.println("Print" +add);
    }
    public static void main(String[]args){
        Account p1 = new Account("Ali");
        p1.add = "dhaka";
                p1.name = "Ana";
                p1.accountno = 5485 ;
                p1.move();
                p1.displayInfo();
    }
}
