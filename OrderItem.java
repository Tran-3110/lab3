package main;

public class OrderItem implements Comparable<OrderItem>{
	private Product p;
	private int quality;

	public OrderItem(Product p, int quality) {
		this.p = p;
		this.quality = quality;
	}

	
	@Override
	public String toString() {
		return "OrderItem [p=" + p + ", quality=" + quality + "]" +"\n";
	}


	public Product getP() {
		return p;
	}

	public int getQuality() {
		return quality;
	}


	public boolean equalsType(String typeOrther) {
		return p.equalsType(typeOrther);
	}

	@Override
	public int compareTo(OrderItem o) {
		return p.compareTo(o.p);
	}
}
