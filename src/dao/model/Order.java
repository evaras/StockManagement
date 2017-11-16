package dao.model;

import java.util.HashMap;

public class Order {

	private String id;
	private String client;
	private double price;
	private HashMap<String, Integer> products;
	
	public Order(String id, String client, double price, HashMap<String, Integer> products) {
		super();
		this.products = new HashMap<String, Integer>();
		this.id = id;
		this.client = client;
		this.price = price;
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public HashMap<String, Integer> getProducts() {
		return products;
	}

	public void setProducts(HashMap<String, Integer> products) {
		this.products = products;
	}
	
}
