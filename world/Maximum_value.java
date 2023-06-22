/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 *
 * @author HP
 */
public class Maximum_value {
    public static void main(String[]args){
       //Maximum_value obj = new Maximum_value();
        
        int num1= 88 , num2 = 55 ;
        int a = max(num1 , num2);
         //int a = obj.max(num1 , num2);
       /* max(num1,num2);
    }
    public static void max( int num1 , int num2 ){ 
        if(num1>num2)
        System.out.println("The max is = "+num1);
        else
         System.out.println("The max is = "+num2);
        //OR
        */
              System.out.println("The max is = "+a);
    }
    public static int max( int num1, int num2){
        int max_value ;
        if (num1>num2)
            max_value = num1;
        else
            max_value = num2 ;
        
        return max_value ;
    }
    
}
