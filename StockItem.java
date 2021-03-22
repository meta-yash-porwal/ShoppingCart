/**
 * this class is used for items which are in the stock - 
 * id of item, name of item, price of item, stock of item
 * 
 * @author yash.porwal_metacube
 *
 */
public class StockItem {
	int id;
	String name;
	double price;
	int stock;
	
	/**
	 * constructor which gives the input parameters to object.
	 * @param id of an item
	 * @param name of the item
	 * @param price of the item
	 * @param stock of the item which is available
	 */
	public StockItem(int id, String name, double price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	/**
	 * getter of id of an item
	 * @return id of the item
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * getter of name of an item
	 * @return the name of an item
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter of a name of an item
	 * @param name get the change name in the parameter and change it to the class object's name. 
	 */

	/**
	 * getter of price of an item
	 * @return the price of an item
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * getter of stock of an item
	 * @return the stock of an item
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * setter of a stock of an item
	 * @param stock get the change stock in the parameter and change it to the class object's stock.
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
