
public class Main {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addToCart(1, "pencil", 5, 3);
        cart.printCart();
        cart.updateQuantity(1, 10);
        cart.printCart();
        cart.addToCart(2, "Pen", 50, 10);
        cart.genBill();
		System.out.println("1. ");
	}
}
