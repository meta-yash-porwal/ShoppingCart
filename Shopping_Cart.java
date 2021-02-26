import java.util.*;

class ShoppingCart {
	List<Item> items = new ArrayList<Item>();

	ShoppingCart(int id, String name, int quantity, double price) {
		addToCart(id, name, quantity, price);
	}

	public ShoppingCart() {
	}
	public void showProduct() {
		
	}
	public void addToCart(int id, String name, int quantity, double price) {
		for (Item item : items) {
			if (item.getId() == id) {
				return;
			}
		}
		this.items.add(new Item(id, name, quantity, price));

	}

	public void removeFromCart(int id) {
		for (Item item : items) {
			if (item.getId() == id) {
				items.remove(item);
				break;
			}
		}
	}

	public void printCart() {
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i).getId()+ "\t");
			System.out.print(items.get(i).getName()+ "\t");
			System.out.print(items.get(i).getQuantity()+ "\t");
			System.out.println(items.get(i).getPrice());
		}

	}
	
	public void updateQuantity(int id, int quantity) {
		for(Item item : items){
			if(item.getId() == id){
				item.setQuantity(quantity);
				break;
			}
		}
	}
	public void genBill() {
		double total = 0;
		for(Item item : items){
			total += item.getCost();
			String itemBill = String.format("%s (%s X Rs.%s) = Rs.%s", item.getName(), item.quantity, item.price, item.cost);
			System.out.println(itemBill);
			 
		}
		System.out.println(String.format("Total = %s", total));
		
	}

	public List<Item> getItems() {
		return items;
	}

}
