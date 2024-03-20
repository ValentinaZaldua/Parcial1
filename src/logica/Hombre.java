package logica;

public class Hombre extends TasaMetabolicaBasal{
	
	public Hombre(int peso, int altura, int edad) {
		super(peso, altura, edad);
	}
	
	public long calculo() {
	return (long) (88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad)) ; 
}
	
}
