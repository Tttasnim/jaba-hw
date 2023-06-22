/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

import java.util.ArrayList;
//import java.util.collections;

public class Exception1 {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        
       /* for(int i=0;i<list.size();i++){
           // System.out.println(list.get(i));  //loop
       }
        System.out.println( );*/
       
        System.out.println(list);
        int element=list.get(1); //access element(get)
        System.out.println(element);
        list.add(1,1);  //add element
        System.out.println(list);
        list.set(0,5);  //change element
        System.out.println(list);
        list.remove(3);   //delete element
        System.out.println(list);
        int size=list.size();
        System.out.println(size);
        
        /*collections.sort(list);
        System.out.println(list);*/
    
        
    }
    
}
