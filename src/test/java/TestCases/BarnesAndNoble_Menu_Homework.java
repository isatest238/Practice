package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
// https://www.barnesandnoble.com - faceti un test mic care sa aibe o metoda
// care sa aleaga sub-meniul dorit si apoi sa validati ca l-ati selectat

public class BarnesAndNoble_Menu_Homework {
    public WebDriver driver;

    @Test

    public void BarnesAndNoblebMethod() throws InterruptedException {
        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://www.barnesandnoble.com");

        // facem browserul in modul maximized
        driver.manage().window().maximize();

        WebElement menuElement = driver.findElement(By.id("rhfCategoryFlyout_eBooks"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuElement).pause(5000).perform();
        WebElement siblingElement = driver.findElement(By.xpath(""));


    }
}
