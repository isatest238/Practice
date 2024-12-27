package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Form_Fields {
    public WebDriver driver;

    @Test
    public void formFieldsMethod() {
        //deschidem un Chrome browser
        driver = new ChromeDriver();
        //accesam o pagina web
        driver.get("https://practice-automation.com/");
        // click on 'Form Fields'
        WebElement formFields = driver.findElement(By.xpath("//a[text()='Form Fields']"));
        formFields.click();
        //insert text into 'Name' field
        WebElement nameElement = driver.findElement(By.id("name-input"));
        String nameValue = "Isabela";
        nameElement.sendKeys(nameValue);
        // insert text into 'Password' field

    }
}