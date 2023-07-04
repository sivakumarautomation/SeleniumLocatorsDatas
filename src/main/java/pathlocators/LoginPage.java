package pathlocators; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage { //class//
	
	public static void main(String[] args) throws InterruptedException { //Main//
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://demo.actitime.com/login.do");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		//1.By ID//locators//
		
		WebElement uName = odriver.findElement(By.id("username"));
		
		uName.sendKeys("admin");
		
		//2.By Name//locators//
		
		WebElement pWord = odriver.findElement(By.name("pwd"));
		
		pWord.sendKeys("manager");
		
		 Thread.sleep(6000);
		
		//3.ID//
		
		WebElement login = odriver.findElement(By.id("loginButton"));
		login.click();

		String url = odriver.getCurrentUrl();
		System.out.println(url);

		String title = odriver.getTitle();
		System.out.println(title);

		Thread.sleep(6000);

		odriver.quit();

	}

}
