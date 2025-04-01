package TotFelul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DeTEST {
    public WebDriver driver;

    @Test

    public void LoginSuccessfulMethod() throws InterruptedException {
        Thread.sleep(2000);
        WebElement acceptAllCookiesElement = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptAllCookiesElement.click();

    }
}