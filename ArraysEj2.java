package ArraysEj1;

public class ArraysEj2 {

    public static void main(String[] args) {
        String cadena[] = {"Asu", "alisa", "anna", "Mike", "William", "AgataCristi"};
        
        // Uso auxiliar para guardar primera cadena
        String auxiliar = cadena[0];
        int posicion = 0;
            
        for (int i = 0; i < cadena.length; i++) {
            // Comparo y uso "ignore case" para ignorar las diferencias de mayúsculas y minúsculas
        	
        	int compare = cadena[i].compareToIgnoreCase(auxiliar);
            if (compare < 0) {        
                auxiliar = cadena[i];
                posicion = i;
            }
        }

        // Imprimir la cadena y su posición
        System.out.println("La cadena alfabéticamente más primera es: " + auxiliar);
        System.out.println("Está en la posición: " + (posicion + 1));
    }
}