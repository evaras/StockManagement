package dao.model;

public class Distribution {
	private String stand;
	private int units;
	private double prize;
	
	public Distribution(String stand, int units, double prize) {
		super();
		this.stand = stand;
		this.units = units;
		this.prize = prize;
	}

	public String getStand() {
		return stand;
	}

	public void setStand(String stand) {
		this.stand = stand;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	
	
	
}
