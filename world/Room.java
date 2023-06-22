/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

public class Room {
    int roomno ;
    float roomarea ;
    String roomtype ;
    boolean ACmachine ;
    public Room(){
        System.out.println("hello,an object of room class is created");
    }
    public Room(int roomno, String roomtype, float roomarea, boolean ACmachine ){
        this.roomno = roomno ;
        this.roomarea = roomarea ;
        this.roomtype = roomtype ;
        this.ACmachine = ACmachine ;
    }
    void displayData(){
        System.out.println("roomno :" +roomno);
        System.out.println("roomtype :" +roomtype);
        System.out.println("roomarea :" +roomarea);
        System.out.println("ACmachine :" +ACmachine);
    }
    public static void main(String[]args){
        Room obj = new Room(314, "larger", 220.03f, true);
        Room obj1 = new Room();
        obj.displayData();
    }
    
}
