package EjercicioBanco;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = (long) (Math.random()*100);
    }

    @Override
    public String toString() {
        return "CuentaCorriente { " + "saldo=" + saldo +
                ", nombreTitular=" + nombreTitular +
                ", numeroCuenta=" + numeroCuenta +
                " }";
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void transferir(double monto, CuentaCorriente destino){
        if(this.getSaldo()-monto>=0){
            this.setSaldo(getSaldo()-monto);
            destino.setSaldo(destino.getSaldo()+monto);
        }else{
            System.out.println("saldo insuficiente. ");
        }
    }

}

