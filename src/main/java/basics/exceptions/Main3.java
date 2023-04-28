package basics.exceptions;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args)  {
        System.out.println("main");
      try{
          method1();
          System.out.println("no exception appeared");
      }catch (NullPointerException e){
          System.out.println("exception handled");
      }catch (IOException e){
          System.out.println("caught exception of type compile time exception (checked exception)");
      }

        System.out.println("main");
    }

    public static void method1() throws IOException{
        System.out.println("method1");
        method2();
        System.out.println("method1");
    }

    public static void method2() throws IOException {
        System.out.println("method2");
        method3();
        System.out.println("method2");
    }

    public static void method3() throws IOException{
        System.out.println("method3");
          throw new IOException();
    }

}
