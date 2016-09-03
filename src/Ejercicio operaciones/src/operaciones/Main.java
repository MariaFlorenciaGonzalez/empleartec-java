package operaciones;

public class Main {

	public static void main(String[] args) {
		
		Operacion op = new Suma(2,3);
		System.out.println("Sumar 2 + 3 = " + op.calcular());
	}

}
