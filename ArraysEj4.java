package ArraysEj1;

public class ArraysEj4 {

	public static void main(String[] args) {
		String cadena[] = {"sUUUe","charLotte","aNna","MikE","WillIam","eD"};
		int mayus = 0;   //Hago contador de mayusculas
		int minus = 0;   //Hago contador de minusculas
		
		for(int i = 0; i < cadena.length; i++) {
			for(int j = 0; j < cadena[i].length(); j++){	
				if(cadena[i].charAt(j) >= 'a' && cadena[i].charAt(j) <= 'z') { //Si cadena tiene letra de a hasta z, minus aumenta a 1
					minus++;
				}
				else if(cadena[i].charAt(j) >= 'A' && cadena[i].charAt(j) <= 'Z') { //Si cadena tiene letra de A hasta Z, mayus aumenta a 1
					mayus++;
			}
			}
			
		    //Mostrar en la pantalla
			System.out.println(cadena[i] + " tiene " + minus + " minusculas y " + mayus + " mayusculas");
			mayus = 0;
			minus = 0;
		}

	}

}
