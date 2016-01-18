package Sainsburys.TechnicalTest;

import java.util.List;

import javax.annotation.Resource;

import Sainsburys.TechnicalTest.Entity.PageItem;

/**
* PageSummary Object is used to hold the list of links to all the pages read by the web page scraper.
* 
*  
* @author Asad Bokhari
* @version 1.0
*/

public class PageSummary {

	private List<PageItem> listPageItem;
	
	@Resource
	private PageItem pageItem;
	
	
	/**
	  * Constructor.
	  * 
	  * Default constructor
	  */
	public PageSummary(){
		
	}

	/**
	  * Getter and Setter methods for the class members
	  * 
	  */
	
	
	public List<PageItem> getPageItem() {
		return listPageItem;
	}

	public void setPageItem(List<PageItem> pageItem) {
		this.listPageItem = pageItem;
	}
}
