import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    void mainTest(){
        System.setProperty("webdriver.chrome.driver","C:/webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://yandex.ru/");

    }
}
