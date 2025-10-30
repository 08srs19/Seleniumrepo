package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButtonHandling extends Base{
	//Gender radio click and button click done
	void radioButtonHandling() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		WebElement button1=driver.findElement(By.xpath("//button[@id='button-one']"));
		radio1.click();
		button1.click();
	}
	//To check whether the radio button is clicked or not
	void clickedOrNot() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		if(radio1.isSelected()) {
			System.out.println("Female Button is already Selected.");
		}
		else {
			radio1.click();
		}
	}
	//To check whether the radio button is enabled or not 
	void enabledOrNot() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		if(radio1.isEnabled()) {
			radio1.click();
		}
		else {
			System.out.println("Radio button is disabled.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtonHandling radiobuttonhandling=new RadioButtonHandling();
		radiobuttonhandling.browserInitialization();
		radiobuttonhandling.radioButtonHandling();
		//radiobuttonhandling.clickedOrNot();
		//radiobuttonhandling.enabledOrNot();
		//radiobuttonhandling.browserQuitAndClose();
	}

}
