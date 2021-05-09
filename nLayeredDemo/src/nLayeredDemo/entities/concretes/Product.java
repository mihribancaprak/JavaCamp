package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity{
    
	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	private int unitsInStocks;
	
	public Product() {
		
	}
	
	public Product(int id, int categoryId, String name, double unitPrice, int unitsInStocks) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsInStocks = unitsInStocks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStocks() {
		return unitsInStocks;
	}

	public void setUnitsInStocks(int unitsInStocks) {
		this.unitsInStocks = unitsInStocks;
	}
	
	
	
}
