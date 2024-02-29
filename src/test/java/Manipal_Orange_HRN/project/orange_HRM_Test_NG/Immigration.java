package Manipal_Orange_HRN.project.orange_HRM_Test_NG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Immigration extends Login {

	@AfterMethod
	public void immigrationTest() {
		WebDriver driver = Login.driver;
		WebElement username = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		username.click();
		System.out.println("Navigated to Myinfo");
		
		WebElement immi=driver.findElement(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[5]"));
		immi.click();
		System.out.println("Navigated to Immigration");
		
		WebElement AddImmi = driver.findElement(By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[1]"));
		AddImmi.click();
		System.out.println("Add button is clicked");
		
		WebElement radio=driver.findElement(By.xpath("(//span[@class=\"oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input\"])[2]"));
		radio.click();
		System.out.println("radio click");
		
		WebElement num=driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		
		num.click();
		num.sendKeys("12345");
		
		WebElement issdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		issdate.click();
		issdate.sendKeys("2023-01-01");
		System.out.println("Issue Date Selected");
		
		WebElement expdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		expdate.click();
		expdate.sendKeys("2026-01-01");
		System.out.println("Expiry Date Selected");

		WebElement eligiblestatus = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("Eligible");
		System.out.println("Eligible Status Added");
		
		WebElement revdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]"));
		revdate.click();
		revdate.sendKeys("2023-08-03");
		System.out.println("Review Date Selected");
		
		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("OrangeHRM would be better");
		System.out.println("Clicked on Comments Box ");
		
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		
		System.out.println("Immigration Details Added Sucess");
		
		
	}
	

}
