package pages;

import framework.BaseSetup;
import models.CustomerRegistrationDetails;
import org.openqa.selenium.By;

public class RegisterCustomerPage extends BaseSetup {
    By email = By.id("emailControl");
    By password = By.id("passwordControl");
    By repeatPassword = By.id("repeatPasswordControl");
    By securityQuestionDropdown = By.xpath("//mat-select[@name='securityQuestion']");
    By securityQuestionSelection = By.xpath("//span[.=' Name of your favorite pet? ']");
    By securityAnswer = By.id("securityAnswerControl");
    By register = By.id("registerButton");

    private By givenSecurityQuestionSelection(String securityQuestion){
        return By.xpath("//span[.='"+ securityQuestion +"']");
    }

    public LoginPage registerCustomer() throws InterruptedException {
        driver.findElement(email).sendKeys("abc@gmail.com");   //make enail random
        driver.findElement(password).sendKeys("password");
        driver.findElement(repeatPassword).sendKeys("password");
        driver.findElement(securityQuestionDropdown).click();
        Thread.sleep(2000);
        driver.findElement(securityQuestionSelection).click();
        driver.findElement(securityAnswer).sendKeys("Zouzu");

        driver.findElement(register).click();
        return new LoginPage();
    }

    public LoginPage registerCustomerWithDetails(CustomerRegistrationDetails customerRegisterationDetails) throws InterruptedException {
        driver.findElement(email).sendKeys(customerRegisterationDetails.email);
        driver.findElement(password).sendKeys(customerRegisterationDetails.password);
        driver.findElement(repeatPassword).sendKeys(customerRegisterationDetails.password);
        driver.findElement(securityQuestionDropdown).click();
        Thread.sleep(2000);
        driver.findElement(givenSecurityQuestionSelection(customerRegisterationDetails.securityQuestion)).click();
        driver.findElement(securityAnswer).sendKeys(customerRegisterationDetails.securityAnswer);

        driver.findElement(register).click();
        return new LoginPage();
    }
}
