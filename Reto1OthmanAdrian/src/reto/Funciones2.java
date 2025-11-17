package reto;

public class Funciones2 {
public static int multiplicar(int a,int b) {
	return a*b;
}
public static int dividir(int a, int b) {
	if (b==0) {
		System.out.println("error");
	}else {
		
	}
	return a/b;
}
public static boolean esPositivo(int a) {
	if (a>=0) {
		return true;
	}
	return false;
}
public static boolean esNegativo(int a) {
	if (a<0) {
		return true;
	}
	return false;
}

}
