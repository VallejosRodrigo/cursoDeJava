package com.tp8.lab2;
import java.util.Scanner;


public class RaizScanner {
    private double numero;

    public RaizScanner() {
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double raiz(double num){
       double respuesta = (double) Math.sqrt(num);
        return respuesta;
    }
}

class Main{
    public static void main(String[] args) {

        RaizScanner dividir = new RaizScanner();
        Scanner l = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numeroIngresado = l.nextInt();

        dividir.setNumero(dividir.raiz(numeroIngresado));

        System.out.println("La raíz de "+numeroIngresado+" es = "+dividir.getNumero());
    }
}
