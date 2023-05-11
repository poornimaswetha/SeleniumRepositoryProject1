package Tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),' Sales')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Orders')])[1]")).click();
		String custname = "Yogeshwaran K";

		String Labeltext = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(Labeltext);
		int startindex = Labeltext.indexOf("(");
		int endindex = Labeltext.indexOf(" Pages");
		System.out.println(startindex);
		System.out.println(endindex);
		String Stringnoofpages = Labeltext.substring(startindex + 1, endindex);
		int intnoofpages = Integer.parseInt(Stringnoofpages);
		// Loop through all pages //  Pagination
		for (int i = 0; i <= intnoofpages; i++) {
			try {
				WebElement cust = driver
						.findElement(By.xpath("//form[@id='form-order']//tbody//td[text()='" + custname + "']"));

				if (cust.isDisplayed()) {
					driver.findElement(By.xpath(
							"//form[@id='form-order']//tbody//td[text()='" + custname + "']/preceding-sibling::td[3]"))
							.click();
					break;
				}
				
			} catch (Exception e) {
				
			};
			
			// click on the next page
			//String pagexpath="//ul[@class='pagination']/li[contains(@class,'active')]/span/following::a[1]";
			//driver.findElement(By.xpath(pagexpath)).click();
			
			//Click Next
			try {
				if(driver.findElement(By.linkText(">")).isDisplayed()) {
					driver.findElement(By.linkText(">")).click();
					Thread.sleep(3000);	
				};			
			}
			catch(Exception e) {
				
			}
				
			
			;
		}
	}
}
