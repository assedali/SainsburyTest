package Sainsburys.TechnicalTest.Data;

import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;


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
	
	private JsonObject result;
	private List<JsonDTO> listJDTO;
	private float total;
	
	/**
	  * Constructor.
	  * 
	  * Default constructor
	  */
	public JsonDAO(){
		
	}

	public void createJsonFromList() {
		JsonArrayBuilder builder = Json.createArrayBuilder();
		for(JsonDTO jsonDTO : listJDTO) {
			  builder.add(Json.createObjectBuilder()
				      .add("title", jsonDTO.getTitle())
				      .add("size", jsonDTO.getSize())
				      .add("unit_price", jsonDTO.getUnitPrice())
				      .add("description", jsonDTO.getDescription()));
			}
		JsonArray jsonArray = builder.build();
		
		result = Json.createObjectBuilder()
				  .add("results", jsonArray)
				  .add("total", total)
				  .build();
	}
	
	/**
	  * Getter and Setter methods for the class members
	  * 
	  */
	
	public JsonObject getResult() {
		return result;
	}

	public void setResult(JsonObject result) {
		this.result = result;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}


	public List<JsonDTO> getListJDTO() {
		return listJDTO;
	}


	public void setListJDTO(List<JsonDTO> listJDTO) {
		this.listJDTO = listJDTO;
	}
	
}
