package cjava;

public class Ejemplo1{

   public static void main(String ... args){
       System.out.println("hola ");
       try{
          System.out.println(args[0]);
       }catch(ArrayIndexOutOfBoundsException ex){
          System.out.println("error de indice");
       }
       
   }

}