class Item {
	int id;
	String name;
	double price;
	int quantity;
	double cost;

	Item(int id, String name, int quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.cost = quantity * price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return (this.name);
	}

	public double getPrice() {
		return (this.price);
	}

	public int getQuantity() {
		return (this.quantity);
	}

	public double getCost() {
		return cost;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}