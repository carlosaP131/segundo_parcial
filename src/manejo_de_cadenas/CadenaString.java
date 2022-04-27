package manejo_de_cadenas;

public class CadenaString {

	
	
	public static void main(String[] args) {
		//las cadenas de caracteres se reepresentan en java como secuencia de caracteres unicode encerradas entre comillas 
		//1.-la clase estring
		// inicializar una cadena con la clase String
		String cadena1 = "abc";// pero una variable string puede recivir valores distintos
		String cadena2 = new String("abc");//las cadenas de los objetos 
										  // string no pueden modificarse  (crecer, cambiar un caracter)
										  
		
		//ejemplos con variable String (cadena1)
		System.out.println("obtener la longitud "+cadena1.length());
		System.out.println("comparar cadenas forma 1 "+cadena1.contentEquals(cadena2+"d")); //true o false
		System.out.println("comparar cadenas forma 2 "+cadena1.compareTo(cadena2));//cuando es  = es cerocuando es cd1<cd2 =<0
																					//cuando la cd1>cd2 =>0
		System.out.println("convertir cadena 1 a Mayusculas "+cadena1.toUpperCase());
		cadena1 = cadena1.toUpperCase();
		
		System.out.println("comparar sin importar si sean mayusculas" + cadena1.equalsIgnoreCase(cadena2));
		cadena1 = cadena1.toLowerCase();
		//charAt()
		System.out.println("buscar la letra a "+cadena1.charAt(0));
		System.out.println("extraer subcadenas de la cadena1 "+ cadena1.substring(1,3));
	//palindromo con charAt
		String palabra ="anita lava la tina";
		palabra = palabra.replace(" ","");
		int cont = 0;
		for(int i=0;i<palabra.length();i++) {
			if(palabra.charAt(i) == palabra.charAt(palabra.length()-(i+1))) {
				cont++;
			}else {
				System.out.println("no es palindromo");
				break;
			}
		}
		if(cont == palabra.length()) {
			System.out.println("si es palindromo");
		}
		//2. string buffer
		
		
		
		
		
		//3. string builder
}
}
