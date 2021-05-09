package entities;

import abstracts.Entity;

public class Campaign implements Entity{

	int id;
	String name;
	String content;
	double discount;

	public Campaign() {
		
	}
	
	public Campaign(int id, String name, String content, double discount) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}
