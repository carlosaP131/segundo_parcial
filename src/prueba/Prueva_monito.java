package prueba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Prueva_monito {
		

		public static void main(String[] args) {
			
			String Arraycabeza[][] = {{"   ......    "},
									  {"^//      \\\\^"}, 
									  {" ||  o o  || "},
									  {" ||   °   || "},
									  {" \\\\   ^   // "},
									  {"   .......   "}};
			String Arraycuerpo[][] = {{"      ||    "},
									  {"      ||    "},	
									  {"      ||    "}, 
									  {"      ||    "},
									  {"      ||    "},
									  {"      ||    "},
									  {"      ||    "},};
			for(int a=0;a<4;a++) {
			switch(a) {
			case 0:
			for (int i = 0; i < 6; i++) {
				System.out.println("");
				for (int j = 0; j < 1; j++) {
					System.out.print(Arraycabeza[i][j]);
				}
				}
			case 1 :
				for (int k = 0; k < 6; k++) {
					System.out.println("");
					for (int l = 0; l < 1; l++) {
						System.out.print(Arraycuerpo[k][l]);
			
					}
					}
			}
			        
			} 
			    }
		}
		
			

		


