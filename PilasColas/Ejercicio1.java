package PilasColas;

/*Implementación de una Pila:
a. Crea una clase que represente una pila utilizando un arreglo.
b. Implementa métodos para push (agregar un elemento), pop (eliminar
el elemento en la cima) y top (ver el elemento en la cima sin
eliminarlo).
c. Prueba tu implementación utilizando diferentes operaciones y
elementos. */


public class Ejercicio1 {

public static void main(String[] args) {
    Stack pila = new Stack(10);
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
    
    System.out.println("elemento tos " + pila.top());
    System.out.println("esta vacia? " + pila.isEmpty());

    System.out.println("elemento eliminado: " + pila.pop());
    System.out.println("elemento eliminado: " + pila.pop());
    System.out.println("elemento eliminado: " + pila.pop());

    System.out.println("nuevo tos: " + pila.top());

    while (!pila.isEmpty()){
        System.out.println("elemento eliminado: " + pila.pop());
    }
    System.out.println("nuevo tos: " + pila.top());
    System.out.println("esta vacia? " + pila.isEmpty());
}
    

    

}
