package TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.security.Key;

public class WebForm_Selenium_WebDriver {
    public WebDriver driver;

    @Test
    public void metodaTest (){
        formFieldsMethod();
        dropDownSelectionMethod(-1);
    }
    public void formFieldsMethod() {
        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

        // facem browserul in modul maximized
        driver.manage().window().maximize();

        // click on 'Web Form'
        WebElement webFormElement = driver.findElement(By.xpath("//a[text()='Web form']"));
        webFormElement.click();

        // Insert value into 'Text Input' field
        WebElement textInputElement = driver.findElement(By.id("my-text-id"));
        String textInputValue = "Isabela_Text";
        textInputElement.sendKeys(textInputValue);

        // Insert value into 'Password' field
        WebElement passwordElement = driver.findElement(By.xpath("//input[@name='my-password']"));
        String passwordValue = "ISAbela12";
        passwordElement.sendKeys(passwordValue);

        // Insert text into 'Textarea field'
        WebElement textareaElement = driver.findElement(By.xpath("//textarea[@name='my-textarea']"));
        String textareaValue = "Hands-On Selenium WebDriver with Java";
        textareaElement.sendKeys(textareaValue);

        // File input - choose file - upload a picture
        WebElement chooseFileElemennt = driver.findElement(By.xpath("//input[@name='my-file']"));
        File file = new File("src/test/Resources/picture_automation.png");
        chooseFileElemennt.sendKeys(file.getAbsolutePath());
    }
    //DropDown Selection
    public void dropDownSelectionMethod (int numar){
        //dropdown.selectByValue(String.valueOf(numar));
        if (numar > 0 && numar <= 3) {
            WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='my-select']"));
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByIndex(numar);
        }
        else {
            WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='my-select']"));
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByIndex(0);
            }
        }

      //Dropdown (datalist) -???? nu mi iese deocamdata


    }




