package dec10.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_Items {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/r.php");
		Select monthlist=new Select(driver.findElement(By.id("month")));
		boolean value=monthlist.isMultiple();
		System.out.println(value);
		Select yearlist=new Select(driver.findElement(By.id("year")));
		boolean value1=yearlist.isMultiple();
		System.out.println(value1);
		monthlist.selectByVisibleText("Jan");
		Thread.sleep(5000);
		yearlist.selectByVisibleText("1991");
		Thread.sleep(5000);
		monthlist.selectByIndex(11);
		System.out.println(monthlist.getFirstSelectedOption());
		Thread.sleep(5000);
		yearlist.selectByIndex(55);
		System.out.println(yearlist.getFirstSelectedOption());
		
		
		driver.close();
		
	}

}
