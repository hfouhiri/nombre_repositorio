package ejercicio;
import java.util.Scanner;
public class Ejercicio9 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Solicita al ussuario el primer número
	        System.out.print("Introduce el primer número: ");
	        int numero1 = sc.nextInt();

	        // Solicita al usario el segundo número
	        System.out.print("Introduce el segundo número: ");
	        int numero2 = sc.nextInt();

	        // Compara los númros y muestra el resultado
	        boolean sonIguales = numero1 == numero2;
	        System.out.println ("Son iguales" + sonIguales);

	        // Cierra el escáner
	        sc.close();
	    }
	    
	}