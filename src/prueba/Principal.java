package prueba;
import java.util.ArrayList;
import java.util.List;
public class Principal {
	private static List<String> lista = new ArrayList<>();
	private static List<Palabras> listapalabras = new ArrayList<>();

	public static void main(String[] args) {
		lista.add("manzana");
		lista.add("pera");
		listapalabras.add(new Palabras("hola"));
		listapalabras.add(new Palabras("adios"));
		System.out.println(listapalabras.get(0).getPalabra());
	}

}
