import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleiumGrid {

	public static void main(String[] args) {
		// Desired Capabilities is used to set properties of browser, OS etc to perform cross browser testing
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(platform.windows); // OS of node machine
		dc.setBrowserName("chrome");// Browser configured in node machine

		// Connect to a Remote WebDriver
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.10.7:4444/wd/hub"), dc);

		// To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/");
		// Maximize the window
		driver.manage().window().maximize();
		// wait for 3 sec
		Thread.sleep(3000);
		// Click to Get Alert
		driver.findElement(By.id("alert1")).click();
		// wait for 3 sec
		Thread.sleep(3000);
	}

}
