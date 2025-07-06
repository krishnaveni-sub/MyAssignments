package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCreateAccount {

	public static void main(String[] args) {
		//EdgeDriver driver=new EdgeDriver();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//login with user name and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		String accName="testkrishna123666";
        driver.findElement(By.id("accountName")).sendKeys(accName);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	    WebElement	industryDD= driver.findElement(By.name("industryEnumId"));
		Select sel1=new Select(industryDD);
		sel1.selectByValue("IND_SOFTWARE");
		WebElement	ownershipDD= driver.findElement(By.name("ownershipEnumId"));
		Select sel2=new Select(ownershipDD);
		sel2.selectByVisibleText("S-Corporation");
		WebElement	sourceDD= driver.findElement(By.name("dataSourceId"));
		Select sel3=new Select(sourceDD);
		sel3.selectByValue("LEAD_EMPLOYEE");
		WebElement	marketCampDD= driver.findElement(By.name("marketingCampaignId"));
		Select sel4=new Select(marketCampDD);
		sel4.selectByIndex(6);
		
		WebElement	stateDD= driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel5=new Select(stateDD);
		sel5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
		WebElement accountname =driver.findElement(By.xpath("(//span[@class='tabletext' ])[3]"));
		System.out.println(accountname.getText());
		
		if(accountname.getText().contains(accName))
				System.out.println("Accountname verified");
		else
			System.out.println("not matching");
		driver.close();
		
				
				

	}

}
