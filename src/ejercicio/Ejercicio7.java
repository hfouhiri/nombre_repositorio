package ejercicio;
import java.util.Scanner;
public class Ejercicio7 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Solicita al usuario las distancias en diferentes unidades
	        System.out.print("Introduce la distancia en milímetros: ");
	        double milimetros = sc.nextDouble();

	        System.out.print("Introduce la distancia en centímetros: ");
	        double centimetros = sc.nextDouble();

	        System.out.print("Introduce la distancia en metros: ");
	        double metros = sc.nextDouble();

	        // Convierte las distancias a centímetros (1 metro = 100 centímetros, 1 centímetro = 10 milímetros)
	        double distanciaEnCentimetros = milimetros / 10 + centimetros + metros * 100;

	        // Muestra la suma en centímetros
	        System.out.println("La suma de las distancias en centímetros es: " + distanciaEnCentimetros + " cm");

	        // Cierra el escáner
	        sc.close();
	    }

	}