package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class NewWindowFeature {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mak\\workspace\\pratice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");

		driver.switchTo().window(null);
		System.out.println(driver.getTitle());
		
		//this is my third commit
	}

}