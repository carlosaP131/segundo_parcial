package jerarquia_de_operadores;

public class JerarquiaOperadores {
	
	public static void main(String[] args) {
		
		System.out.print("tema 4.2.1 Prioridad de opreadores ");

		  System.out.println("y tema4.2.2 evaluacion de expreciones");
		System.out.println("resultado: " + (2+4*10/5));
	   System.out.println("resultado: "+ (10*3/6%2));
	   System.out.println("resultado: "+(2*4/2*5-2/2*1));
	   System.out.println("resultado: "+ (20/5*2+8-4/2*2));
	   System.out.println("resultado: "+(2/2*5+10/5));
	   System.out.println("4.2.3promocion de tipos de datps");
	   //tipo de datos primitivos y obbjetos 
	   // byte, short, int, long 
	   byte x=10;
	   //proporción de forma automática
	   int y=x;
	   //la promoción no se da de forma automática 
	   //es nesesaria la conversion de int a short
	   //con el casteo
	   short z=(short)y;
	   //byte->short->int->long la conversión es automática
	   //pero de forma inversa requiere de casteo 
	   System.out.println("tipo de dato byte "+x+"\n tipo de dato y "+y+"\n tipo de dato z"+z);
	   //letras mayusculas 65-90
	   //letras minusculas 97-122
	   char caracter ='a';
	   char letra = 95;
	   char arrayletras[]= {'9','6','5'};
	   System.out.println("caracter "+caracter+" caracter2 "+letra+" arreglo "+arrayletras[2]);
	   for(int i =97;i<125;i++) {
		  if(i%4 != 0)
		   System.out.print((char)i+"-");
		  else {
			  System.out.println((char)i);
			  System.out.println();
		  }
	   }
	}

}
