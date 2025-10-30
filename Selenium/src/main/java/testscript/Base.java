package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public void browserInitialization() {
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	public void browserQuitAndClose() {
		driver.close();
		//driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.browserInitialization();
		base.browserQuitAndClose();
	}

}
