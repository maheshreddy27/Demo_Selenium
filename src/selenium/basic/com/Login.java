package selenium.basic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	static {
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://projects.zoho.com/portal/flatworldsolutions#mytimesheetcalendar");
		drive.findElement(By.id("login_id")).sendKeys("mahesh.reddy@flatworldsolutions.com");
		drive.findElement(By.id("nextbtn")).click();
		Thread.sleep(1000);
		boolean d=drive.findElement(By.id("password")).isDisplayed();
		System.out.println(d);
		drive.findElement(By.id("password")).sendKeys("Mahi@2708");
		drive.findElement(By.id("nextbtn")).click();

		
	}

}
