package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class SelectFacebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("test12");
		driver.findElement(By.name("lastname")).sendKeys("s");
		driver.findElement(By.name("reg_email__")).sendKeys("t@x.com");
		driver.findElement(By.id("password_step_input")).sendKeys("ABDC123$$");
		//choos gender as female
driver.findElement(By.xpath("//input[@value='1']")).click();
WebElement day= driver.findElement(By.id("day"));
Select sel1= new Select(day);
sel1.selectByVisibleText("10");



WebElement month= driver.findElement(By.id("month"));
Select sel2= new Select(month);
sel2.selectByVisibleText("May");
WebElement year= driver.findElement(By.id("year"));
Select sel3= new Select(year);
sel3.selectByVisibleText("2020");


		
		
		
		
		

		
		

	}

}
