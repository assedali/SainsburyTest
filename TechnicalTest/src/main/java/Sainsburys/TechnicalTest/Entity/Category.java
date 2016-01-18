package Sainsburys.TechnicalTest.Entity;

/**
* 
* 
*  
* @author Asad Bokhari
* @version 1.0
*/

public class Category {
	
	private String name;
	private String topCategoryName;
	private String parentCategoryName;
	
	/**
	  * Constructor.
	  * 
	  * Default constructor
	  */
	public Category(){
		
	}
	

	/**
	  * Getter and Setter methods for the class members
	  */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopCategoryName() {
		return topCategoryName;
	}

	public void setTopCategoryName(String topCategoryName) {
		this.topCategoryName = topCategoryName;
	}

	public String getParentCategoryName() {
		return parentCategoryName;
	}

	public void setParentCategoryName(String parentCategoryName) {
		this.parentCategoryName = parentCategoryName;
	}
	
	

}
