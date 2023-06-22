/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 *
 * @author HP
 */
public class Department {
    private String deptName;
    private int deptCode;
    private String faculty;
    public static void main(String[]args){
        Department diu = new Department();
        diu.deptName = "CSE";
        diu.deptCode = 61;
        diu.faculty ="FSFA";
        System.out.println("Name of department = "+diu.deptName);
          System.out.println("Name of Code = "+diu.deptCode);
            System.out.println("Name of Faculty = "+diu.faculty);
            
       
    }
}
