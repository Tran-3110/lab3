package main;

public class Product {
	private String id;
	private String name;
	private double price;
	private String type;

	public Product(String id, String name, double price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}

	public int compareTo(Product o) {
		return id.compareTo(o.id);
	}

	public String getType() {
		return type;
	}
	public boolean equalsType(String typeOrther) {
		if (type.equals(typeOrther)) {
			return true;
		}
		return false;
	}

}
