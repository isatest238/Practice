package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class Sign_In_Username_and_Password_PopUp {
    public WebDriver driver;

    @Test

    public void Sign_In_Username_and_Password_PopUpMethod() throws InterruptedException {

        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://web.beta.magentatv.de/");

        // facem browserul in modul maximized
        driver.manage().window().maximize();


        WebElement userNameElement = driver.findElement(By.xpath("//*[contains(@class,'visible-md')]//input[@id='signInFormUsername']"));
        userNameElement.click();
        userNameElement.sendKeys("accedo");

        WebElement passwordElement = driver.findElement(By.xpath("//*[contains(@class, 'visible-md')]//input[@id='signInFormPassword']"));
        passwordElement.click();
        passwordElement.sendKeys("pampalini");

        WebElement submitElement = driver.findElement(By.xpath("//*[contains(@class, 'visible-md')]//input[@name='signInSubmitButton']"));
        submitElement.click();

        Thread.sleep(5000);
        WebElement acceptAllCookiesElement = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptAllCookiesElement.click();
        Thread.sleep(2000);

        WebElement loginButtonElement = driver.findElement(By.xpath("//a[@id='MENU-LOGIN' and contains(@class, 'AAJoV')]"));
        Thread.sleep(2000);
        loginButtonElement.click();
        Thread.sleep(4000);

        WebElement usernameElement = driver.findElement(By.xpath("//input[@type='email']"));
        Thread.sleep(4000);
        usernameElement.click();
        usernameElement.click();
        usernameElement.sendKeys("551137864977");

        Thread.sleep(4000);
        WebElement submitPasswordElement = driver.findElement(By.id("pw_submit"));
        submitPasswordElement.click();

        WebElement password2Element = driver.findElement(By.xpath("//input[@type='password']"));
        password2Element.click();
        password2Element.sendKeys("Webclient2022!");

        Thread.sleep(4000);
        WebElement loginButton2Element = driver.findElement(By.xpath("//scale-button[@id='pw_submit']"));
        loginButton2Element.click();

        WebElement spaterElement = driver.findElement(By.xpath("//scale-button[@id='cancel']"));
        spaterElement.click();

        Thread.sleep(10000);
        Actions actions = new Actions(driver);
// Send ESC key globally
        actions.sendKeys(Keys.ESCAPE).perform();

        Thread.sleep(2000);
        WebElement homeScreenElement = driver.findElement(By.id("STRUCTURED-LANE-JETZT-LAUFT-IM-TV-HEADLINE"));

        // Get the text inside the <span> tag
        String actualText = homeScreenElement.findElement(By.tagName("span")).getText();

        // Expected text
        String expectedText = "Jetzt läuft im TV";

        // Assert the text
        Assert.assertEquals(actualText, expectedText, "Text verification failed!");



//        WebElement goToSettingsElement = driver.findElement(By.xpath("//*[@id='MENU-USER']/i"));
//        goToSettingsElement.click();
//
//        WebElement menuSettingsElement = driver.findElement(By.xpath("//a[@id='MENU-SETTINGS']"));
//        menuSettingsElement.click();
//        Thread.sleep(2000);
//
//        WebElement systemInformationenElement = driver.findElement(By.xpath("//a[@id='SETTINGS-MENU-SYSTEM']"));
//        systemInformationenElement.click();
//        Thread.sleep(2000);
//
//        //List<WebElement> systemInformationeScreenElement = driver.findElements(By.xpath("//div[@class='ahKFV']//span[@class='zPdxw']"));


    }
}