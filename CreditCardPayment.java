import java.util.Date;

public class CreditCardPayment implements Payment{

    private String number;
    private String name;
    private int ccv;
    private Date expire;

    public CreditCardPayment(String number,String name, int ccv, Date expire){
        this.number = number;
        this.name = name;
        this.ccv = ccv;
        this.expire = expire;
    }
    

    @Override
    public String pay(int amount){
        String finalDigits = number.substring(number.length()-4,number.length());
        return("Se ha pagado "+amount+" con tarjeta de credito terminada en "+finalDigits);
    }
}
