package ArraysEj1;

public class ArraysEj10 {

	public static void main(String[] args) {
		String cadena[] = {"Sue","Mike","Anna","b","William","Mike"};
		
		boolean repetidas = false;
		
		for(int i = 0; i < cadena.length; i++ ) {
			for(int j = 0 + 1; j < cadena.length; j++) {
				if(cadena[i].equals(cadena[j])) { //cadena[i] es igual a cadena[j], boolean repetidad se convierte a true
					repetidas = true;
				}
			}
		}
		//Mostrar en la pantalla
		if (repetidas) {
			System.out.println("Hay cadenas repetidas");
		}
		else {
			System.out.println("No hay cadenas repetidas");
		}
	
		}

	}


