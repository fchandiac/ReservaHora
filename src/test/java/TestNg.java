import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNg {
	WebDriver  driver;
	By userInput = By.id("user");
	By passInput = By.id("pass");

  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/driver/chromedriver101.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://localhost:8080/ReservaHora/index.jsp");
  }
  
  @Test
  public void TestLogin() {
	  WebElement element = driver.findElement(userInput);
	  element.clear();
	  element.sendKeys("pet");
	  element = driver.findElement(passInput);
	  element.clear();
	  element.sendKeys("pet123");
	  element.submit();
	 
  }

  @AfterMethod
  public void afterMethod() {
  }


 
 
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
