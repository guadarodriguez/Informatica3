package PilasColas;

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Inicialmente, la pila está vacía
    }

    // Método para agregar un elemento a la pila
    public void push(int value) {
        if (isFull()) {
            System.out.println("La pila está llena. No se puede realizar push.");
            return;
        }
        stackArray[++top] = value;
    }

    // Método para eliminar el elemento en la cima de la pila
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede realizar pop.");
            return -1; // Valor de retorno indicando que la pila está vacía
        }
        return stackArray[top--];
    }

    // Método para ver el elemento en la cima de la pila sin eliminarlo
    public int top() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No hay tos.");
            return -1; // Valor de retorno indicando que la pila está vacía
        }
        return stackArray[top];
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == -1;
    }

    // Método para verificar si la pila está llena
    public boolean isFull() {
        return top == maxSize - 1;
    }}