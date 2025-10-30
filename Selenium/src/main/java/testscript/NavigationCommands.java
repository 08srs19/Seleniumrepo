package testscript;

public class NavigationCommands extends Base{
	void navigationCommands() {
		driver.navigate().to("https://www.amazon.in/");	
		driver.navigate().back();//goes back to previous page
		driver.navigate().forward();//goes forward to the next page
		driver.navigate().refresh();//refresh current page
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigationcommands=new NavigationCommands();
		navigationcommands.browserInitialization();
		navigationcommands.navigationCommands();
		//navigationcommands.browserQuitAndClose();

	}

}
