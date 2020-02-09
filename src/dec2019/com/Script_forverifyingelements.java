package dec2019.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_forverifyingelements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	List<WebElement>categories=driver.findElements(By.id("searchDropdownBox"));
		String item="deals";
		System.out.println(item);
		
		
	}

}
