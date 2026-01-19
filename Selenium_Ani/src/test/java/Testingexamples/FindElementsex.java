package Testingexamples;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.digilocker.gov.in/");
		Thread.sleep(3000);
		List<WebElement> link= driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<=link.size();i++)
		{
		WebElement links=link.get(i);
		System.out.println(links.getText());
		System.out.println(links.getAttribute("href"));
		System.out.println(links);
		}
		
		}
	}


