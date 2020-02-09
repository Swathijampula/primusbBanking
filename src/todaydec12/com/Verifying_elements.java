package todaydec12.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifying_elements {

	public static void main(String[] args) {
		String Expitem="deals";
		boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Select element= new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>items=element.getOptions();
		System.out.println("no of items are::"+items.size());
		for(int i=0;i<items.size();i++)
		{
			String itemlist=items.get(i).getText();
			
			System.out.println(itemlist);
			if(Expitem.equalsIgnoreCase(itemlist))
			{
				itemexist=true;
				break;
				
			}
		}
		
		if(itemexist)
		{
			System.out.println("item found in the list box::"+Expitem);
		}
		else
		{
			System.out.println("item not found in listbox::"+Expitem);
		}
		
		
		driver.close();
		
	}	
	
}

