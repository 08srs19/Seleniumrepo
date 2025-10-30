package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPath extends Base {
	//absolute xpath: starts from the root node (not recommended as it may break easily)
	//absolute xpath syntax: /html/body/div[1]/form/input[1]
	//relative xpath: starts from anywhere in the DOM(preferred)
	void relativeXPath() {
		//tag[@attribute='value']
		WebElement path1=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement path2=driver.findElement(By.xpath("//div[@id='message-one']"));
		WebElement path3=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement path4=driver.findElement(By.xpath("//div[@id='message-two']"));
	}
	//Checking the text message and side navigations - text
	void text() {
		//tag[text()='value']
		WebElement text1=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement text2=driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement text3=driver.findElement(By.xpath("//a[text()='Ajax Form Submit']"));
		WebElement text4=driver.findElement(By.xpath("//a[text()='Jquery Select2']"));
		WebElement text5=driver.findElement(By.xpath("//a[text()='Select Input']"));
		WebElement text6=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		WebElement text7=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
	}
	//Checking that with any part of the id we can locate - contains
	void contains() {
		//tag[contains(@attribute,'value')]
		WebElement contains1=driver.findElement(By.xpath("//input[contains(@id,'t-fie')]"));
		WebElement contains2=driver.findElement(By.xpath("//input[contains(@id,'lue-a')]"));
		WebElement contains3=driver.findElement(By.xpath("//button[contains(@id,'ton-o')]"));
		WebElement contains4=driver.findElement(By.xpath("/button[contains(@id,'ton-t')]"));
		WebElement contains5=driver.findElement(By.xpath("//div[contains(@id,'sage-o')]"));
		WebElement contains6=driver.findElement(By.xpath("//div[contains(@id,'sage-t')]"));
		WebElement contains7=driver.findElement(By.xpath("//input[contains(@id,'lue-b')]"));
	}
	//Checking with starting attribute values - startswith
	void startswith() {
		//tag[starts-with(@attribute,'value')]
		WebElement starts1=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement starts2=driver.findElement(By.xpath("//button[starts-with(@id,'button-t)]"));
		WebElement starts3=driver.findElement(By.xpath("//div[starts-with(@id,'message-o')]"));
		WebElement starts4=driver.findElement(By.xpath("//div[starts-with(@id,'message-t')]"));
		WebElement starts5=driver.findElement(By.xpath("//a[contains(@id,'alert-m')]"));
		WebElement starts6=driver.findElement(By.xpath("//a[contains(@id,'list')]"));
		WebElement starts7=driver.findElement(By.xpath("//a[contains(@id,'progress-b')]"));
	}
	//Unique one which have both - and
	void and() {
		//tag[@attribute='value' and @attribute='value']
		WebElement and1=driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		WebElement and2=driver.findElement(By.xpath("//button[@id='button-two' and @type='button']"));
		WebElement and3=driver.findElement(By.xpath("//div[@id='message-one' and @class='my-2']"));
		WebElement and4=driver.findElement(By.xpath("//div[@id='message-two' and @class='my-2']"));
		WebElement and5=driver.findElement(By.xpath("//input[@id='value-a' and @type='text']"));
		WebElement and6=driver.findElement(By.xpath("//input[@id='value-b' and @type='text']"));
		WebElement and7=driver.findElement(By.xpath("//input[@id='single-input-field' and @type='text']"));
	}
	//Any one of 2 shown, one of one matching here can't be checked - or
	void or() {
		//tag[@attribute='value' or @attribute='value']
		WebElement or1=driver.findElement(By.xpath("//button[@id='button-one' or @type='button']"));
		WebElement or2=driver.findElement(By.xpath("//button[@id='button-two' or @type='button']"));
		WebElement or3=driver.findElement(By.xpath("//div[@id='message-one' or @class='my-2']"));
		WebElement or4=driver.findElement(By.xpath("//div[@id='message-two' or @class='my-2']"));
		WebElement or5=driver.findElement(By.xpath("//input[@id='value-a' or @type='text']"));
		WebElement or6=driver.findElement(By.xpath("//input[@id='value-b' or @type='text']"));
		WebElement or7=driver.findElement(By.xpath("//input[@id='single-input-field' or @type='text']"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XPath xpath=new XPath();
		xpath.browserInitialization();
		xpath.relativeXPath();
		xpath.text();
		xpath.contains();
		xpath.startswith();
		xpath.and();
		xpath.or();
		//xpath.browserQuitAndClose();
	}
}
