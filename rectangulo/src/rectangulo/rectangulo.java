package rectangulo;
import java.util.Scanner;
public class rectangulo {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double largo,ancho,perimetro;
       System.out.println("Ingresa largo");
       largo=sc.nextDouble();
       System.out.println("Ingresa ancho");
       ancho=sc.nextDouble();
       perimetro=2*(ancho+largo);
      System.out.println("el perimetro es" +perimetro);
      double area;
      System.out.println("ingrese ancho del rectangulo");
      double a=sc.nextDouble();  
      System.out.println("ingrese alto del rectangulo");
      double b=sc.nextDouble(); 
      area=a*b;
      System.out.println("el area es"+ area);
     }      
}