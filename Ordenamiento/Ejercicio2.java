package Ordenamiento;
/*Implementar función que reciba un array y que lo muestre en pantalla. */
public class Ejercicio2 {
    public static void main(String[] args) {
        int array [] = new int [10];
        Mostrar(array);
    }
    public static void Mostrar (int [] v){
        for(int numero : v){
            System.out.println(numero + " ");
        }
    }
}
