package condicionales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estructura_Condicional {
	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		// si = if
		System.out.println("dame a");
		int a = scanner.nextInt();
		System.out.println("dame b ");
		int b = scanner.nextInt();
				
		// tipo de operadores relacionales (<,>,==,!=)
		// tipo de operadores logicos (|| && !)
		// if ternarios
		if (a < b) {
			System.out.println("a es menor que b");
		} else if (a > b) {
			System.out.println("a no es menor que b ");
		} else {
			System.out.println("a es igual q ue b ");
		}
		if (a < b && a > 0 && a < 10 || a%2==0) {

			           	System.out.println("ingresando.......");	
			
		}
		if(a>0) {
			b =-1;
		}else {
			b = 1;
		}
		//if ternario 
		b = a > 0 ? -1 : 1;
		System.out.println(" el valor de b es :" +b);
		//condicional switch 
	String letra = "Mostrar";
	switch(letra) {
	
	case "Crear":
		System.out.println("crear");
		break;
	case "Actualizar":
		System.out.println("letra C");
		break;
	case"Mostrar ":
		System.out.println("letra D");
		break;
	}
	
	
	boolean activo = true;
	if(!activo ) {
		System.out.println("el alumno no está activo ");
	}else if (activo) {
		System.out.println("el alumno está activo");
	}else {
		System.out.println("el alumno está activo");
	}
//if ternarios 
	String votar = "";
	int edad = 20;
	int edad2 = 17;

	if(edad >=18) {
		votar = "si puede votar";
	}else {
		votar = "no puede votar";
	}
	System.out.println(votar);
	votar = edad2 >=18 ? "si puede votar":"no puede votar";
	System.out.println(votar);
	//ciclos for, while ,do while 
	for (int i = 0;i<5;i++) {
		System.out.println(i);
	}
	for(int i=4;i>=0;i--) {
		System.out.println(i);
	}
	//factorial
	int n = 5;
	long factorial = 1;
	int i = 1;
	/*for(int i =n;i>0;i--) {
		factorial *= i;//factorial = factorial * i;
	}
	System.out.println("el factorial de 5 es :"+factorial);
	
	while (i<=n) {
		//factorial *=i;
		//i++;
	}
	//System.out.println("el factorial de 5 es : "+factorial);
	*/
	do {
		factorial *= i;
		i++;
	}while(i<=n);
	System.out.println("el factorial de 5 es : "+factorial);
	//for each
	List<String> nombres = new ArrayList<>();
	nombres.add("Juan");
	nombres.add("María");
	nombres.add("Pedro");
	nombres.add("Marcos");
	for (String nom:nombres) {
		System.out.println(nom);
	}
}
}
