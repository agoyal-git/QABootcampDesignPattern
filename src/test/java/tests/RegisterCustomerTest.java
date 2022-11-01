package tests;

import framework.builders.CustomerRegistrationDetailsBuilder;
import framework.BaseSetup;
import models.CustomerRegistrationDetails;
import org.testng.annotations.Test;
import pages.HomePage;

public class RegisterCustomerTest extends BaseSetup {



//    @BeforeClass
//    public void setUpChromeDriver(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }


//    @Test
//    public void registerCustomer() throws InterruptedException {
//       new HomePage().navigateToHomePage().navigateToLoginPage().navigateToCustomerRegistration().registerCustomer();
//
//    }

    @Test
    public void registerCustomerWithDetails() throws InterruptedException {
        //Builder design pattern
        CustomerRegistrationDetails customerDetails = new CustomerRegistrationDetailsBuilder().setEmail("abc2@gmail.com").setPassword("pass234").build();
        new HomePage().navigateToHomePage().navigateToLoginPage().navigateToCustomerRegistration().registerCustomerWithDetails(customerDetails);

    }




}
