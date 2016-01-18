package Sainsburys.TechnicalTest.Execute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;

import Sainsburys.TechnicalTest.Data.JsonDAO;


/**
* 
* 
*  
* @author Asad Bokhari
* @version 1.0
*/
@Service("configService") 
public class App 
{
	@Autowired
	private UrlReader urlReader;
	@Autowired
	private JsonDAO jsonDao;
	
    public static void main(String args[]){
    	
    	ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/resources/SpringBeanConfiguration.xml");
        BeanFactory factory = context;
        App app = (App) factory.getBean("App");
    	
    	app.loadUrl();
    	
    	app.printJson();
    	
    }
    
    private void printJson(){
    	
    	System.out.println("*********Final JSON Object***********");
    	System.out.println(jsonDao.getResult().toString());
    }
    
    private void loadUrl(){
    	urlReader.loadSummaryPage(jsonDao);
    }
	public void setUrlReader(UrlReader urlReader) {
		this.urlReader = urlReader;
	}

	public void setJsonDao(JsonDAO jsonDao) {
		this.jsonDao = jsonDao;
	}
}
