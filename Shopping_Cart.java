import java.util.*;

/**
 * this class is used in shopping cart- to add, remove, update products in the cart
 * it has item list (details)
 * stock item list (stock of items)
 * and to get current items in the shopping cart
 * @author yash.porwal_metacube
 *
 */
class ShoppingCart {
	List<Item> items = new ArrayList<Item>();
	
	/**
	 * it is the list of an available items present in the store and the list is type of 
	 * class StockItem 
	 * and making static means the availItems are same for all the instances (objects)
	 * of a class ShoppingCart
	 * and making this private so that this is accessible outside the class, so that 
	 * we should getter method to get values from availItems list.
	 */
	static private List<StockItem> availItems = Arrays.asList(new StockItem(1, "Pencil", 5.0,
			10), new StockItem(2, "Pen", 10.0, 15), new StockItem(3, "Eraser",
			3.0, 10), new StockItem (4, "Mobile", 500.0, 1));
	
	/**
	 * constructor used to show items available in the store, their stock
	 */
	ShoppingCart() {
		showAvailItems();
	}
	
	/**
	 * this is the getter method of availItems List 
	 * @return it returns the available items in the store (availItems List)
	 */
	public List<StockItem> getAvailItems() {
		return availItems;
	}
	
	/**
	 * show available items from the List avaiItems
	 * show all the available items
	 * - their id, name, stock and price
	 */
	public void showAvailItems() {
		for (int i = 0; i < availItems.size(); i++) {
			System.out.print(availItems.get(i).getId() + "\t");
			System.out.print(availItems.get(i).getName() + "\t");
			System.out.print(availItems.get(i).getStock() + "\t");
			System.out.println(availItems.get(i).getPrice());
		}
	}

	/**
	 * this method is used to add items in the cart using class Items constructor
	 * @param id takes the id from user(customer) of a item
	 * @param quantity takes the quantity from user(customer) of a item
	 */
	public void addToCart(int id, int quantity) {
		for (StockItem stockitem : availItems) {
			if (stockitem.getId() == id && stockitem.getStock() >= quantity ) {
				this.items.add(new Item(id, stockitem.getName(), quantity, stockitem.getPrice()));
				stockitem.setStock(stockitem.getStock() - quantity);
			}
		}
	}
	
	/**
	 * this method is used to remove items from the cart 
	 * @param id is used 
	 */
	public void removeFromCart(int id) {
		boolean isRemoved = false;
		int leftQty = 0;
		for (Item item : items) {
			if (item.getId() == id) {
				items.remove(item);
				isRemoved = true;
				leftQty = item.getQuantity();
			}
		}
		if(isRemoved) {
			
			for (StockItem stockitem : availItems) {
				if (stockitem.getId() == id ) {
					stockitem.setStock(stockitem.getStock() + leftQty);
				}
			}
		}
	}

	/**
	 * it used to print the items in the cart which is added by customer(user)
	 */
	public void printCart() {
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i).getId() + "\t");
			System.out.print(items.get(i).getName() + "\t");
			System.out.print(items.get(i).getQuantity() + "\t");
			System.out.println(items.get(i).getPrice());
		}

	}

	/**
	 * it is used to update the quantity by the customer(user)
	 * @param id to check the element is present in the cart
	 * @param quantity new quantity which the customer(user) want to replace with the old quantity
	 */
	public void updateQuantity(int id, int quantity) {
		int oldQty = 0, newQty = quantity, currStock = 0;
		boolean isUpdated = false;
		for(StockItem stockitem : availItems) {
			if(stockitem.getId() == id) {
				currStock =stockitem.getStock();
			}
		}
		for (Item item : items) {
			if (item.getId() == id && currStock + item.getQuantity() >=  quantity )  {
				oldQty = item.getQuantity();
				item.setQuantity(quantity);
				item.setCost(quantity * item.getPrice());
				isUpdated = true;
			}
		}
		if(isUpdated) {
			for(StockItem stockitem : availItems) {
				if(stockitem.getId() == id) {
					stockitem.setStock(stockitem.getStock() - newQty + oldQty);
				}
			}
		}
	}

	/**
	 * used to generate the bill for the customer(user)
	 */
	public void genBill() {
		double total = 0;
		for (Item item : items) {
			total += item.getCost();
			String itemBill = String.format("%s (%s X Rs.%s) = Rs.%s",
					item.getName(), item.quantity, item.price, item.cost);
			System.out.println(itemBill);

		}
		System.out.println(String.format("Total = %s", total));

	}
	
	/**
	 * getter of items (to get item details)
	 * @return the list of item
	 */
	public List<Item> getItems() {
		return items;
	}

}