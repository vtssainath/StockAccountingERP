package commonFunctions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FunctionLibrary 
{
	static WebDriver driver;

	public static WebDriver startBrowser() throws Exception
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();	 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}

	public static void openApplication(WebDriver driver) throws Exception{
		driver.get("http://webapp.qedgetech.com");	
	}

	public static void waitForElement(WebDriver driver,String LocatorType,String LocatorValue,String waittime)
	{

		WebDriverWait mywait=new WebDriverWait(driver, Integer.parseInt(waittime));
		if(LocatorType.equalsIgnoreCase("id"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LocatorValue)));
		}
		else if(LocatorType.equalsIgnoreCase("xpath"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorValue)));
		}else if(LocatorType.equalsIgnoreCase("name"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(LocatorValue)));
		}else
		{
			System.out.println("unable to locate for waitForElement method with "+LocatorType);
		}			
	}

	public static void clickAction(WebDriver driver,String LocatorType,String LocatorValue)
	{
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(LocatorValue)).sendKeys(Keys.ENTER);
		}
		else if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(LocatorValue)).click();
		}
		else if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(LocatorValue)).click();
		}
		else{
			System.out.println("Unable to locate for ClickAction method");	
		}
	}

	public static void typeAction(WebDriver driver,String LocatorType,String LocatorValue,String TestData){
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(LocatorValue)).clear();
			driver.findElement(By.id(LocatorValue)).sendKeys(TestData);
		}
		else if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(LocatorValue)).clear();
			driver.findElement(By.name(LocatorValue)).sendKeys(TestData);
		}
		else if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(LocatorValue)).clear();
			driver.findElement(By.xpath(LocatorValue)).sendKeys(TestData);
		}else
		{
			System.out.println("unable to locate for typeAction method with "+LocatorType);
		}	
	}

	public static void captureData(WebDriver driver,String LocatorType,String LocatorValue) throws Exception
	{
		String captdata="";
		if(LocatorType.equalsIgnoreCase("id"))
		{
			captdata=driver.findElement(By.id(LocatorValue)).getAttribute("value");
		}
		else if(LocatorType.equalsIgnoreCase("xpath"))
		{
			captdata=driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
		}
		else if(LocatorType.equalsIgnoreCase("name"))
		{
			captdata=driver.findElement(By.name(LocatorValue)).getAttribute("value");
		}
		FileWriter fw=new FileWriter (System.getProperty("user.dir")+"\\CaptureData\\suppnumber.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(captdata);
		bw.flush();
		bw.close();	
	}

	public static void supplierTable(WebDriver driver,String column) throws Exception
	{
		FileReader fr = new FileReader("./CaptureData/suppnumber.txt");
		BufferedReader br = new BufferedReader(fr);
		String Exp_data=br.readLine();

		if(driver.findElement(By.xpath("//*[@id='psearch']")).isDisplayed()){
			driver.findElement(By.xpath("//*[@id='psearch']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='psearch']")).sendKeys(Exp_data);
			driver.findElement(By.xpath("//*[@id='btnsubmit']")).click();
		}else
		{
			driver.findElement(By.xpath("//*[@id='ewContentColumn']/div[2]/div[2]/div/button/span")).click();
			driver.findElement(By.xpath("//*[@id='psearch']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='psearch']")).sendKeys(Exp_data);
			driver.findElement(By.xpath("//*[@id='btnsubmit']")).click();
		}
		WebElement table=driver.findElement(By.xpath("//table[@id='tbl_a_supplierslist']"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++){
			String act_data=driver.findElement(By.xpath("//table[@id='tbl_a_supplierslist']/tbody/tr["+i+"]/td["+column+"]/div/span/span")).getText();
			Assert.assertEquals(act_data, Exp_data);
			System.out.println(act_data+"   "+Exp_data);
			break;		
		}

	}
	public static void validateTitle(WebDriver driver, String Exp_Title) 
	{
		String Act_Title = driver.getTitle();
		try {
			Assert.assertEquals(Exp_Title, Act_Title,"Title is Not Matching");
		}catch (Throwable t) 
		{
			System.out.println(t.getMessage());
		}
	}
	public static void selectAction(WebDriver driver,String Locator_Type, String Locator_value,String TestData) throws Throwable 
	{
		if (Locator_Type.equalsIgnoreCase("name")) 
		{ 
			WebElement element = driver.findElement(By.name(Locator_value));
			Thread.sleep(3000);
			Select catagory = new Select(element);
			catagory.selectByVisibleText(TestData);	
		}else if (Locator_Type.equalsIgnoreCase("id")) 
		{
			WebElement element = driver.findElement(By.id(Locator_value));
			Thread.sleep(3000);
			Select catagory = new Select(element);
			catagory.selectByVisibleText(TestData);	
		}else if (Locator_Type.equalsIgnoreCase("xpath")) 
		{
			WebElement element = driver.findElement(By.xpath(Locator_value));
			Thread.sleep(3000);
			Select catagory = new Select(element);
			catagory.selectByVisibleText(TestData);	
		}
	}
	public static void mouseDrag(WebDriver driver,String LocatorType,String LocatorValue) throws Throwable 
	{		
		if (LocatorType.equalsIgnoreCase("name")) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.name(LocatorValue))).perform();
		}else if (LocatorType.equalsIgnoreCase("id")) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.id(LocatorValue))).perform();	
		}else if (LocatorType.equalsIgnoreCase("xpath")) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath(LocatorValue))).perform();
		}	
	}
	
	public static void mouseClick(WebDriver driver,String LocatorType,String LocatorValue)
	{
		if (LocatorType.equalsIgnoreCase("name")) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.name(LocatorValue))).click().perform();
		}else if (LocatorType.equalsIgnoreCase("id")) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.id(LocatorValue))).click().perform();	
		}else if (LocatorType.equalsIgnoreCase("xpath")) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath(LocatorValue))).click().perform();
		}
	}

	public static void tableData(WebDriver driver,String Locator_Value) throws Throwable 
	{
		

	}
	public static void stockTable(WebDriver driver,String Locator_Value,String TestData) throws Throwable 
	{
		if (!driver.findElement(By.xpath(("search-textbox"))).isDisplayed());
		Thread.sleep(3000);
		driver.findElement(By.xpath(("search-panel"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(("search-textbox"))).sendKeys(TestData);
		Thread.sleep(3000);
		driver.findElement(By.xpath(("search-button"))).click();
		Thread.sleep(3000);
		String ActualData = driver.findElement(By.xpath(Locator_Value)).getText();
		System.out.println(TestData+"   "+ActualData);
		Assert.assertEquals(ActualData,TestData,"Data Not Found in Table");

	}

	public static void mouseDbclick(WebDriver driver,String Locator_Type,String Locator_Value)
	{
		if (Locator_Type.equalsIgnoreCase("name")) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.name(Locator_Value))).doubleClick().perform();
		}else if (Locator_Type.equalsIgnoreCase("id")) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.id(Locator_Value))).doubleClick().perform();	
		}else if (Locator_Type.equalsIgnoreCase("xpath")) 
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath(Locator_Value))).doubleClick().perform();
		}

	}


























}
