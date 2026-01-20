package Day1;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		System.out.println(driver.manage().getCookies());
		driver.manage().addCookie(new Cookie("Anil", "Deep"));
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());
		
	}

}
