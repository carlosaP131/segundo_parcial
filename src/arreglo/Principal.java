package arreglo;

public class Principal {
	//inicializar matrizes
	private static byte matriz1[][]= {{2,2},{2,2}};
	private static short matriz2[][]= {{1,1},{2,1}};
	private static int matriz3[][]= new int[2][2];
	
	
	//inicializar areglos
	private static short sPuntos[] = { 1, 2, 3 };
	private static int puntos[] = { 1, 2, 3 };
	private static byte bPuntos[] = { 1, 2, 3 };
	private static double fPuntos[] = { 1.0, 2, 3 };
	private static int x;
	private static int y;
	private static int[] array = new int[5];

	public static void main(String[] args) {
		//imprimir arreglos 
		for (int i = 0; i < 3; i++) {
			System.out.println(
					"byte " + bPuntos[i] + "shorts " + sPuntos[i] + "enteros " + puntos[i] + "dobles " + fPuntos[i]);
		}
		//imprimir matrices
		for (int i =0;i<2;i++) {
			for (int j = 0;j<2;j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j] ;
				System.out.println("resultados "+matriz3[i][j]);
				
			}
			
		}
		for (int i =0;i<2;i++) {
			
			
			for (int j = 0;j<2;j++) {
				System.out.print(" "+ matriz3[i][j]);
				
				
			}
			System.out.println();
			
		}
		
		
		//inicializar arreglos
		x = 5;
		y = 10;
		array[0] = ++x;
		array[1] = y / x;
		array[2] = ++y;

		System.out.println("valores " + array[0] + " " + array[1] + " " + array[2]);
	}

}
