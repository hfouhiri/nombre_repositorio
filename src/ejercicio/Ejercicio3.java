package ejercicio;
import java.util.Scanner;
public class Ejercicio3 {

	  public static void main(String[] args) {
	
	        Scanner sc = new Scanner(System.in);
	        
	        // Solicita al usuario dos números enteros
	        System.out.print("Introduce el primer número entero (num1): ");
	        int num1 = sc.nextInt();
	        
	        System.out.print("Introduce el segundo número entero (num2): ");
	        int num2 = sc.nextInt();
	        
	        // Calcula la cantidad que hay que sumarle a num1 para que sea múltiplo de num2
	        int resto = num1 % num2;
	        int cantidadAsumar = 0;
	        
	        if (resto != 0) {
	            cantidadAsumar = num2 - resto;
	        }
	        
	        // Muestra el resultado
	        System.out.println("A " + num1 + " hay que sumarle " + cantidadAsumar + " para que sea múltiplo de " + num2 + ".");
	        
	        // Cierra el escáner
	        sc.close();
	    }

	}