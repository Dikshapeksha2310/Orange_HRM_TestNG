package Manipal_Orange_HRN.project.orange_HRM_Test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class File_upload_immigration extends Login {
	@AfterMethod
	
	public void uploadfile() {
		WebDriver driver = Login.driver;
		WebElement username = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		username.click();
		System.out.println("Navigated to Myinfo");
		
		WebElement immi=driver.findElement(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[5]"));
		immi.click();
		System.out.println("Navigated to Immigration");
		
		WebElement Addatt=driver.findElement(By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[2]"));
		Addatt.click();
		System.out.println("Add button clicked");
		

		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
         upload.sendKeys("C:\\Users\\Sarvesh\\OneDrive\\Pictures\\Shrimant Dagdusheth.jpg");
		System.out.println("File added");
		WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		comments.click();
		comments.sendKeys("Comments Added");
		System.out.println("comments in cmmt box added");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Information saved");
		
		
		
		/*
		 * browse.click(); System.out.println("browse button clicked");
		 * 
		 * driver.findElement(By.
		 * xpath("//i[@class=\"oxd-icon bi-upload oxd-file-input-icon\"]")).click();
		 */
		
	
		
	}
	

}
