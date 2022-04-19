import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromiumdriver().setup();
			//WebDriver driver = new ChromeDriver();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
		}

	}


