import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class MainTest {
    @Test
    void mainTest(){
        System.setProperty("webdriver.chrome.driver","C:/webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://yandex.ru/");
    }
}
