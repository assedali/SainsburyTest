package Sainsburys.TechnicalTest.JBehave;

import org.jbehave.core.annotations.*;
import org.jbehave.core.embedder.Embedder;
import junit.framework.Assert;
import Sainsburys.TechnicalTest.Entity.*;

public class GrocerySiteSteps extends Embedder{

	private Category testCategory;
	private PageItem pageItem;
 
    @Given("grocery category is $category")
    public void ripeAndReadyCategory(String category) {
        testCategory = new Category();
        testCategory.setName(category);
    }
    
    @When("parent category is $category")
    public void parentCategory(String category) {
    	testCategory.setParentCategoryName(category);
    }
 
    @When("top category is $category")
    public void topCategory(String category) {
    	testCategory.setTopCategoryName(category);
    }

    @Then("the resulting items should have $resultItem")
    public void theResultingElementShouldHave(String resultItem) {
    	PageItem pageItem = new PageItem();
    	pageItem.setName(resultItem);
    	Assert.assertEquals(pageItem.getName(), resultItem);
    }
}
