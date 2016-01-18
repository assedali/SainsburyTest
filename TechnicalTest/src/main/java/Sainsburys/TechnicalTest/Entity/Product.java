package Sainsburys.TechnicalTest.Entity;

import java.util.ArrayList;

/**
* 
* 
*  
* @author Asad Bokhari
* @version 1.0
*/
public class Product {
	
	private int skuCode;
	private String name;
	private String description;
	private String nutrition;
	private ArrayList<String> listIngredient;
	private String size;
	private String packaging;
	private String manufacturer;
	private String additionalInfo;

	/**
	  * Constructor.
	  * 
	  * Default constructor
	  */
	public Product(){
		
	}

	
	/**
	  * Getter and Setter methods for the class members
	  */
	public int getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(int skuCode) {
		this.skuCode = skuCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public ArrayList<String> getListIngredient() {
		return listIngredient;
	}

	public void setListIngredient(ArrayList<String> listIngredient) {
		this.listIngredient = listIngredient;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	
}
