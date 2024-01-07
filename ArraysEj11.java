package ArraysEj1;

public class ArraysEj11 {

	public static void main(String[] args) {
		String cadena[] = {"Sue","Ed","Anna","Mike","William","Suzie"};
		int maxVocales = 0;
		int posicion = 0;
		
		for(int i = 0; i < cadena.length; i++) {
			for(int j = 0; j < cadena[i].length(); j++) {
				if(cadena[i].toLowerCase().contains("a")||
				   cadena[i].toLowerCase().contains("o")||
				   cadena[i].toLowerCase().contains("u")||
				   cadena[i].toLowerCase().contains("e")||
				   cadena[i].toLowerCase().contains("i")){
					maxVocales++;
					
				}
			}
		}
         System.out.println("Hay " + maxVocales);
	}

}
