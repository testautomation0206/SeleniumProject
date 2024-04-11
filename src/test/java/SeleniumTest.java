import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    //driver shouls be  variable is public
    public static WebDriver driver ;
   @BeforeTest
    void SetUp(){
       // System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/src/test/Resources/geckodriver.exe");
       // WebDriver driver = new FirefoxDriver();
       ChromeOptions chromeOptions = new ChromeOptions();
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://google.com");
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
    @Test
    void testSteps() throws InterruptedException {
       driver.findElement(By.name("q")).sendKeys("selenium");
       Thread.sleep(1000);
    driver.findElement(By.xpath("//a[text()='Gmail']")).click();
    }
    @AfterTest
    void tearDown(){
       driver.quit();
    }

}
