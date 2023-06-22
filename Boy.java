
package Code;

public class Boy extends Human{
    
      @Override
      public void eat(){
        System.out.println("eat very much more");
    }
      public static void main(String[]args){
         Boy obj1 = new Boy();
         obj1.eat();
      }
    
}
