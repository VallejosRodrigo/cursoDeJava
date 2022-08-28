package EjercicioBanco;

public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente(25600.2,"Vallejos Rodrigo");
        CuentaCorriente cuenta2 = new CuentaCorriente(36456.23,"Rodolfo Del Potro");

        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.transferir(2500,cuenta2);
        System.out.println("-----------------");
        System.out.println(cuenta1);
        System.out.println(cuenta2);

    }
}
