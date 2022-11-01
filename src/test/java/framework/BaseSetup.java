package framework;

import framework.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseSetup {

    protected static WebDriver driver;


    @BeforeTest
    public void createDriver(){
//        WebDriverManager.chromedriver().setup();    1st pass
//        driver = new ChromeDriver();
        
//        driver = Driver.getDriver();               2nd pass


        driver = Driver.getDriverInstance().getDriver();    // 3rd pass

    }

    @AfterTest
    public void quitDriver(){
        driver.quit();
    }

}
