package TotFelul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
    public WebDriver driver;

    @Test
    public void navigationMethod() {
        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

        // facem browserul in modul maximized
        driver.manage().window().maximize();

        // Click on Navigation button
        WebElement navigationElement = driver.findElement(By.xpath("//a[text()='Navigation']"));
        navigationElement.click();
        // Navigate through the pages
        WebElement secondPageElement = driver.findElement(By.xpath("//a[text()='2']"));
        secondPageElement.click();
        WebElement thirdPageElement = driver.findElement(By.xpath("//a[text()='3']"));
        thirdPageElement.click();
        WebElement previousPageElement = driver.findElement(By.xpath("//a[text()='Previous']"));
        previousPageElement.click();
        WebElement nextPageElement = driver.findElement(By.xpath("//a[text()='Next']"));
        nextPageElement.click();
        WebElement backToIndexElement = driver.findElement(By.xpath("//a[text()='Back to index']"));
        backToIndexElement.click();
    }
}




