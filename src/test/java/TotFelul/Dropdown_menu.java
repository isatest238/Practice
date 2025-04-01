package TotFelul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dropdown_menu {
    public WebDriver driver;

    @Test
    public void dropDownMethod(){
        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

        // facem browserul in modul maximized
        driver.manage().window().maximize();

        // Click on Dropdown menu option
        WebElement dropDownMenuElement = driver.findElement(By.xpath("//a[text()='Dropdown menu']"));
        dropDownMenuElement.click();

        // Click on 'Use left-click here'
        WebElement leftClickElement = driver.findElement(By.id("my-dropdown-1"));
        leftClickElement.click();

        // Right click - open dropdown menu
        WebElement rightClickElement = driver.findElement(By.id("my-dropdown-2"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickElement).perform();

        // double click - open dropdown menu
        WebElement doubletClickElement = driver.findElement(By.id("my-dropdown-3"));
        actions.doubleClick(doubletClickElement).perform();;
    }
}
