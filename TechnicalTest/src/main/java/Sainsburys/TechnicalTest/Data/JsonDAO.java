package Sainsburys.TechnicalTest.Data;

import java.util.List;
import java.util.Map;


/**
* Json Data Transfer Object.
* 
* <P>Various attributes of Json data transfer object.
*  
* <P>Note that {@link float} is used to model the total price. 
*  
* @author Asad Bokhari
* @version 1.0
*/

public class JsonDAO {
	
	private List<Map> results;
	private float total;
	
	/**
	  * Constructor.
	  * 
	  * Default constructor
	  */
	public JsonDAO(){
		
	}

	
	/**
	  * Getter and Setter methods for the class members
	  * 
	  */
	
	public List<Map> getResults() {
		return results;
	}

	public void setResults(List<Map> results) {
		this.results = results;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
}
