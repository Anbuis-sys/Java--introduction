package clase;
import java.util.Scanner;
public class Clase {
	public static void main(String[] args) {
		
		//Ejercicio 1: Operadores Lógicos (&& y ||)
		/*Indicación: Escribe un programa que tome dos valores booleanos a y b y verifique si ambos son true o al menos uno de ellos es true. Imprime un mensaje adecuado para cada caso.*/
		
		boolean a = true, b = false;
		
	     if (a == true && b == true) {
	    	 System.out.println("Son true"); 
	     } else if (a == true || b == true){
	    	 System.out.println("Una de las dos es true");
	     }else { 
	    	 System.out.println("ambas son false");
	     }
		
		
		/*Ejercicio 2: Operadores Lógicos (!)
		Indicación: Escribe un programa que tome un valor booleano c e invierta su valor usando el operador !. Imprime el valor original y el invertido.*/
		
		boolean c = true;
		
		System.out.println("el valor de c es " + c + " y su valor invertido es " + !c);
	     
		
		/*Ejercicio 3 : Determinar si un número es positivo, negativo o cero
		Indicación: Escribe un programa en Java que solicite al usuario ingresar un número entero. Utiliza una estructura if-else para determinar si el número es positivo, negativo o cero. Imprime un mensaje adecuado para cada caso.*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingresa un numero: ");
		int numero = scanner.nextInt();
		
		if (numero > 0) {
			System.out.println("Tu numero es positivo");
		} else if (numero == 0) {
			System.out.println("Tu numero es cero");
		} else {
			System.out.println("Tu numero es negativo");
		}
		
		
		/*Ejercicio 4: Sistema de Calificaciones
		Indicación: Escribe un programa en Java que solicite al usuario ingresar una calificación en formato de letra (A, B, C, D, F). Utiliza una estructura switch para determinar el significado de la calificación y muestra un mensaje adecuado para cada caso (A para "Excelente", B para "Bueno", etc.). Si se ingresa una letra diferente, imprime un mensaje indicando que la calificación es inválida.*/
		
		System.out.println("Ingresa la calificación en el formato de letras A, B... ");
		String nota = scanner.next();
		switch(nota) {
		
		case "A": 
			System.out.println("Excelente");
			break;
		case "B": 
			System.out.println("Bueno");
			break;
		case "C": 
			System.out.println("Regular");
			break;
		case "D": 
			System.out.println("Irregular");
			break;
		case "E": 
			System.out.println("Deficiente");
			break;	
		case "F": 
			System.out.println("Insuficiente");
			break;	
			default: System.out.println("Calificación inválida");
			break;
		}
		
		/*Ejercicio 5: Gestión de Notificaciones en una Red Social
		Indicación: Escribe un programa en Java que simule la gestión de notificaciones en una red social. Solicita al usuario ingresar un número del 1 al 5 que representa diferentes tipos de notificaciones. Utiliza una estructura switch para mostrar el mensaje correspondiente a cada tipo de notificación.*/
		
		  System.out.print("Introduce un número del 1 al 5 para seleccionar un tipo de notificación: ");
	        int opcion = scanner.nextInt();

	       
	        switch (opcion) {
	            case 1:
	                System.out.println("Tienes una nueva solicitud de amistad.");
	                break;
	            case 2:
	                System.out.println("Alguien ha comentado tu publicación.");
	                break;
	            case 3:
	                System.out.println("Tienes un nuevo mensaje privado.");
	                break;
	            case 4:
	                System.out.println("Te han etiquetado en una foto.");
	                break;
	            case 5:
	                System.out.println("Hay una nueva reacción a tu publicación.");
	                break;
	            default:
	                System.out.println("Número no válido. Por favor, introduce un número del 1 al 5.");
	                break;
	        }

		scanner.close();
		
	}//metodo

}//Clase
