package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Crearemos que una variable que recogera la cadena del usuario
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cadena:");
        //String cadena = "Hola Mundo!";
        //Trataremos la cadadena introducida
        String cadena = scanner.nextLine();
        //Cerraremos el scanner
        scanner.close();
        
        //Llamaremos a los metodos
        int cantidadVocales = Acciones.contarVocalesSinAcento(cadena);
        String cadenaSinEspacios = Acciones.reemplazarEspaciosPorGuiones(cadena);
        
        //Imprimiremos los resultados
        System.out.println("Cantidad de vocales sin acento: " + cantidadVocales);
        System.out.println("Cadena con espacios reemplazados por guiones: " + cadenaSinEspacios);
		
    }
    
    // Métodos estáticos definidos anteriormente

}
