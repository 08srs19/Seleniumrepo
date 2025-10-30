package testscript;

public class BrowserCommands extends Base {
	//browser commands are used to interact with the browser and perform various actions
	void browserCommands() {
		//Get Page title
		String title=driver.getTitle();
		System.out.println(title);
		//Get Current URL - Current page URL
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		//Get Page Source - get HTML Source code of the current page
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.browserInitialization();
		browsercommands.browserCommands();
		//browsercommands.browserQuitAndClose();

	}

}
