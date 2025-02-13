package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
// https://www.airbnb.ie - faceti un test mic in care
// sa aveti o metoda  care sa aleaga meniul dorit si apoi sa validati ca l-ati selectat

public class Airbnb_Menu_Homework {
    public WebDriver driver;

    @Test

    public void AirbnbMethod() throws InterruptedException {
        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://www.airbnb.ie/");

        // facem browserul in modul maximized
        driver.manage().window().maximize();

        Thread.sleep(5000);
        WebElement AcceptElement = driver.findElement(By.xpath("//div[@class='b16xa5oq atm_gi_1pzushe atm_jb_8wlvj5__oggzyc atm_gi_idpfg4__oggzyc atm_jb_rvwng3__1v156lz i1ckokof atm_h0_1gibeiw__oggzyc dir dir-ltr']"));
        AcceptElement.click();
        //selecteaza un meniu
        WebElement meniuElement = driver.findElement(By.xpath("//span[contains(@class,'ti7yjx atm_ve_glywfm atm_vb_glywfm atm_9s_1o8liyq atm_uc_1bfgeka dir dir-ltr' ) and text()='OMG!']"));
        Thread.sleep(2000);
        meniuElement.click();


    }

}
