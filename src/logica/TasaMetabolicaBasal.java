package logica;

public class TasaMetabolicaBasal {
	protected double peso;
	protected double altura;
	protected double edad;
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getEdad() {
		return edad;
	}
	public void setEdad(double edad) {
		this.edad = edad;
	}
	
	public TasaMetabolicaBasal(int peso, int altura, int edad) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	public static long Hombre(int peso, int altura, int edad) {
		return (long) (88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad)) ; 
	
	}
	
	public static int Mujer(int peso, int altura, int edad) {
		return (int) (447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad)) ; 
	
	}
}
