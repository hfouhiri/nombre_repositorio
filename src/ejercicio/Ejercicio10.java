package ejercicio;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        // Solicita al usuario la longitud del lanzamiento en metros
		        System.out.print("Introduce la longitud del lanzamiento en metros: ");
		        double longitudMetros = sc.nextDouble();

		        // Convierte la longitud a centímetros y obtén la parte entera
		        int longitudCentimetros = (int) (longitudMetros * 100);

		        // Muestra la parte entera en centímetros
		        System.out.println("La longitud en centímetros es: " + longitudCentimetros + " cm");

		        // Cierra el escáner
		        sc.close();
		    }

	}