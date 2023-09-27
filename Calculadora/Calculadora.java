package Calculadora;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Calculadora{

    public static void main(String[] args) {
        int operacion = 0;
        Double numero1;
        Double numero2;
        String resultado;
        List <String> historico = new ArrayList <String> ();

        try (Scanner teclado = new Scanner (System.in)) {
           do{
            
                    System.out.println("---CALDULADORA---");
                    System.out.println("ingrese la operacion a realizar: ");
                    System.out.println("1- para sumar");
                    System.out.println("2- para restar");
                    System.out.println("3- para dividir");
                    System.out.println("4- para multiplicar");
                    System.out.println("5- para mostrar la lista de resultados");
                    System.out.println("6- para salir de la calculadora");
                    operacion = teclado.nextInt();
    
                    switch(operacion){
                    case (4):
                    System.out.println("numero 1:");
                    numero1 = teclado.nextDouble();
            
                    System.out.println("numero 2: ");
                    numero2 = teclado.nextDouble();

                        Multiplicacion multiplicacion = new Multiplicacion(numero1, numero2);
                        System.out.println("resultado: ");
                        System.out.println(multiplicacion.multiplicar()); 
                        resultado = numero1 + "*" + numero2 + "=" + multiplicacion.multiplicar();
                        historico.add(resultado);
                        break;
                    case (3):
                    System.out.println("numero 1:");
                    numero1 = teclado.nextDouble();
            
                    System.out.println("numero 2: ");
                    numero2 = teclado.nextDouble();                    
                        Division division = new Division(numero1, numero2);
                        System.out.println("resultado");
                        System.out.println(division.dividir());
                        resultado = numero1 + "/" + numero2 + "=" + division.dividir();
                        historico.add(resultado);
                        break;
                    case (2):
                    System.out.println("numero 1:");
                    numero1 = teclado.nextDouble();
            
                    System.out.println("numero 2: ");
                    numero2 = teclado.nextDouble();                   
                        Resta resta = new Resta(numero1, numero2);
                        System.out.println("resultado");
                        System.out.println(resta.restar());
                        resultado = numero1 + "-" + numero2 + "=" + resta.restar();
                        historico.add(resultado);
                        break;
                    case (1):
                    System.out.println("numero 1:");
                    numero1 = teclado.nextDouble();
            
                    System.out.println("numero 2: ");
                    numero2 = teclado.nextDouble();                    
                        Suma suma = new Suma(numero1, numero2);
                        System.out.println("resultado");
                        System.out.println(suma.sumar());
                        resultado = numero1 + "+" + numero2 + "=" + suma.sumar();
                        historico.add(resultado);
                        break;
                    case(5):
                    System.out.println("lista de reultados: ");
                    for (String resul : historico) {
                       System.out.println(resul); 
                    }
                    default:
                    System.out.println("solo opciones entre 1 y 5");
                   } 
            } while (operacion != 6);
        }


        
    }
}
