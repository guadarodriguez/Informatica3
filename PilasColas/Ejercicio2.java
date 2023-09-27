package PilasColas;
import java.util.Stack;
import java.util.Scanner;
/*2. Comprobación de Palíndromos:
a. Crea un programa que verifique si una cadena es un palíndromo (se
lee igual de izquierda a derecha y de derecha a izquierda).
b. Primero elimina espacios en blanco y convierte la cadena a
minúsculas. Luego, llena una pila con la primera mitad de los
caracteres de la cadena y compara los caracteres de la segunda mitad
con los elementos desapilados de la pila para determinar si es un
palíndromo. */

public class Ejercicio2 {
    public static void main(String[] args) {
        String palabra;
        int tamanio, mitad;
        boolean palindromo = false;
        System.out.println("ingresar una palabra");
        Scanner teclado = new Scanner(System.in);
        palabra = teclado.nextLine();
        palabra = palabra.toLowerCase();
        System.out.println(palabra);
        tamanio = palabra.length();
        mitad = tamanio/2;

        Stack <Character> pila = new Stack<>();
        for(int i=0; i<mitad;i++){
            pila.push(palabra.charAt(i));
        }
        // Compara los caracteres de la segunda mitad con los elementos desapilados de la pila
        for (int i = mitad; i < tamanio; i++) {
            char currentChar = palabra.charAt(i);
            char poppedChar = pila.pop();
            
            if (currentChar == poppedChar) {
                palindromo = true; // es un palíndromo
            }
        }
        if (palindromo) {
            System.out.println("es una palabra palindroma");
            
        } else {
            System.out.println("no es palindroma");
        }




        
    }
}
