//Feb 3-2023-P1

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		// File upload pop up:
		// type="file" should be there.
		WebElement chooseFile = driver.findElement(By.name("upfile"));
		Thread.sleep(3000);
		chooseFile.sendKeys("/Users/mchugh/Desktop/EclipseImage.png");
	}

}
