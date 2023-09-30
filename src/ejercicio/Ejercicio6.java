package ejercicio;
import java.util.Scanner;
public class Ejercicio6 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Solicita al usuario una cantidad de segundos
	        System.out.print("Introduce la cantidad de segundos: ");
	        int segundos = sc.nextInt();

	        // Calcula las horas, minutos y segundos
	        int horas = segundos / 3600; // 1 hora = 3600 segundos
	        int minutos = (segundos % 3600) / 60; // 1 minuto = 60 segundos
	        int segundosRestantes = segundos % 60;

	        // Muestra el resultado
	        System.out.println("Horas: " + horas);
	        System.out.println("Minutos: " + minutos);
	        System.out.println("Segundos: " + segundosRestantes);

	        // Cierra el escáner
	        sc.close();
	    }

	}