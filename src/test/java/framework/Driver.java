package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public abstract class Driver {          //abstract because we dont want any class to instantiate it
//
//    protected static WebDriver driver;    //static because we want only 1 instance of it
//
//    public static WebDriver getDriver() {

//        if (driver == null) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();

//        }
//        return driver;
//
//    }
//}

//Singleton Design Pattern
public class Driver {          //abstract because we dont want any class to instantiate it

    private static WebDriver driver;    //static because we want only 1 instance of it

    private Driver(WebDriver driver){
        this.driver = driver;
    }

    public static Driver getDriverInstance() {
        if (driver == null) {
//            WebDriverManager.chromedriver().setup();      //1st pass
//            WebDriver webDriver = new ChromeDriver();

            BrowserType browserType;
            String browser = System.getProperty("browser");  // mvn test -Dbrowser=CHROME
            if(browser != null)
                browserType  = BrowserType.valueOf(browser);  //converts String to enum type
            else
                browserType = BrowserType.CHROME;

            WebDriver driver = DriverFactory.createDriver(browserType);    //Factory design pattern
            return new Driver(driver);

        } else {
            return new Driver(driver);

        }
    }

    public WebDriver getDriver(){
            return driver;
        }
}
