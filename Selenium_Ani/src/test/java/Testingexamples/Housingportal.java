package Testingexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Housingportal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://housing.com/");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		//driver.findElement(By.linkText("//div[@class='css-3ybuyo']")).click();
		driver.findElement(By.xpath("//div[@class='css-3ybuyo']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button{@data-testid='buttonId']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/button")).click();// Login button
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}

}
