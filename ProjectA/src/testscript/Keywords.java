package testscript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Keywords {
	static WebDriver driver;
	static FileInputStream file;
	static Properties p;
	static Select sel;
	
	public void Openbrowser() throws Exception	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		file = new FileInputStream("C:\\Users\\DELL\\workspace\\ProjectA\\src\\objectrepository\\objectrepository.properties");
		p = new Properties();
		p.load(file);
		
	}
	
	public void Navigate(String Data) throws InterruptedException	{
		driver.get(Data);
		Thread.sleep(5000);
	}
	
	public void InputByCss(String Data, String Objectname)	{
		driver.findElement(By.cssSelector(p.getProperty(Objectname))).sendKeys(Data);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void InputByXpath(String Data, String Objectname)	{
		driver.findElement(By.xpath(p.getProperty(Objectname))).sendKeys(Data);
	}
	
	public void ClickByCss(String Objectname)	{
		driver.findElement(By.cssSelector(p.getProperty(Objectname))).click();
	}
	
	public void Select(String Data, String Objectname) throws InterruptedException	{
		Frames.findFrames(driver);
		sel = new Select(driver.findElement(By.xpath(p.getProperty(Objectname))));
		sel.selectByVisibleText(Data);
		
		
	}

}
