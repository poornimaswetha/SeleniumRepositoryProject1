package DataProviderPack;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	@DataProvider(name="NinjaLoginDataProvider")
	public Object[][] getData() {
		Object[][] data= {{"http://tutorialsninja.com/demo/","poornima1982@gmail.com","poornima@123"},{"http://tutorialsninja.com/demo/","swetha2010@gmail.com","selenium@123"},{"http://tutorialsninja.com/demo/","Renga2010@gmail.com","Renga@123"}};
		return data;
	}
}
