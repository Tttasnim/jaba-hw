
package Code;

public class Girl extends Human {
    
      @Override
      public void eat(){
        System.out.println("eat many more");
    }
      public static void main(String[]args){
          Girl obj = new Girl();
          obj.eat();
      }
    
}
