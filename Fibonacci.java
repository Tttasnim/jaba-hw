
package Abstraction;
import java.util.Scanner;

public class Fibonacci {
    int fibo(int n){
        if(n==0 || n==1)
          return n ;
        else
            return fibo(n-1)+fibo(n-2);
            
    }
    public static void main(String[]args){
        Fibonacci f1 = new Fibonacci();
        Scanner sc = new Scanner(System.in);
       int  x =sc.nextInt();
       int i ; 
       for(i=0; i<=x ; i++)
        System.out.print( f1.fibo(i)+" , ");
    } 
}
