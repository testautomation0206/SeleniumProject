/*/1) Find Number of Links in Page

2) Print Link Texts from all the links

3) Check how many links does not have href attribute(broken links)*/
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

       // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asus");

        // Locate the search input field and enter the product
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Sams");


        // Wait for suggestions to appear
        try {
            Thread.sleep(2000); // Replace with explicit wait if needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the list of suggestions
        List<WebElement> suggestions = driver.findElements(By.xpath("//input[@name='q']/..//following::ul/li"));
        System.out.println(suggestions);
       //Checks if there are at least two elements in the suggestions list
        if (suggestions.size() >=2) {
            WebElement secondSuggestion = suggestions.get(0); // Index 1 for the second suggestion
          //System.out.println(secondSuggestion.getText());
            System.out.println("Second suggestion:" + secondSuggestion.getText());
        } else {
            System.out.println("No second suggestion found.");
        }

        // Close the browser
        driver.quit();


    }

}