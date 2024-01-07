package ArraysEj1;

public class ArraysEj9 {

	public static void main(String[] args) {
		String cadena[] = {"Sue","Ed","Anna","Mike","William","Mike"};
		int maxCaracteres = 0;  //Va a mostrar cantidad de caracteres en la cadena
		int posicion = 0;  //Va a mostrar posición de cadena con más carácteres
		
		for(int i = 0; i < cadena.length; i++) {
			
				if(cadena[i].length() > maxCaracteres) {  //Si cantidad de carácteres en la cadena es más que maxCaracteres, 
					maxCaracteres = cadena[i].length();                  // entonces maxCaracteres = cadena[i].length()
					posicion = i;
				}
			
		}
		//Mostrar resultado en la pantalla
        System.out.println("Cadena con más vocales esta en la posición " + posicion + " y tiene "+ maxCaracteres + " carácteres");
	}

}
