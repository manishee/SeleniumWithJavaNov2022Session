//Feb 2-2023-P2
package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();// to bring driver to the alert

		String text = alert.getText();
		System.out.println(text);

		if (text.equals("Please enter a valid user names")) {
			System.out.println("correct text");
		}

		alert.accept();
		// alert.dismiss();//Click on Cancel or Esc from keyboard

		driver.switchTo().defaultContent();// to bring driver back to the web page
	}

}
