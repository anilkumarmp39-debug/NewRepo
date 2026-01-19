package Testingexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicone1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://housing.com/");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Search")).click();
		//driver.findElement(By.xpath("////button[@type='button']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div/div/div[1]/div/button")).click();
	}

}
