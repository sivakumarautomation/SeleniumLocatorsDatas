package pathlocators;//package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsType3 { //class//
	
	public static void main(String[] args) { //main//
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://demo.actitime.com/login.do");
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		//TYPE-3//
		//By.id//
		
		By Uname = By.id("username");

		By Pass = By.name("pwd");
		
	    By Login = By.id("loginButton");
	    
	    
		WebElement User = odriver.findElement(Uname);

		WebElement Password = odriver.findElement(Pass);

		WebElement LoginButton = odriver.findElement(Login);
		
		
		User.sendKeys("admin");
		
		Password.sendKeys("manager");
		
		LoginButton.click();
		
		odriver.quit();
	}

}
