package Section02_Operadores;

public class PrimitivoBoolean {

	public static void main(String[] args) {
		
		boolean datoLogico = true;
		System.out.println("datoLogico = " + datoLogico);

		
		double d = 98765.23e-3; //98.76523
		System.out.println(d);
		float f = 1.2345e2f; //123.45
		System.out.println(f);
		
		datoLogico = d<f;
		System.out.println("datoLogico = " + datoLogico);
		
		boolean esIgual = (3-2 == 1);
		System.out.println("esIgual = " + esIgual);
	}

}
