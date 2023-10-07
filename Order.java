package main;

import java.util.Arrays;

public class Order {
	private OrderItem[] items;
	
	
	public Order(OrderItem[] items) {
		this.items = items;
	}
	public double cost() {
		double result = 0;
		for (OrderItem orderItem : items) {
			result+= orderItem.getP().getPrice()*orderItem.getQuality();
		}
		return result;
	}
// using binary search approach
	public boolean contains(Product p) {
		Arrays.sort(items);
		return containsHelp(items.length-1, 0, (items.length-1)/2, p);
	}
	public boolean containsHelp(int high, int low, int mid, Product p) {
		if(low>high) {
			return false;
		}
		if(items[mid].getP().compareTo(p) == 0) {
			return true;
		}
		else {
			if(items[mid].getP().compareTo(p) > 0) {
				return containsHelp(mid-1, low, (mid-1+low)/2, p);
			}
			else {
				return containsHelp(high, mid+1, (high+mid+1)/2, p);
			}
	   }
	}
// get all products based on the given type using 
	public Product[] filter(String type) {
		int size = 0;
		for (int i = 0; i < items.length; i++) {
			if(items[i].equalsType(type)) {
				size++;
			}
		}
		Product[] result = new Product[size];
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if(items[i].equalsType(type)) {
				result[count] = items[i].getP();
				count++;
			}
		}
		return result;
	}
}
