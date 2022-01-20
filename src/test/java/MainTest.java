import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {
    @Test
    void mainTest() {
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // на каждый поиск элемента будет искаться не более 10 секунд
            driver.manage().window().maximize();
            driver.get("https://yandex.ru/");
            WebElement inputSearch = driver.findElement(By.name("text"));
            inputSearch.sendKeys("Arcane", Keys.ENTER); // search word Arcane and press enter
        } finally {
            driver.close();
        }
    }
}
