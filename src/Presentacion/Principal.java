package Presentacion;

import java.util.Scanner;

import logica.TasaMetabolicaBasal;

public class Principal {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
					System.out.println("Seleccione su genero:");
					System.out.println("0. Salir");
					System.out.println("1. Hombre");
					System.out.println("2. Mujer");
					int op = sc.nextInt();
					
					try {
						switch (op) {
						case 1: 
							calcularMTBHombre (sc);
							break;
						case 2:
							calcularMTBMujer(sc);
							break;
						default:
	                        System.out.println("Opción inválida.");
						}
					} catch (Exception e) {
						e.getMessage();
					}
				}
		
			//sc.close();

	}

	private static void calcularMTBMujer(Scanner sc) {
		System.out.println("Ingrese su peso en gramos");
		int peso = sc.nextInt();
		System.out.println("Ingrese su altura e centimetros");
		int altura = sc.nextInt();
		System.out.println("Ingrese su edad en años");
		int edad = sc.nextInt();
		
		int resultadoMujer = TasaMetabolicaBasal.Mujer(peso, altura, edad);
		System.out.println("Su MTB es: " + resultadoMujer);		
	}

	private static void calcularMTBHombre(Scanner sc) {
		System.out.println("Ingrese su peso en gramos");
		int peso = sc.nextInt();
		System.out.println("Ingrese su altura en centimetros");
		int altura = sc.nextInt();
		System.out.println("Ingrese su edad en años");
		int edad = sc.nextInt();
		
		long resultadoHombre = TasaMetabolicaBasal.Hombre(peso, altura, edad);
		System.out.println("Su MTB es: " + resultadoHombre);
	}		
}
