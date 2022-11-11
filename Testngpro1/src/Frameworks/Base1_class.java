package Frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base1_class {
	public static WebDriver driver;
	   public static WebDriverWait wait;
	   
	@BeforeMethod
	public void open_app()
	{  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	   driver=new FirefoxDriver();
	   driver.get("https://demoqa.com/automation-practice-form");
	   wait=new WebDriverWait(driver,10);
	}
	   
	   @AfterMethod
	   public void close_app()
	   {
		   driver.close();
	   }

		

	}

