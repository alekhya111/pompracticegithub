package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPro {

	
	public static WebDriver driver;
	
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
		
	}
	
}
