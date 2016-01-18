package Sainsburys.TechnicalTest.Entity;

import javax.annotation.Resource;

import Sainsburys.TechnicalTest.Interface.Page;

/**
* PageItem Object page item data.
* 
*  
* @author Asad Bokhari
* @version 1.0
*/

public class PageItem implements Page {

	private String name;
	private String imgSrc;
	private String pricePerUnit;
	private int quantity;
	
	@Resource
	private PageURL pageUrl;
	
	/**
	  * Constructor.
	  * 
	  * Default constructor
	  */
	public PageItem(){
		
	}
	
	/**
	  * Getter and Setter methods for the class members
	  */
	public void setPageUrl(PageURL pageUrl){
		this.pageUrl = pageUrl;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImgSrc() {
		return imgSrc;
	}


	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}


	public String getPricePerUnit() {
		return pricePerUnit;
	}


	public void setPricePerUnit(String pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String getOrganization() {
		// TODO Auto-generated method stub
		return null;
	}

}
