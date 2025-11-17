package reto;

public class Funciones1 {
	public static int sumar(int a, int b) {
		return a + b;
	}
	
	public static int restar(int a, int b) {
		return a - b;
	}
	
	public static boolean esPar(int a) {
		if (a%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esImpar(int a) {
		if (a%2!=0) {
			return true;
		} else {
			return false;
		}
	}
}
