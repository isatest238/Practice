package TotFelul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Over {
    public WebDriver driver;

    @Test
    public void mouseOverMethod(){
        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

        // facem browserul in modul maximized
        driver.manage().window().maximize();

        // Click on Mouse over button
        WebElement mouseOverElement = driver.findElement(By.xpath("//a[text()='Mouse over']"));
        mouseOverElement.click();

        // Perform mouse-over - 1st Element
        WebElement compassElement =driver.findElement(By.xpath("//img[@src='img/compass.png']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(compassElement).perform();

        // Perform mouse-over - 2nd Element
        WebElement calendarElement =driver.findElement(By.xpath("//img[@src='img/calendar.png']"));
        actions.moveToElement(calendarElement).perform();

        // Perform mouse-over - 3rd Element
        WebElement awardElement =driver.findElement(By.xpath("//img[@src='img/award.png']"));
        actions.moveToElement(awardElement).perform();

        // Perform mouse-over - 4th Element
        WebElement landscapeElement =driver.findElement(By.xpath("//img[@src='img/landscape.png']"));
        actions.moveToElement(landscapeElement).perform();
    }

}
