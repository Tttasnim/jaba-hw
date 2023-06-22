/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

public class MainBank {
    public static void main(String[]args){
        
        CheckingAccount person = new CheckingAccount();
        person.account_number = 1548455;
        person.balance= 15870000;
        person.deposit();
        person.withdraw();
        person.getBalance();
        person.setBalance(14500000);
    }
    
}
