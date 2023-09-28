package Recursividad;
/*Escriba una función void recursiva que reciba como parámetro solo un
entero positivo n y que despliegue todos los enteros impares menores a n */
public class Ejercicioamaodelo2 {
    public static void main(String[] args) {
        int n = 10;
        Impares(n);
    }
    public static void Impares (int n){
        if (n == 0){
            return;
        }
        if (n%2!=0){
            System.out.println(n);
            Impares(n-1);
        }else{
            Impares(n-1);
        }


    }
}
