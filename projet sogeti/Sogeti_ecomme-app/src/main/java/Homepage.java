import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver;

    public void opensigninpage() {


        By signin = By.cssSelector(".login");
        driver.findElement(signin).click();
    }
}