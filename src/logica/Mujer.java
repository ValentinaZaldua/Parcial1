package logica;

public class Mujer extends TasaMetabolicaBasal{
		
		public Mujer(int peso, int altura, int edad) {
			super(peso, altura, edad);
		}
		
		public long calculo() {
			return (int) (447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad)) ; 
	}
		
	}
	
