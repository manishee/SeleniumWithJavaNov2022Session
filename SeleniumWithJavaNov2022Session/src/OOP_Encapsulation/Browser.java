//Dec 23-2022-p2
package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("Launching Browser ....");
		
		checkBrowserVersion();
		checkBrowserOSVersion();
		checkRAMSpace();
		interactWithServices();
		
		System.out.println("browser launched");
		
	}
	
	private void checkBrowserVersion() {
		System.out.println("check browser version");
	}
	
	private void checkBrowserOSVersion() {
		System.out.println("check Browser OS Version");
	}
	
	private void checkRAMSpace() {
		System.out.println("check RAM Space");
	}
	
	private void interactWithServices() {
		System.out.println("interact With Services");
	}
	
}
