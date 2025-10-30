package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base{
	//Full table printing
	void tablePrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableprinting=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tableprinting.getText());
	}
	//Printing only a row
	void rowPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//tbody and tr from inpect
		WebElement rowprinting=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(rowprinting.getText());
	}
	//Printing 3rd value data from the first row
	void cellPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//td - thread data
		WebElement cellprinting=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[3]"));
		System.out.println(cellprinting.getText());
	}
	//Printing only first Name column data 
	void columnPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//tr - select all tr for column printing because all values are given as row details
		//list of elements are printing - findElements included in list
		List<WebElement> columnprinting=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement list:columnprinting) {
			System.out.println(list.getText());
		}
	}
	//Checking whether Ashton Cox Name is present in the table or not
	void checkNamePresentOrNot() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> check=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		String name="Ashton Cox";
		for (WebElement n : check) {
            if (n.getText().equalsIgnoreCase(name)) {
                System.out.println(name + " is present under the Name field of the table.");
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehandling=new TableHandling();
		tablehandling.browserInitialization();
		//tablehandling.tablePrinting();
		//tablehandling.rowPrinting();
		//tablehandling.cellPrinting();
		//tablehandling.columnPrinting();
		tablehandling.checkNamePresentOrNot();
		//tablehandling.browserQuitAndClose();
	}

}
