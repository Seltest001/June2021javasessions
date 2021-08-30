package OOP_Encapsulation;

public class Browser {
	
	//private methods
	//will be accessed via public methods
	
	
	
	public void launchBrowser() {
		System.out.println("trying to launch browser....");
		isChromePresent();
		checkRAMSpace();
		browserIsUpgraded();
		checkOSCompatible();
		checkBrowserVersion();
		System.out.println("Browser is launched");
	}

	private void isChromePresent() {
		System.out.println("chrome is present");

	}

	private void checkRAMSpace() {
		System.out.println("check RAM space");

	}

	private void browserIsUpgraded() {
		System.out.println("browser is upgraded");

	}

	private void checkOSCompatible() {
		System.out.println("check OS compatibility");

	}

	private void checkBrowserVersion() {
		System.out.println("check browser version");

	}

}
