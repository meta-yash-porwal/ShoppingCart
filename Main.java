
public class Main {
	public static void main(String[] args) {
 		System.out.println("Available Items: - "); 
		
 		ShoppingCart cart = new ShoppingCart();
		System.out.println("-------------------------------------");

		/*
		 * it add item id = 1 to the cart of quantity = 3
		 */
		cart.addToCart(1, 3);
        cart.printCart();
		/*
		 * it updates the quantity of an item id = 1 and
		 * the updated quantity is 8 
		 */
        cart.updateQuantity(1, 8);
        cart.printCart();
        cart.addToCart(2, 10);
        cart.genBill();
	}
}
