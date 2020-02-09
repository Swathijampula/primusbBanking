package december12.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are::"+links.size());
		for(int i=0;i<=links.size();i++)
		{
			String linktext=links.get(i).getText();
			String linkurl=links.get(i).getAttribute("href");
			System.out.println(linktext+"\n"+linkurl);
		}
			driver.close();
		
	}

}
