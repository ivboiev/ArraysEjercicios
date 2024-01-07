package ArraysEj1;
public class ArraysEj1 {

	public static void main(String[] args) {
		String cadena[] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
		int tabla[] = new int [cadena.length];
        for(int i = 0; i < cadena.length; i++) { //Hago for para poner la longitud de caracteres de cadena en la misma posición.
        	tabla[i] = cadena[i].length();   //Posicion = la longitud de caracteres
        	
        }
        for(int i = 0; i < cadena.length; i++) {            //Para mostrar en la pantalla
        	System.out.println(cadena[i] + ": " + tabla[i]);
        }

	}

}
