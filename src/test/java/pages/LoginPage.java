package pages;

import framework.BaseSetup;
import org.openqa.selenium.By;

public class LoginPage extends BaseSetup {

    By registerCustomerLink = By.cssSelector("a[routerlink*='register']");

    public RegisterCustomerPage navigateToCustomerRegistration(){
        driver.findElement(registerCustomerLink).click();
        return new RegisterCustomerPage();
    }


}
