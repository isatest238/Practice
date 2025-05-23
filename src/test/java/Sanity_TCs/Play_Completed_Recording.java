package Sanity_TCs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Play_Completed_Recording {
    public WebDriver driver;
    @Test
    public void recordingMethod (){
        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://web.beta.magentatv.de/");

        // facem browserul in modul maximized
        driver.manage().window().maximize();


        // Complete UserName and Password fields (accedo/pampalini) and click on Submit button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement userNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'visible-md')]//input[@id='signInFormUsername']")));
        userNameElement.click();
        userNameElement.sendKeys("accedo");


        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'visible-md')]//input[@id='signInFormPassword']")));
        passwordElement.click();
        passwordElement.sendKeys("pampalini");

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement submitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'visible-md')]//input[@name='signInSubmitButton']")));
        submitElement.click();


        // Accept AllCookie and click on Login Button
        WebElement acceptAllCookiesElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
        acceptAllCookiesElement.click();


        WebElement loginButtonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='MENU-LOGIN' and contains(@class, 'AAJoV')]")));
        loginButtonElement.click();

        // insert valid credentials and login into valid account
        WebElement usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
        usernameElement.click();
        usernameElement.click();
        usernameElement.sendKeys("551137864977");


        WebElement submitPasswordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pw_submit")));
        submitPasswordElement.click();

        WebElement password2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        password2Element.click();
        password2Element.sendKeys("Webclient2022!");


        WebElement loginButton2Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//scale-button[@id='pw_submit']")));
        loginButton2Element.click();

        WebElement spaterElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//scale-button[@id='cancel']")));
        spaterElement.click();

        // close the cookie pages using ESC key
        Actions actions = new Actions(driver);
        // Send ESC key globally
        actions.sendKeys(Keys.ESCAPE).perform();

        System.out.println("User successfully logged in");



    }
}
