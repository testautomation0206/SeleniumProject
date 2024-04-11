import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;


public class Selenium123 {
    @Test
    void SetUp1(){
        FirefoxProfile profile = new FirefoxProfile();
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/src/test/Resources/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        System.out.println("Divya KC");
    }
}
