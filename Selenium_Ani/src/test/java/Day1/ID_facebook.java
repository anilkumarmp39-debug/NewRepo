package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("email")).sendKeys("anilkumarmp39@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("March");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")).click(); //Absolute XPATH
		driver.findElement(By.xpath("//button[@name='login'")).click();
		}

}
//		//Types of Xpath 
//1.Absolute Xpath starts with single slash / example: /html/body/div/input[1]

//2.Relative Xpath starts with double slash //
// --//tagname[@attribute='value']  //*[@attribute-'value']
//   //button[@name='login']