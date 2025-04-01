package TotFelul;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

// https://letcode.in/forms - faceti un test mic in care gasiti locatori pt "Country code" si "Country"
// si apoi  scrie-ti  in fieldurile respective


public class CountryCode_Homework {
    public WebDriver driver;

    @Test
    public void CountryCodeMethod() {
        //deschidem un Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://letcode.in/forms");

        // facem browserul in modul maximized
        driver.manage().window().maximize();


        List<WebElement> listCountryCode = driver.findElements(By.xpath("//label[text()='Country code']/following::select[1]//option[@data-countrycode]"));

        // Get the size of a list of WebElements
        int listSize = listCountryCode.size(); // list is a List<WebElement>
        System.out.println("List size: " + listSize);

        for (int i = 0; i < listCountryCode.size(); i++) {
            WebElement clickElement = listCountryCode.get(i);
            String listElement = listCountryCode.get(i).getAttribute("data-countrycode");
            System.out.println(listElement);
            String countrycodeValue = "BR";
            if (listElement.equals(countrycodeValue)) {
                clickElement.click();
            }
        }
        // facem un scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        List<WebElement> listCountry = driver.findElements(By.xpath("//label[text()='Country code']/following::select[2]//option[@value]"));
        for (int i = 0; i < listCountry.size(); i++) {
            WebElement clickElement2 = listCountry.get(i);
            String listElement = listCountry.get(i).getAttribute("value");
            System.out.println(listElement);
            String countryValue = "Zimbabwe";
            if (listElement.equals(countryValue)) {
                clickElement2.click();
            }
        }
    }
}
