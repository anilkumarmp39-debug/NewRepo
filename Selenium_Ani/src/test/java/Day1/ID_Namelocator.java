package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Namelocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("email")).sendKeys("anilkumarmp39@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("March@2021");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/button")).click();
	}

}
