package ArraysEj1;

public class ArraysEj8 {

	public static void main(String[] args) {
		String cadena[] = {"Asue","Acharlotte","Anna","Mike","aWilliam","aEd"};
		//Hecho dos contadores
		int mayus = 0;
		int minus = 0;  
		
		for(int i = 0; i < cadena.length; i++) {
			if(cadena[i].startsWith("a")) {  //Si cadena comienza por a, minus aumenta a 1
				minus++;
			}
			else if(cadena[i].startsWith("A")) {
				mayus++;                     //Si cadena comienza por A, mayus aumenta a 1
			}
		}
		//Mostrar en la pantalla
		System.out.println("Número de cadenas que comienzan por A " + mayus);
		System.out.println("Número de cadenas que comienzan por a " + minus);

	}

}
