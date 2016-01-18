package Sainsburys.TechnicalTest.Data;

/**
* Json Data Object.
* 
* <P>Various attributes of Json object.
*  
* <P>Note that {@link float} is used to model the price. 
*  
* @author Asad Bokhari
* @version 1.0
*/

public class JsonDTO {

	private String title;
	private long size;
	private float unitPrice;
	private String description;
	
	/**
	  * Constructor.
	  * 
	  * Default constructor
	  */
	public JsonDTO(){
		
	}
	
	
	/**
	  * Getter and Setter methods for the class members
	  * 
	  */

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
