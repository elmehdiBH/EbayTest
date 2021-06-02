import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class Signin {

    WebDriver driver;

        public void enteremail () {

            By emailinput = By.id("email_create");
            By authentifiatebuttom = By.id("SubmitCreate");
            String emailuserexample = "elmehdi.bahou@gmail.com";

            driver.findElement(emailinput).sendKeys(emailuserexample);
            driver.findElement(authentifiatebuttom).click();


        }
    }
