package gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverScript {
	
	public static void main(String [] args) {
	System.setProperty("webdriver.chrome.driver","D:\\test\\gmail\\library\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String URL=System.getProperty("URL");
	driver.get(URL);
	}

}
