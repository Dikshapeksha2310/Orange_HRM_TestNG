package Manipal_Orange_HRN.project.orange_HRM_Test_NG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Edit_existing_data extends Login {
	@AfterMethod
	public void editdata() {
		WebDriver driver = Login.driver;
		WebElement username = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		username.click();
		System.out.println("Navigated to Myinfo");
		
		WebElement immi=driver.findElement(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[5]"));
		immi.click();
		System.out.println("Navigated to Immigration");
		driver.findElement(By.xpath("(//button[@class=\"oxd-icon-button oxd-table-cell-action-space\"])[2]")).click();
		System.out.println("click on edit button");
WebElement num=driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		
		num.click();
		
		num.sendKeys("abc789");
		System.out.println("Edited Number");
		WebElement cmmt=driver.findElement(By.xpath("//textarea[@placeholder=\"Type Comments here\"]"));
		cmmt.click();
		cmmt.clear();
		cmmt.sendKeys("Updated information");
		System.out.println("Comments Button Clicked");
		
		WebElement save=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		save.click();
		System.out.println("Immigration Details Added Sucess");
		
	
  }
}
