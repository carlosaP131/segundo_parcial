package ejercicio_1;

public class Principal   {
        private static Multiplicacion m = new Multiplicacion();
	public static void main(String[] args) {
		m.setNum1(5);
		m.setNum2(6);
		m.setRes();
		System.out.println("resultado "+ m.getRes());		
	}

}
