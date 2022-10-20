import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Payment paymentMethod;

    List<Item> items;
	
	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(){
		int amount = calculateTotal();
		String message = paymentMethod.pay(amount);
        System.out.println(message);
	}
    
    public void setStrategy(Payment selectedStrat){
        this.paymentMethod = selectedStrat;
    }

    
}
