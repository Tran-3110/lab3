package main;

public class TestOrderItem {
	public static void main(String[] args) {
		
		Product p1 = new Product("SP01", "doll", 4.5, "tot");
		Product p2 = new Product("SP02", "kitty", 6.0, "trung binh");
		Product p3 = new Product("SP03", "sua chua", 4.5, "tot");
		Product p4 = new Product("SP04", "sua tuoi", 4.5, "thap");
		Product p5 = new Product("SP05", "pepsi", 3.5, "tot");
		Product p6 = new Product("SP06", "coca cola", 3.5, "tot");
		Product p7 = new Product("SP07", "sua dua", 5.0, "tot");
		Product p8 = new Product("SP08", "socola", 7.0, "trung binh");
		Product p9 = new Product("SP09", "keo deo", 1.5, "trung binh");
		Product p10 = new Product("SP010", "keo dua", 0.5, "thap");
		
		
		OrderItem o1 = new OrderItem(p1, 3);
		OrderItem o2 = new OrderItem(p2, 2);
		OrderItem o3 = new OrderItem(p3, 1);
		OrderItem o4 = new OrderItem(p4, 5);
		OrderItem o5 = new OrderItem(p5, 6);
		OrderItem o6 = new OrderItem(p6, 2);
		OrderItem o7 = new OrderItem(p7, 1);
		OrderItem o8 = new OrderItem(p8, 2);
		OrderItem o9 = new OrderItem(p9, 3);
		OrderItem o10 = new OrderItem(p10, 5);
		
		OrderItem[] orderArr = {o1, o3, o4, o7, o9, o5, o4, o3, o2};
		
		Order order = new Order(orderArr);
		
		System.out.println(order.cost());
		System.out.println(order.contains(p5));
		Product[] arr = order.filter("thap");
		for (Product product : arr) {
			System.out.println(product.toString());
		}
		

	}

}
