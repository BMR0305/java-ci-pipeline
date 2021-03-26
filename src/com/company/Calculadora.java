package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Calculadora {
    Calculadora(){}
    public void Interfaz(){
        boolean exit = true;
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        while (exit){
            System.out.println("Eliga el número de la función que desea realizar:\n 1.Sumar\n 2.Restar\n 3.Dividir\n 4.Multiplicar\n Cualquier otra opcion cerrara la aplicacion");
            String input = scanner.next();
            if (input.equals("1")){
                System.out.println("Inserte el primer número de la suma: ");
                input = scanner.next();
                int a = Integer.parseInt(input);
                System.out.println("Inserte el segundo número de la suma: ");
                input = scanner.next();
                int b = Integer.parseInt(input);
                System.out.println("El resultado de la suma es: "+ SUMA(a,b));
            }
            else if (input.equals("2")){
                System.out.println("Inserte el primer número de la resta: ");
                input = scanner.next();
                int a = Integer.parseInt(input);
                System.out.println("Inserte el segundo número de la resta: ");
                input = scanner.next();
                int b = Integer.parseInt(input);
                System.out.println("El resultado de la suma es: "+ RESTA(a,b));
            }
            else if (input.equals("3")){
                System.out.println("Inserte el primer número de la division: ");
                input = scanner.next();
                int a = Integer.parseInt(input);
                System.out.println("Inserte el segundo número de la division: ");
                input = scanner.next();
                int b = Integer.parseInt(input);
                System.out.println("El resultado de la suma es: "+ DIVISION(a,b));
            }
            else if (input.equals("4")){
                System.out.println("Inserte el primer número de la multiplicacion: ");
                input = scanner.next();
                int a = Integer.parseInt(input);
                System.out.println("Inserte el segundo número de la multiplicacion: ");
                input = scanner.next();
                int b = Integer.parseInt(input);
                System.out.println("El resultado de la suma es: "+ MULTIPLICACION(a,b));
            }
            else{
                exit = false;
            }
        }

        scanner.close();
    }
    static public int SUMA(int a, int b){
        return a+b;
    }
    static public int RESTA(int a, int b){
        return a-b;
    }
    static public int DIVISION(int a, int b){
        return a/b;
    }
    static public int MULTIPLICACION(int a, int b){
        return a*b;
    }
    }

