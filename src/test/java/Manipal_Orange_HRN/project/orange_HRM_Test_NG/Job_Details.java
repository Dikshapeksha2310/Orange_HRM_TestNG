package Manipal_Orange_HRN.project.orange_HRM_Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Job_Details extends Login {
	
	@AfterMethod
	public void jobdetails() {
		WebDriver driver = Login.driver;
		WebElement username = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		username.click();
		System.out.println("Navigated to Myinfo");
		
		WebElement immi=driver.findElement(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[6]"));
		immi.click();
		System.out.println("Navigated to Immigration");
		String titleString=driver.getTitle();
		System.out.println(titleString);
		
		String acceptedString="Manipal_Orange_HRN.project.orange_HRM_Test_NG.Login.LoginTest";
		titleString.equals(acceptedString);
		System.out.println("On Job Details Page");
	}
}
