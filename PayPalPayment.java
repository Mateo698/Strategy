public class PayPalPayment implements Payment{

    public String email;
    public String pass;

    public PayPalPayment(String email, String pass){
        this.email = email;
        this.pass = pass;
    }

    @Override
    public String pay(int amount){
        return("Se ha pagado la cantidad de "+amount+" con PayPal");
    }
}
