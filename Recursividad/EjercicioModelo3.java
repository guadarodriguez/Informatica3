package Recursividad;
/*Escribir una función recursiva que tenga un parámetro que sea entero
positivo y despliegue en la pantalla ese número de asteriscos: “*”, todos en
una línea */
public class EjercicioModelo3 {
    public static void main(String[] args) {
        int n = 10;
        recursiva(n);
    }
    public static void recursiva (int n){
        if (n == 0){
            return;
        }else{
            System.out.println("*");
            recursiva(n-1);
        }
    }
}
