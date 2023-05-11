package Calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicks {

	public static void main(String[] args) throws InterruptedException {
		String month ="June 2024";
		String day="30";
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://phptravels.net/");		
		//Maximize the window
		driver.manage().window().maximize();
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.id("checkin")).click();
		Thread.sleep(5000);
		// Selecting the month year
		System.out.println(driver.findElement(By.cssSelector("th.switch")).getText());
		while(true) {
			//get the text of month
			String m=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();
			System.out.println(m);
			if(!m.equals(month)) {
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[3]/i")).click();			
			}else {
				break;
			}
		}
		//Selecting the day
		driver.findElement(By.xpath("//body[1]/div[8]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]")).click();		
		}
		
}
