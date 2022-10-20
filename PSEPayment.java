public class PSEPayment implements Payment{

    private String banco;
    private String numCuenta;
    private String cedula;

    public PSEPayment(String banco,String numCuenta,String cedula){
        this.banco = banco;
        this.numCuenta = numCuenta;
        this.cedula = cedula;
    }

    @Override
    public String pay(int amount){
        return("Se ha pagado "+amount+" con la cuenta "+numCuenta+" de "+banco);
    }
}
