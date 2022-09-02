import javax.swing.*;

public class Aplicacion {
    public static void main(String[] args) {
        int intentos = 0;

       AdivinarElNumero n1 = new AdivinarElNumero();
       n1.setNumAleatorio((int) n1.generarAleatorio());

       do {
           n1.setNumeroIngresado(Integer.parseInt(JOptionPane.showInputDialog("Igrese un numero entre 1 y 100: ")));
           intentos++;
           if ((n1.getNumeroIngresado() > 0) && (n1.getNumeroIngresado() < 101)) {

               if ((n1.getNumeroIngresado()) == (n1.getNumAleatorio())) {
                   System.out.println("####################################");
                   System.out.println("\nFELICIDADES!! NUMERRO CORRECTO: "+n1.getNumAleatorio());
                   System.out.println("Número de intentos: "+intentos+"\n");
                   System.out.println("####################################");
               } else if ((n1.getNumeroIngresado()) < (n1.getNumAleatorio())) {
                   System.out.println("El numero a buscar es MAS ALTO ");
               } else if ((n1.getNumeroIngresado()) > (n1.getNumAleatorio())) {
                   System.out.println("El numero a buscar es MENOR ");
               }
           } else {
               System.out.println("El numero ingresado no corresponde. ");
           }

       }while ((n1.getNumeroIngresado()) != (n1.getNumAleatorio()));

    }
}
