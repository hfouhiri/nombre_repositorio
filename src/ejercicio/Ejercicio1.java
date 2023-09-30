package ejercicio;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		        
		// Solicita al usuario un número decimal
		System.out.print("Introduce un número decimal: ");
		double numeroDecimal = sc.nextDouble();
		        
		 // Extrae la parte enera del número
		 int parteEntera = (int) numeroDecimal;
		        
		 // Extrae la parte decimal del número
		 double parteDecimal = numeroDecimal - parteEntera;
		        
		 // Redondea al entero más cercano
		 if (parteDecimal >= 0.5)
		 parteEntera++;
		            
		 // Muestra el resultado redodeado
		 System.out.println("El número redondeado es: " + parteEntera);
		        
		  // Cierra el escáner
		  sc.close();
		    }
	}