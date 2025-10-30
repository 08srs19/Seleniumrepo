package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBoxHandling extends Base {
	void checkBoxHandling() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbox1.click();
	}
	
	void checkedOrNot() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		if(checkbox1.isSelected()) {
			System.out.println("Checkbox is already Selected.");
		}else {
			checkbox1.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxHandling checkboxhandling= new CheckBoxHandling();
		checkboxhandling.browserInitialization();
		//checkboxhandling.checkBoxHandling();
		checkboxhandling.checkedOrNot();
		//checkboxhandling.browserQuitAndClose();
	}

}
