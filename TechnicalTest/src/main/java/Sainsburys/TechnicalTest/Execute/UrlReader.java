package Sainsburys.TechnicalTest.Execute;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Sainsburys.TechnicalTest.Data.JsonDAO;
import Sainsburys.TechnicalTest.Data.JsonDTO;

/**
* 
* 
*  
* @author Asad Bokhari
* @version 1.0
*/

public class UrlReader {
	
	private String chromeDriverPath;
	private String grocerySiteUrl; 
	
	/**
	  * Constructor.
	  * 
	  * Default constructor
	  */
	public UrlReader(){
		
	}
	
	public void setGrocerySiteUrl(String grocerySiteUrl){
		this.grocerySiteUrl = grocerySiteUrl;
	}
	
	public void setChromeDriverPath(String chromeDriverPath){
		
		this.chromeDriverPath = chromeDriverPath;
	}
/*
 * This method will actually scrape the grocery site
 * And generate the finalJson object
 * 
 * @Param JsonDAO
 * 
 * */
	public void loadSummaryPage(JsonDAO jsonDao) {

		  // Optional, if not specified, WebDriver will search path for chromedriver.
		  System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		  WebDriver driver = new ChromeDriver();
		  driver.get(grocerySiteUrl);
		  
		  WebDriver linkDriver = new ChromeDriver();
		  
		  try { 
			  	List<WebElement> listLinks = driver.findElements(By.xpath("//div[@class=\"productInfo\"]//a"));
			  	float totalUnitPrice=0;
			  	List<JsonDTO> listJDTO = new ArrayList<JsonDTO>();
			  	
			  	for (WebElement pagelink : listLinks) 
			  	{ 
			  		try{
			  		String linktext = pagelink.getText(); 
			  		String link = pagelink.getAttribute("href");
			  		
			  		URLConnection urlConnection = new URL(link).openConnection();
			  		long size = urlConnection.getContentLength(); // in bytes
			  		
			  		linkDriver.get(link);
			  		WebElement element2 = linkDriver.findElement(By.xpath("//p[@class=\"pricePerUnit\"]"));
			  		float unitPrice = Float.valueOf(element2.getText().substring(1).split("/")[0]);
			  		
			  		WebElement element = linkDriver.findElement(By.xpath("//div[@class=\"productText\"]"));
			  		totalUnitPrice += unitPrice;
			  		
			  		JsonDTO jsonDTO = new JsonDTO();
			  		jsonDTO.setTitle(linktext);
			  		jsonDTO.setSize(size);
			  		jsonDTO.setUnitPrice(unitPrice);
			  		jsonDTO.setDescription(element.getText());
			  		
			  		listJDTO.add(jsonDTO);
			  		
			  		}catch(Exception e){
			  			e.printStackTrace();
			  		}
			  	} 
			  	
			  	jsonDao.setListJDTO(listJDTO);
			  	jsonDao.setTotal(totalUnitPrice);
			  	jsonDao.createJsonFromList();
			  	
			  	Thread.sleep(5000);  // Let the user actually see something!
				driver.quit();
			  	
			  }catch (Exception e)
		  		{ 
				  e.printStackTrace();
				  } 		
	}
}
