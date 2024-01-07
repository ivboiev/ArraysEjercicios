package ArraysEj1;

public class ArraysEj6 {

    public static void main(String[] args) {
        String cadena[] = {"SueeuS", "Charlotte", "AnnA", "Mike", "William", "edde"};

        boolean capicua; 
        for (int i = 0; i < cadena.length; i++) {
            capicua = true;


            for (int j = 0; j < cadena[i].length() / 2; j++) {   //cadena[i].length() / 2 porque quiero que compare primera mitad de palabra col segunda
            	
                // Buscamos si caracteres no son iguales
                if (cadena[i].charAt(j) != cadena[i].charAt(cadena[i].length() - 1 - j)) {
                    capicua = false;
                   
                }
            }

            // Mostrar en la pantalla
            if (capicua) {
                System.out.println(cadena[i] + " es capicua");
            } else {
                System.out.println(cadena[i] + " no es capicua");
            }
        }
    }
}