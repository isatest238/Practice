package TotFelul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_and_drop {
    public WebDriver driver;

    @Test
    public void dragAndDropMethod(){
        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

        // facem browserul in modul maximized
        driver.manage().window().maximize();

        // Click on 'Drag and drop' menu option
        WebElement dragAndDropElement = driver.findElement(By.xpath("//a[text()='Drag and drop']"));
        dragAndDropElement.click();

        WebElement draggableElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("target"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform drag-and-drop using clickAndHold and moveToElement
        actions.clickAndHold(draggableElement).moveToElement(dropElement).release().perform();
    }
}
