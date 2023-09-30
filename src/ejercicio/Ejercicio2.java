package ejercicio;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		        
		  // Solicita al usuario un número entero
		  System.out.print("Introduce un número entero: ");
		  int numero = sc.nextInt();
		        
		  // Calcula la cantidad quee hay que sumarle para que sea múltiplo de 7
		  int resto = numero % 7;
		  int cantidadAsumar = 0;
		        
		   if (resto != 0) {
		   cantidadAsumar = 7 - resto;
		        }
		        
		   // Muestra el resultado
		   System.out.println("A " + numero + " hay que sumarle " + cantidadAsumar + " para que sea múltiplo de 7.");
		        
		   // Cierra el escáner
		    sc.close();
		    }

	}