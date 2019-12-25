	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.reporters.XMLConstants;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;
public class First_Assignment {
	
	    public static void main(String[] args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		//launch the browser - chrome
			WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        WebElement we = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        we.sendKeys("iPhone XR (64GB)");
	        
	        driver.findElement(By.xpath("//input[@value='Go']")).click();
	        Thread.sleep(5000);
	        
	        String actual = "Apple iPhone XR (64GB) - Yellow";
	        WebElement expected = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone XR (64GB) - Yellow')]"));
	        String expected_result = expected.getText();

//	        int inum = 0;
//	        int inum2 = 0 ;
	        if (actual.equals(expected_result)) {
	            WebElement prc = driver.findElement(By.xpath("//span[contains(text(),'45,900')]"));
	            String price_check =prc.getText();
//	            int inum = Integer.parseInt(price_check);
	            System.out.println(price_check);
	        }

	        driver.get("https://www.flipkart.com");
	        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        WebElement we1 = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	        we.sendKeys("iPhone XR (64GB) yellow");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(2000);
	        String actual_fk = "Apple iPhone XR (64GB) - Yellow";
	        WebElement expected_fk = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone XR (64GB) - Yellow')]"));
	        String expected_result_fk = expected.getText();
	        if (actual.equals(expected_result)) {
	            WebElement prc_fk = driver.findElement(By.xpath("//div[contains(text(),'53,999')]"));
	            String price_check_fk = prc_fk.getText();
//	            int inum2 = Integer.parseInt(price_check_fk);
	            System.out.println(price_check_fk);
	        }

//	        if (inum < inum2) {
//	            System.out.println("Amazon in giving in less price");
//	        }
//	        else if (inum > inum2){
//	            System.out.println("flipkart in giving less price");
//	        }
//	        else if (inum > inum2){
//	            System.out.println("Both price are same");
//	        }
	        driver.close();
	        driver.quit();
	    }
	}


