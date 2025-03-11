package TestCases;

import TestCases.Sign_In_Username_and_Password_PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginSuccessful {
    public WebDriver driver;

    @Test

    public void LoginSuccessfulMethod() throws InterruptedException {
        Thread.sleep(2000);
        WebElement acceptAllCookiesElement = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptAllCookiesElement.click();

    }
}