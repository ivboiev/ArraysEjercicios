package ArraysEj1;

public class ArraysEj3 {

	public static void main(String[] args) {
		String cadena[] = {"sUe","charLotte","aNna","MikE","WillIam","eD"};
		int may = 0;   //Hago contador
		
		for(int i = 0; i < cadena.length; i++) {
		   for(int j = 0; j < cadena[i].length(); j++) {    //Segundo "for" para buscar mayuscula en cada cadena
			   if(cadena[i].charAt(j) >= 'A' && cadena[i].charAt(j) <= 'Z') {  //Si cadena tiene letra de A hasta Z, may aumenta  a uno
				   may++;
			   }
		   }
		   //Mostrar en la pantalla
		   System.out.println(cadena[i] + " tiene " + may + " mayusculas");
		   may = 0;
		}

	}

}
