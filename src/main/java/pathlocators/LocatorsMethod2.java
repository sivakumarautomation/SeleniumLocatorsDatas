package pathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsMethod2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://demo.actitime.com/login.do");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		
		//Id// METHOD-->2
		
		odriver.findElement(By.id("username")).sendKeys("admin");
		
		//name//
		
		odriver.findElement(By.name("pwd")).sendKeys("manager");
		
		//ID//Login//Click//
		odriver.findElement(By.id("loginButton")).click();
		
		odriver.quit();
		
	}

}
