package Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//Alert myalert= driver.switchTo().alert();
		//Thread.sleep(2000);
		//myalert.accept();
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		Alert myalert= driver.switchTo().alert();
		myalert.dismiss();
		//driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		//Alert myalert= driver.switchTo().alert();
		//Thread.sleep(2000);
		//myalert.sendKeys("Hello Anil");
		//myalert.accept();
		
	}

}
