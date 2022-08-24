public class Main {   //RESOLVER OPERACION CONVINADA TPn5 LABORATORIO II T.U.P.
    public static void main(String[] args) {

    float a=6, a1=5, b=2, b1=3, c=7, d1=30, e=1, r1=1,r2=1;
    float ter1=1, ter2=1, ter3=1, ter4=1, upTotal=0, lowTotal=1, total=1;

        r1= b/b1;   r2= c/b;      //depositamos fracciones en variables
        ter1= a/a1; ter2=r1*r2; ter3=b/d1; ter4=e/b1; //separamos en terminos

        upTotal = ter1 - ter2 + ter3; //resuelve parte de arriba
        lowTotal = ter4/a1;           //resuelve parte de abajo

        total=upTotal/lowTotal;   //conecta y resuelve las dos partes finales

        System.out.println(total);
    }
}
