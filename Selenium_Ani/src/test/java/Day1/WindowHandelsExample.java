package Day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='yellowloginbtn accessibility-plugin-ac']")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator <String> itrator = windowhandles.iterator();
		String parentwindow= itrator.next();
		String childwindow = itrator.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("1234");
		
		
	}

}
