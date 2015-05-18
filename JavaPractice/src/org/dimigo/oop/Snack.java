package org.dimigo.oop;

public class Snack {

	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack() {
		
	}
	
	public Snack(String name, String company, int price, int number) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack() {
		System.out.println(
				"이름	:" + this.name + "\n" +
				"제조사	:" + this.company + "\n" +
				"가격 	:" + String.format("%,d", this.price) + "원" + "\n" +
				"개수	:" + String.format("%,d", this.number) + "개"
		);
	}
	
	public int calcPrice() {
		return this.price * this.number;
	}
}
