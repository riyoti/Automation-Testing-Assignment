import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Test1 {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		//launch the browser - chrome
		WebDriver driver = new ChromeDriver();	
        driver.manage().window().maximize();
		
		
        driver.get("https://www.tripadvisor.in/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
      
        WebElement searchbox = driver.findElement(By.xpath("//div[@title='Search']"));
        searchbox.click();
      
		Thread.sleep(5000);
		 WebElement inputbox = driver.findElement(By.id("mainSearch"));
		
		 inputbox.sendKeys("Club Mahindra");
		selectItem("1");
	
		{
	driver.findElement(By.xpath("//a[@class='ui_button primary']")).click();
	
	
		Thread.sleep(5000);
		
		WebElement srating1=(WebElement) driver.findElements(By.xpath("//span[@id='bubble_rating'][@data-value='1'])"));
		WebElement srating2=(WebElement)driver.findElements(By.xpath("//span[@id='bubble_rating'][@data-value='2'])"));
		WebElement srating3=(WebElement)	driver.findElements(By.xpath("//span[@id='bubble_rating'][@data-value='3'])"));
		WebElement srating4=(WebElement)driver.findElements(By.xpath("//span[@id='bubble_rating'][@data-value='4'])"));
		WebElement srating5=(WebElement)driver.findElements(By.xpath("//span[@id='bubble_rating'][@data-value='5'])"));
	
		        Actions builder = new Actions(driver);  
		         builder.moveToElement(srating1).release().perform();
		        builder.moveToElement(srating1).release().perform();
		        builder.moveToElement(srating2).release().perform();
				builder.moveToElement(srating3).release().perform();
				builder.moveToElement(srating4).release().perform();
		        srating5.click();
	  
}
	
	
	WebElement textbox1 = driver.findElement(By.id("ReviewTitle"));
	textbox1.sendKeys("Club Mahindra ! Awesome hospitality!");
	

	
	WebElement textbox2 = driver.findElement(By.id("ReviewText"));
	textbox2.sendKeys("It was a awesome experience in club Mahindra,"
			+ "hospitality service which I received was excellent."
			+ "very supportive staff. Especially Deepak was very help full. "
			+ "Appreciate his sincerity and pleasing attitude towards client! "
			+ "I will give 5star rating !!! Thanks Deepak for your service!");
	
	 driver.findElement(By.xpath("//div[@id='SUBMIT']")).submit();
	

public  static void selectItem(String selectvalue)
{
	List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@class='resultContainer local']//li"));
			
			for(int i;i<allLinks.length();i++) {
				
				if(selectvalue==allLinks[i]) {
					allLinks[i].click();
				
			}}}

}

