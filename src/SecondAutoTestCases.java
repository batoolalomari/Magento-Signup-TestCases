import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondAutoTestCases {
	//global declaration
	WebDriver driver= new ChromeDriver();

	@BeforeTest
	public void setUp() {
		
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");	}
	
	@Test (priority = 1)
	public void signUp() {
		
		driver.findElement(By.cssSelector("ul > li:nth-child(3)")).click();
		driver.findElement(By.id("firstname")).sendKeys("Tester3");
		driver.findElement(By.id("lastname")).sendKeys("Auto3");
		driver.findElement(By.id("email_address")).sendKeys("TesterAuto3@gmail.com");
		driver.findElement(By.id("password")).sendKeys("TesterAuto123");
		driver.findElement(By.id("password-confirmation")).sendKeys("TesterAuto123");
		driver.findElement(By.cssSelector(".action.submit.primary")).click();
		
	}
	
	@Test (priority = 2)
	public void Login() {
		driver.findElement(By.className("authorization-link")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("TesterAuto2@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("TesterAuto123");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
	}
}
