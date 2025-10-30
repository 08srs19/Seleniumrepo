package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDownHandling extends Base {
	void dropDownHandling() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		//Standard dropdown uses Select class 
		Select select=new Select(dropdown1);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(3);
		select.selectByValue("Yellow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDownHandling dropdownhandling=new DropDownHandling();
		dropdownhandling.browserInitialization();
		dropdownhandling.dropDownHandling();
		//dropdownhandling.browserQuitAndClose();
	}

}
