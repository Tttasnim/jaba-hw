/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 *
 * @author HP
 */
public class Student1 {
    private String id ;
    private String name ;
    private double cgpa ;
    public void insert_Record( String id , String name , double cgpa){
        this.id = id ;
        this.name = name ;
        this.cgpa = cgpa ;
        
    }
     public void display_record(){
           System.out.println("ID is = "+id);
         System.out.println("Name is = "+name); 
         System.out.println("CGPA is = "+cgpa); 
         
     }
     public static void main(String[]args){
         Student1 std = new Student1();
         std.insert_Record("21-15-5626", "tasnim", 3.55);
         std.display_record();
     }
    
}
