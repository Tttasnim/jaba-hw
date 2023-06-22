/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

public abstract class BankAccount {
    
    int account_number ;
    double balance ; 
    
    abstract void deposit();
    abstract void withdraw();
    
    public void setBalance(double balance){
        this.balance = balance;
          System.out.println("Print the written amount");
    }
   public double getBalance(){
        return balance ;
    }
}
