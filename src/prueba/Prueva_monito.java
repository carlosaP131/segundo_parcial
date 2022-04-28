package prueba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Prueva_monito {
	static String Arraycabeza[][] = {{"   ......    "},
									 {"^//      \\\\^"}, 
									 {" ||  o o  || "},
									 {" ||   °   || "},
									 {" \\\\   ^   // "},
									 {"   .......   "}};
	static String Arraycuerpo[][] = {{"      ||    "},
									 {"      ||    "},	
									 {"      ||    "}, 
									 {"      ||    "},
									 {"      ||    "},
									 {"      ||    "},
									 {"      ||    "},};
	static String ArrayCuerpoBrazD[][] = {{"    //||    "},
									  	  {"   // ||    "},	
									      {"  //  ||    "}, 
								          {" //   ||    "},
								          {"      ||    "},
									      {"      ||    "},
								          {"      ||    "},};
	static String ArrayCuerpoBrazDEI[][] = {{"    //||\\\\    "},
									  	    {"   // || \\\\  "},	
									        {"  //  ||  \\\\"}, 
								            {" //   ||   \\\\"},
								            {"      ||    "},
									        {"      ||    "},
								            {"      ||    "},};
	static String ArrayCuerpoBrazosPi[][] = {{"    //||\\\\    "},
										  	 {"   // || \\\\  "},	
										     {"  //  ||  \\\\"}, 
									         {" //   ||   \\\\"},
									         {"      ||    "},
										     {"      ||    "},
									         {"    //      "},
									         {"   //       "},
									         {"  //        "},
									         {" //         "},};
	static String ArrayCuerpoBrazosPies[][] = {{"    //||\\\\    "},
										  	   {"   // || \\\\   "},	
										       {"  //  ||  \\\\  "}, 
									           {" //   ||   \\\\ "},
									           {"      ||        "},
										       {"      ||        "},
									           {"    //  \\\\    "},
									           {"   //    \\\\   "},
									           {"  //      \\\\  "},
									           {" //        \\\\ "},};

	static Scanner sn = new Scanner(System.in);
		public static void main(String[] args) {
			
			
			
			boolean salir = false;
		//for (int a = 0; a < 4; a++) {
			int a;
			do {
				
				System.out.println("\nEscribe una de las opciones");
		           a = sn.nextInt();
			switch (a) {
			case 6:
				imprimirCabeza();
				break;
			case 5:
				imprimirCabeza();
				imprimirCuerpo();
				break;
			case 4:
					imprimirCabeza();
					imprimirBrazoD();
					
				break;
			case 3:
					imprimirCabeza();
					imrprimirBrazos();
				break;
			case 2: 
				    imprimirCabeza();
				    imprimirBrazoyPieD();
				    break;
			case 1:
					imprimirCabeza();
					imprimirBrazosyPies();
					break;
			case 0:
				salir = true;
				break;
			}
		}while(!salir);
	//}
		}
	private static void imprimirCabeza() {
		for (int i = 0; i < 6; i++) {
			System.out.println("");
			for (int j = 0; j < 1; j++) {
				System.out.print(Arraycabeza[i][j]);
			}
		}
	}
	private static void imprimirCuerpo() {
		for (int k = 0; k < 7; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(Arraycuerpo[k][l]);

			}
		}
	}
	private static void imprimirBrazoD() {
		for (int k = 0; k < 7; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(ArrayCuerpoBrazD[k][l]);
			}
		}
	
	}
	private static void imrprimirBrazos() {
		for (int k = 0; k < 6; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(ArrayCuerpoBrazDEI[k][l]);
			}
		}
	}
	private static void imprimirBrazoyPieD() {
		for (int k = 0; k < 10; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(ArrayCuerpoBrazosPi[k][l]);
			}
		}
	}
	private static void imprimirBrazosyPies() {
		for (int k = 0; k < 10; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(ArrayCuerpoBrazosPies[k][l]);
			}
		}
	}
	}
