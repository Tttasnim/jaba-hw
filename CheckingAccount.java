/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

public class CheckingAccount extends BankAccount {
    
    @Override
    public void deposit(){
         System.out.println("Print");
    }
    @Override
    public void withdraw(){
         System.out.println("Print" +balance);
          System.out.println("Print" +account_number);
    }

 
    
    }
