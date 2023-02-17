//Feb 16-P1-2023
package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// shift+command+o
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Terms")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		// parent window id is CDwindow-7CF262AA10240895B35EC264155E550F
		String parentWindowId = it.next();
		System.out.println("parent window id is " + parentWindowId);

		// child window id is CDwindow-311E93B062D40300DDFE1245EB3998FF
		String childWindowId = it.next();
		System.out.println("child window id is " + childWindowId);

		Thread.sleep(2000);

		driver.switchTo().window(childWindowId);
		System.out.println("child window title is " + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is " + driver.getTitle());
		Thread.sleep(2000);
		driver.quit();

	}

}
