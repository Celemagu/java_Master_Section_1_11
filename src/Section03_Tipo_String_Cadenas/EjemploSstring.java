package Section03_Tipo_String_Cadenas;

public class EjemploSstring {

	public static void main(String[] args) {
		String curso = "Programacion Java";
		String curso2= new String ("programacion Java");	
		
		boolean esIgual = curso == curso2;
		System.out.println("curso == curso2 = " + esIgual);
	
	
		boolean esIgual2 = curso.equals(curso2);
		System.out.println("curso.equals(curso2) = " + esIgual2);
		
		String curso3 = "Programacion Java";
		esIgual = curso == curso3;
		System.out.println("curso == curso3 = " + esIgual);
		
		
		
	}
}
