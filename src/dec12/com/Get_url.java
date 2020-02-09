package dec12.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_url {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		Thread.sleep(5000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
