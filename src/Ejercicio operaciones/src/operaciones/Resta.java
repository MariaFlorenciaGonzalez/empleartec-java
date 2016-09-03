package operaciones;

public class Resta extends Operacion {

	//Constructor
	public Resta(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Método
	@Override
	public int calcular() {
		return num1 - num2;
	}
}
