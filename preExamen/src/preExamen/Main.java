package preExamen;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Main Inicio= new Main();
		Inicio.Lector();
	
	}
	
	public void Lector() {
		System.out.println("Pre Examen");
		System.out.println("");
		
		
	
		System.out.println("EJERCICIO 01");
		
		System.out.println("Ingrese la frase:");
		Scanner frase=new Scanner(System.in);
		String nFrase;
		try {
			nFrase = frase.nextLine();
		} catch (Exception e) {
			System.out.println("");
		}
		System.out.println("Ingrese una frase:");
		Scanner distancia=new Scanner(System.in);
		int nDistancia;
		try {
			nDistancia = Integer.parseInt(distancia.nextLine());
		} catch (Exception e) {
			System.out.println("Ingrese un número");
		}
		primerProblema ej01= new primerProblema(nFrase, nDistancia);
		ej01.cifrarCesar("",0);
		System.out.println("La frase invertida cifrada es: " + ej01.Salida1);
		System.out.println("");
		
	}
}


