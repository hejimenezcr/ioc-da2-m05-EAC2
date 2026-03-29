package main;

public class Acciones {

	public static int contarVocalesSinAcento(String cadena) {
        // Implementa la lógica para contar las vocales sin acento en la cadena
        int contador = 0;
        for (char caracter : cadena.toCharArray()) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String reemplazarEspaciosPorGuiones(String cadena) {
        // Implementa la lógica para reemplazar los espacios por guiones en la cadena
        return cadena.replaceAll(" ", "_");
    }

}
