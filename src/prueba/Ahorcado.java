package prueba;
import java.util.Scanner;

import java.util.Random;

 

public class Ahorcado {

 


    public static void main(String[] args) {

        final int INTENTOS_TOTALES = 10; // Constante con el limite de fallos

        int intentos = 0;

        int aciertos = 0;
       
      

        Scanner teclado = new Scanner(System.in);

        teclado.useDelimiter("\n");

        char resp;

        // Random para que sea una palabra al azar

        Random rnd = new Random();

        // Creamos unas palabras y le asignamos una aleatoria a una varibale

        String arrayPalabras[] = new String[10];

        arrayPalabras[0] = "hola";
        arrayPalabras[1] = "adios";
        arrayPalabras[2] = "palabra";
        arrayPalabras[3] ="jugar";
        arrayPalabras[4] ="JAVA";
        arrayPalabras[5] ="programacion";
        arrayPalabras[6] ="objeto";		
        arrayPalabras[7] ="clase";
        arrayPalabras[8] ="metodo";
        arrayPalabras[9] ="eclipse";
        
        do {

 

        // Desguazamos la palabra y la guardamos en un array de caracteres

        int alea = rnd.nextInt(9);

        char[] desguazada = desguaza(arrayPalabras[alea]);

        char[] copia = desguaza(arrayPalabras[alea]); // Algo auxiliar para mas tarde

        // Array para pintar guiones en pantalla

        char[] tusRespuestas = new char[desguazada.length];

 

        // Rellenamos palabras con guiones

        for(int i = 0; i < tusRespuestas.length; i++){

            tusRespuestas[i] = '_';

        }

 

        // Empezamos a pintar mierdas en pantalla

        System.out.println("Adivina la palabra!");

 

        // Mientras que no nos pasemos con los intentos y no la acertemos...

        while(intentos < INTENTOS_TOTALES && aciertos != tusRespuestas.length){

            imprimeOculta(tusRespuestas);

            // Preguntamos mierdas por teclado

            System.out.println("\nIntroduce una letra: ");

            resp = teclado.next().toLowerCase().charAt(0);

            // Recorremos el array y comprobamos si se ha producido un acierto

            for(int i = 0; i < desguazada.length; i++){

                if(desguazada[i]==resp){

                    tusRespuestas[i] = desguazada[i];

                    desguazada[i] = ' ';

                    aciertos++;

                }

            }

            intentos++;

        }

        // Si hemos acertado todas imprimimos un mensaje

        if(aciertos == tusRespuestas.length){

            System.out.print("\nFelicidades!! has acertado la palabra: ");

            imprimeOculta(tusRespuestas);

        }

        // Si no otro

        else{

            System.out.print("\nerror la palabra era  : ");
         
            for(int i = 0; i < copia.length; i++){

                System.out.print(copia[i] + " ");

            }
           

        }

        // Reseteamos contadores

        intentos = 0;

        aciertos = 0;

        // Volvemos a preguntarle al usuario si quiere volver a perder el tiempo

        resp = pregunta("\n\nQuieres volver a jugar?",teclado);

        }while(resp != 'n');

 

    }

 

     /**

     * Esto desguaza el String en un array de caracteres

     * @return array de letras.

     */

    private static char[] desguaza(String palAzar){

        char[] letras;

        letras = new char[palAzar.length()];

        for(int i = 0; i < palAzar.length(); i++){

            letras[i] = palAzar.charAt(i);

        }

        return letras;

    }

 

    /**

     * Esto imprime la palabra con espacios

     * @param tusRespuestas el array de caracteres

     */

    private static void imprimeOculta(char[] tusRespuestas){

 

        for(int i = 0; i < tusRespuestas.length; i++){

            System.out.print(tusRespuestas[i] + " ");

        }

    }

 

  

    public static char pregunta(String men, Scanner teclado) {

        char resp;

        System.out.println(men + " (s/n)");

        resp = teclado.next().toLowerCase().charAt(0);

        while (resp != 's' && resp != 'n') {

            System.out.println("Error! solo se admite S o N");

            resp = teclado.next().toLowerCase().charAt(0);

        }

        return resp;

    }

 

}