import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestecomApp {


    WebDriver driver;


    @BeforeMethod

    public void OpenChrome() {


        driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();

    }

                @Test

               @AfterTest

                public void CloseChrome() {

                    driver.close();
                    driver.quit();

                }
            }

