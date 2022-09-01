

public class CalcularPeso {

    private final float restaHombre = 110;
    private final float restaMujer = 120;
    private float altura;
    private String genero;
    private float pesoIdeal;

    public CalcularPeso() {
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPesoIdeal(float pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public float getRestaHombre() {
        return restaHombre;
    }

    public float getRestaMujer() {
        return restaMujer;
    }

    public float getAltura() {
        return altura;
    }

    public String getGenero() {
        return genero;
    }

    public float getPesoIdeal() {
        return pesoIdeal;
    }

    public void calculoPesoIdeal(String sexo, float num) {

        if (sexo.equals("masculino")) {
            setPesoIdeal(num - getRestaHombre());

        } else if (sexo.equals("femenino")) {
            setPesoIdeal(num - getRestaMujer());

        } else {
            System.out.println("\n\tDebe escribir masculino o femenino únicamente.");
        }
    }
}