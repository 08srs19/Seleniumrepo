package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Sample extends Base {
	//To get the total from adding value a and value b
	void sampleLocate() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement field1=driver.findElement(By.id("value-a"));
		//field1.sendKeys("4");
		field1.sendKeys("21");
		WebElement field2=driver.findElement(By.id("value-b"));
		//field2.sendKeys("9");
		field2.sendKeys("35");
		WebElement button1=driver.findElement(By.id("button-two"));
		button1.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample=new Sample();
		sample.browserInitialization();
		sample.sampleLocate();
		//sample.browserQuitAndClose();
	}

}
