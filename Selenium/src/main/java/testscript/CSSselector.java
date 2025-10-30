package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSSselector extends Base {
	//1.Tag and ID(tag#id)
	//2.Tag and Class(tag.class)
	//3.Tag and Attribute(tag[attribute=value])
	//4.Tag,Class and Attribute(tag.classname[attribute=value])
	void tagAndID() {
		WebElement element1=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement element2=driver.findElement(By.cssSelector("input#value-a"));
		WebElement element3=driver.findElement(By.cssSelector("input#value-b"));
		WebElement element4=driver.findElement(By.cssSelector("button#button-one"));
		WebElement element5=driver.findElement(By.cssSelector("button#button-two"));
		WebElement element6=driver.findElement(By.cssSelector("div#message-one"));
		WebElement element7=driver.findElement(By.cssSelector("div#message-two"));
	}
	
	void tagAndClass() {
		WebElement element1=driver.findElement(By.cssSelector("div.header-top"));
		WebElement element2=driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement element3=driver.findElement(By.cssSelector("a.navbar-brand"));
		WebElement element4=driver.findElement(By.cssSelector("nav.navbar"));
		WebElement element5=driver.findElement(By.cssSelector("section.clearfix"));
		WebElement element6=driver.findElement(By.cssSelector("div.top-logo"));
		WebElement element7=driver.findElement(By.cssSelector("button.navbar-toggler"));
	}
	
	void tagAndAttribute() {
		WebElement element1=driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement element2=driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement element3=driver.findElement(By.cssSelector("button[id='button-two']"));
		WebElement element4=driver.findElement(By.cssSelector("div[id='message-one']"));
		WebElement element5=driver.findElement(By.cssSelector("div[id='message-two']"));
		WebElement element6=driver.findElement(By.cssSelector("input[id='value-a']"));
		WebElement element7=driver.findElement(By.cssSelector("input[id='value-b']"));
	}
	
	void tagClassAndAttribute() {
		WebElement element1=driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
	    WebElement element2=driver.findElement(By.cssSelector("div.my-2[id='message-one']"));	
	    WebElement element3=driver.findElement(By.cssSelector("div.my-2[id='message-two']"));
	    WebElement element4=driver.findElement(By.cssSelector("button.btn[id='button-one']"));
	    WebElement element5=driver.findElement(By.cssSelector("button.btn[id='button-two']"));
	    WebElement element6=driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
	    WebElement element7=driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSSselector cssselector= new CSSselector();
		cssselector.browserInitialization();
		cssselector.tagAndID();
		cssselector.tagAndClass();
		cssselector.tagAndAttribute();
		cssselector.tagClassAndAttribute();
		//cssselector.browserQuitAndClose();

	}

}
