package pages;

import framework.BaseSetup;
import org.openqa.selenium.By;

public class HomePage extends BaseSetup {


         By welcomeBanner =  By.xpath("//button[@aria-label='Close Welcome Banner']");
         By myAccount = By.id("navbarAccount");
         By login = By.id("navbarLoginButton");



        public HomePage navigateToHomePage(){
            driver.get("http://localhost:3000/");           //Owasp juice shop
            driver.findElement(welcomeBanner).click();
            return this;
        }

        public LoginPage navigateToLoginPage(){
            driver.findElement(myAccount).click();
            driver.findElement(login).click();
            return new LoginPage();

        }

}
