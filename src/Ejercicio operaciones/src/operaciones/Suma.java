package operaciones;

public class Suma extends Operacion {

	//Constructor
	public Suma (int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
		
	//Método
	@Override
	public int calcular() {
		return num1 + num2;
	}
		
}
