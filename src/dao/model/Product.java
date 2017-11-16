package dao.model;

import java.util.List;

public class Product {
	
	private String id;
	private String name;
	private double totalCost;
	private int initialVolume;
	private double balance;
	private int actualVolume;
	private List<Distribution> distribution;
	
	public Product(String id, String name, double totalCost, int initialVolume, double balance, int actualVolume,
			List<Distribution> distribution) {
		super();
		this.id = id;
		this.name = name;
		this.totalCost = totalCost;
		this.initialVolume = initialVolume;
		this.balance = balance;
		this.actualVolume = actualVolume;
		this.distribution = distribution;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public int getInitialVolume() {
		return initialVolume;
	}

	public void setInitialVolume(int initialVolume) {
		this.initialVolume = initialVolume;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getActualVolume() {
		return actualVolume;
	}

	public void setActualVolume(int actualVolume) {
		this.actualVolume = actualVolume;
	}

	public List<Distribution> getDistribution() {
		return distribution;
	}

	public void setDistribution(List<Distribution> distribution) {
		this.distribution = distribution;
	}
	
	
	
}
