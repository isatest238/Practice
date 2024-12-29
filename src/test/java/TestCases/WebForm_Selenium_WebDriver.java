package TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;

public class WebForm_Selenium_WebDriver {
    public WebDriver driver;

    @Test
    public void metodaTest() {
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

        // Select radio button
        WebElement checkedRadioElement = driver.findElement(By.id("my-radio-1"));
        WebElement defaultRadioElement = driver.findElement(By.id("my-radio-2"));
        //verify what method return a value for the name of the radio buttons
        //String radioValue = defaultRadioElement.getAccessibleName();
        //System.out.println(radioValue);
        String valueSelected = "Default radio";
        if (checkedRadioElement.getAccessibleName().equals(valueSelected)) {
            checkedRadioElement.click();
       } else if (defaultRadioElement.getAccessibleName().equals(valueSelected)) {
           defaultRadioElement.click();
       }

        // Select checkbox
        WebElement checkedCheckboxElement = driver.findElement(By.id("my-check-1"));
        WebElement defaultCheckboxElement = driver.findElement(By.id("my-check-2"));
        String checkboxValue = "Default checkbox";

        if (checkedCheckboxElement.getAccessibleName().equals(checkboxValue)) {
            System.out.println("Already selected");
        }
        else if (!checkedCheckboxElement.getAccessibleName().equals(checkboxValue)){
           checkedCheckboxElement.click();
        }
        if (defaultCheckboxElement.getAccessibleName().equals(checkboxValue)) {
           defaultCheckboxElement.click();
        }

    // color picker
        WebElement colorPickerElement =driver.findElement(By.xpath("//input[@name='my-colors']"));
        colorPickerElement.click();
        colorPickerElement.sendKeys("#00ff00");

     // date picker
        WebElement datePikerElement = driver.findElement(By.xpath("//input[@name='my-date']"));
        datePikerElement.click();
        datePikerElement.sendKeys("09/19/2025");

     // Range - bar
        WebElement rangeElement = driver.findElement(By.xpath("//input[@name='my-range']"));
        rangeElement.click();
        System.out.println(rangeElement.getAttribute("value"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = 9;", rangeElement);
        System.out.println(rangeElement.getAttribute("value"));

     // dropdown list selection
        WebElement dropdownListElement = driver.findElement(By.xpath("//input[@name='my-datalist']"));
        dropdownListElement.sendKeys("Seattle");
        dropdownListElement.sendKeys(Keys.TAB);

     // Click on Submit button
     driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }




    //DropDown Selection
    public void dropDownSelectionMethod(int numar) {
        //dropdown.selectByValue(String.valueOf(numar));
        if (numar > 0 && numar <= 3) {
            WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='my-select']"));
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByIndex(numar);
        } else {
            WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='my-select']"));
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByIndex(0);
        }
    }

     //Dropdown (datalist) -???? nu mi iese deocamdata


    }





