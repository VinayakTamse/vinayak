package testscript;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {
	
	public static void findFrames(WebDriver driver)	{
		List <WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.getClass());
		System.out.println(list.size());
		
	}

}
