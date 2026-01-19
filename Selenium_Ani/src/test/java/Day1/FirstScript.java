package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		//driver = new FireFoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		Thread.sleep(1500);
		//driver.close();
		driver.quit();
		
	}

}
