/**
 * item class is used make items specification
 * it has id of an item, name of an item, price of an item,
 * quantity of an item which the user want to purchase, price of an item
 * then find the cost of the item which customer purchase and then used in the generate bill.
 * @author yash.porwal_metacube
 *
 */
class Item {
	int id;
	String name;
	double price;
	int quantity;
	double cost;

	/**
	 * constructor is used while creating the list and added values in the list 
	 * and then in object using constructor.
	 * @param id of an item
	 * @param name of an item 
	 * @param quantity purchased by the customer of an item
	 * @param price of an item
	 */
	Item(int id, String name, int quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.cost = quantity * price;
	}

	/**
	 * getter of an item which the user entered
	 * @return the id 
	 */
	public int getId() {
		return id;
	}

	/**
	 * getter of a name
	 * @return the name in String
	 */
	public String getName() {
		return (this.name);
	}

	/**
	 * getter of the price of an item
	 * @return price of an item
	 */
	public double getPrice() {
		return (this.price);
	}

	/**
	 * getter of quantity of an item which the user/customer put in cart
	 * @return integer value of quantity of this object
	 */
	public int getQuantity() {
		return (this.quantity);
	}

	/**
	 * getter of price of an item
	 * @return double value of cost 
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * setter of cost of an item purchased by user/customer
	 * @param cost takes double value and set to this object's cost
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * setter of quantity & is used to update & add new items's quantity 
	 * @param quantity integer value receive from the user or customer
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}