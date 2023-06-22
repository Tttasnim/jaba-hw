/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;


public class MultipleInherit implements AInterface,BInterface {
    @Override
    public void showinfo(){
        System.out.println("Show the output");
    }
    public static void main(String[]args){
        MultipleInherit obj = new MultipleInherit();
        obj.showinfo();
    }
}
