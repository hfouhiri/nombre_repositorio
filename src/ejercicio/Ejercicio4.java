package ejercicio;
import java.util.Scanner;
public class Ejercicio4 {

	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	        
	      // Solicita al usuario la base del triángulo
	      System.out.print("Introduce la base del triángulo: ");
	      double base = sc.nextDouble();
	        
	      // Solicita al usuario la altura del triángulo
	      System.out.print("Introduce la altura del triángulo: ");
	      double altura = sc.nextDouble();
	        
	      // Calcula el área del triángulo
	      double areaTriangulo = (base * altura) / 2;
	        
	      // Muestra el resultado
	      System.out.println("El área del triángulo es: " + areaTriangulo);
	        
	      // Cierra el escáner
	      sc.close();
	    }

	}