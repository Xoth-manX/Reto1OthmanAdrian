package reto;

import reto.Funciones1;
import java.util.Locale;
import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int opcion, a, b;
		do {
			System.out.println("Elige la operación:");
			System.out.println("1. Suma");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			System.out.print("\nEscoge una opción: ");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.print("Dame el primer número que quieras sumar: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Dame el segundo número que quieras sumar: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("La suma es " + Funciones1.sumar(a, b));
				break;
			case 2:
				System.out.print("Dame el primer número que quieras restar: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Dame el segundo número que quieras restar: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("La suma es " + Funciones1.restar(a, b));
				break;
			case 5:
				System.out.println("Dame un número: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Este número es par: --> " + Funciones1.esPar(a));
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (!(opcion == 0));
	}
}