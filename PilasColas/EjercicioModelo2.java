package PilasColas;
/*User
una pila de objetos contienen un numero real esta almacenada en memoria dinamica. un puntero p apunta a la base y 
otro t apunta al ultimo elemento agregado. suponer que ya esta cargada con varios valores. 
generar un fragmento de programa java que lea los dos ultimos numeros agregados y que almacene la suma de estos en la misma pila  */
public class EjercicioModelo2 {
    public static void main(String[] args) {
        Stack pila = new Stack(10);
        int num1, num2, suma;
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        pila.push(8);
        pila.push(9);
        pila.push(10);

        num1 = pila.pop();
        num2 = pila.pop();
        suma = num1 + num2;
        
        pila.push(suma);

        System.out.println(pila.pop());


        }

    
}
