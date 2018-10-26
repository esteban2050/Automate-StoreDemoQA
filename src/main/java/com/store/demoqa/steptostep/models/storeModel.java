package com.store.demoqa.steptostep.models;

/**
 * 
 * @author Juan Esteban Lopez Giraldo b
 *
 */
public class storeModel {
	
	private String product;
		
	private String numberInTheList;
	
	private int quantity;
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}	
	
	public String getNumberInTheList() {
		return numberInTheList;
	}
	
	public void setNumberInTheList(String numberInTheList) {
		this.numberInTheList = numberInTheList;
	}
	
	public int getQuantity() {
		return quantity + 1;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
 