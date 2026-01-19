package Testingexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirBRB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Search")).click();
		//driver.findElement(By.xpath("//button[@aria-describedby='searchInputDescriptionId']")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div/div[1]/div[3]/div[1]/div/div/header/nav/div[2]/div/button/span")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
