import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        CalcularPeso c1 = new CalcularPeso();
        c1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su altura: ")));
        c1.setGenero(JOptionPane.showInputDialog("Ingrese su género (masculino/femenino): "));

        c1.calculoPesoIdeal(c1.getGenero(), c1.getAltura());

        System.out.println("\tSu peso ideal es: "+c1.getPesoIdeal()+" kg");




    }
}
