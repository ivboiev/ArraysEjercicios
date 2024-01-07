package ArraysEj1;

public class ArraysEj7 {

	public static void main(String[] args) {
		String cadena[] = {"Zarzar", "sigzar", "anna", "gregori", "frizar", "Fizarmo"};
		
		String subcadena = "zar";
		int cantidad = 0;  //Hago contador
		
		for(int i = 0; i < cadena.length; i++) {
			if(cadena[i].contains(subcadena)) {   //Uso comando "contains" para ver si cadena contiene zar
				cantidad++;
			}
		}
        System.out.println("Número de cadenas que contienen zar es " + cantidad);
	}

}
