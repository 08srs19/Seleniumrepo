package testscript2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base {
	//SimpleAlert- popup with text and ok button
	void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simple1=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simple1.click();
		//Alert- click me we can inspect,the popup we can't inspect so we use an interface Alert
		Alert alert=driver.switchTo().alert();
		//accept-to click ok button
		alert.accept();
	}
	//ConfirmationAlert- popup with text, ok button and cancel button
	void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmation1=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmation1.click();
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		//dismiss- to click cancel button
		alert.dismiss();
	}
	//PromptAlert- popup with text, enter text area, ok and cancel button
	void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement prompt1=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt1.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Saritha");
		alert.accept();
		//alert.dismiss();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.browserInitialization();
		//alerthandling.simpleAlert();
		//alerthandling.confirmationAlert();
		alerthandling.promptAlert();
		//alerthandling.browserQuitAndClose();
	}

}
