package SortingPrice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.api.internal.StringUtils;

public class ScrappingAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://www.amazon.in/");		
		//Maximize the window
		driver.manage().window().maximize();
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);	
		
		//Create a List for name, price, reviews
		List<String> nameList=new ArrayList<>();
		List<Integer> priceList=new ArrayList<>();
		List<Integer> reviewList=new ArrayList<>();		
		
		//Get the page number
		String s= driver.findElement(By.xpath("//span[@class='s-pagination-item s-pagination-disabled']")).getText();
		System.out.println(s);
		int pg=Integer.parseInt(s);		
		
		int i=1;
		while(i<=pg) {
		//Print PageNumber
		System.out.println("Result of PageNumber ="+i);
		
		//All-Searched - Products - List
		List<WebElement> Productsele=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		int totproducts=Productsele.size();
		System.out.println("Total Products searched in this Page ="+totproducts);
			
		for (WebElement Product:Productsele) {
				
				//Loop through each product	
				//name of product
				/*List<WebElement> namesele=Product.findElements(By.xpath(".//span[@class='a-size-base-plus a-color-base a-text-normal']"));
				//System.out.println("Names of product - size ="+namesele.size());
				for (WebElement name:namesele) {
					//System.out.println(name.getText());
					nameList.add(name.getText());				
				}*/
				
				
			//Price of Product
			//try {
				//if(Product.findElements(By.xpath(".//span[@class='a-price-whole']")).size()>0) {				
					List<WebElement> priceele=Product.findElements(By.xpath(".//span[@class='a-price-whole']"));
					//System.out.println("Price of product - size ="+priceele.size());
					for (WebElement price:priceele) {						
						System.out.println(Integer.parseInt(price.getText().replace(",","")));						
						priceList.add(Integer.parseInt(price.getText().replace(",","")));
					}
				//}else {
				//	priceList.add(0);
				//};
			//}
			//catch(Exception e) {
			//	e.printStackTrace();
			//}
				
				
			//Review of Product	
			try {
				if(Product.findElements(By.xpath(".//span[@class='a-size-base s-underline-text']")).size()>0) {
					List<WebElement> reviewsele=Product.findElements(By.xpath(".//span[@class='a-size-base s-underline-text']"));
					//System.out.println("Reviews of product - size ="+reviewsele.size());
					for (WebElement review:reviewsele) {
						System.out.println(review.getText());	
						String x=review.getText();
						
						//Regular expression to remove brackets
						List<String> matchList = new ArrayList<String>();
						Pattern regex = Pattern.compile("\\((.*?)\\)");
						Matcher regexMatcher = regex.matcher(x);

						while (regexMatcher.find()) {//Finds Matching Pattern in String
						   matchList.add(regexMatcher.group(1));//Fetching Group from String
						}

						for(String str:matchList) {						
							
							System.out.println(Integer.parseInt(str.replace(",","")));						
							reviewList.add(Integer.parseInt(str.replace(",","")));
						}						
									
						}
					}
					else {
						reviewList.add(0);
					};
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}	
			
		//Click Next
			try {
				if(driver.findElement(By.linkText("Next")).isEnabled()) {
					driver.findElement(By.linkText("Next")).click();
					Thread.sleep(3000);	
				};			
			}
			catch(Exception e) {
				e.printStackTrace();
				break;
			}
			
			Productsele.clear();
			totproducts=0;
			i++;

		}
		//Print the size of namelist, pricelist, reviewlist 
		//System.out.println(nameList.size());
		System.out.println(priceList.size());
		System.out.println(reviewList.size());
		
		//sort price
		Collections.sort(priceList);
		System.out.println(priceList);
		
		//sort review
		Collections.sort(reviewList);
		System.out.println(reviewList);
		}
}	


