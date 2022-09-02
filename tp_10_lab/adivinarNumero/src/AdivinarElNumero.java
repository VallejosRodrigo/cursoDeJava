public class AdivinarElNumero {
    private int numAleatorio;
    private int numeroIngresado;

    public AdivinarElNumero() {
    }

    public int getNumeroIngresado() {
        return numeroIngresado;
    }

    public void setNumeroIngresado(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }

    public void setNumAleatorio(int numAleatorio) {
        this.numAleatorio = numAleatorio;
    }

    public int getNumAleatorio() {
        return numAleatorio;
    }

    public double generarAleatorio(){
        return Math.floor(Math.random()*100+1);
    }


}
