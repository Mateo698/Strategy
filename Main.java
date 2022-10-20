public class Main {
    public static void main(String[] args) {
        Item oneItem = new Item("1", 10000);
        Item secondItem = new Item("2", 8000);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(oneItem);
        cart.addItem(secondItem);

        cart.setStrategy(new PSEPayment("Bancolombia", "39129389", "42019"));
        cart.pay();
    }
}
