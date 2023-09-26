package dulce;
import java.util.Scanner;
public class articulos {
    public static void main(String[] args) {
      Scanner Leer= new Scanner(System.in);
      float r,ar,ca,ne;
      System.out.print ("Ingresa la cantidad de articulos:");
      ca=Leer.nextFloat();
      System.out.print("Ingresa el precio del articulo:");
      ar=Leer.nextFloat();
      r=ca*ar;
      System.out.print ("El total a pagar es: "+r);
      System.out.print ("El iva es de 1.16");
      ne=r*1.16;
      System.out.print("El total a pagar es:"+ne);
    }
    
}
