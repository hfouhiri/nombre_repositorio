package ejercicio;
import java.util.Scanner;
public class Ejercicio5 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // Solicita al usuario los coeficientes a, b y c
	        System.out.print("Introduce el coeficiente a: ");
	        double a = sc.nextDouble();
	        
	        System.out.print("Introduce el coeficiente b: ");
	        double b = sc.nextDouble();
	        
	        System.out.print("Introduce el coeficiente c: ");
	        double c = sc.nextDouble();
	        
	        // Solicita al usuario el valor de x
	        System.out.print("Introduce el valor de x: ");
	        double x = sc.nextDouble();
	        
	        // Calcula el valor correspondiente de y
	        double y = (a * x * x) + (b * x) + c;
	        
	        // Muestra el resultado
	        System.out.println("El valor correspondiente de y es: " + y);
	        
	        // Cierra el escáner
	        sc.close();
	    }

	}