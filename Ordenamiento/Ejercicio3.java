package Ordenamiento;
import java.util.Random;
/*Implementar que reciba la longitud de array y retorne un array cargado de números
aleatorios. */
public class Ejercicio3 {
    public static void main(String[] args) {
        int [] array = new int [10];
        CargarArray(array, array.length);
        for(int numero : array){
            System.out.println(numero + " ");
        }
        
    }
    public static void CargarArray (int [] v, int n){
        Random random = new Random();
        for (int i = 0; i < n ; i++){
            v[i] = random.nextInt(1000);
        }

    }
}
