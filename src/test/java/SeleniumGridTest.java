import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class SeleniumGridTest {
    @Test
    public void Demofunc() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        //initilize chromeOptions
        chromeOptions.setCapability("browserName", "chrome");
        //Define on which browser you want to execute your tests.
        chromeOptions.setCapability("platformName","LINUX");
        //Define the platform on which you will execute your tests
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.105:4444/wd/hub"), chromeOptions);
        //URL to the hub running on your local system
        driver.get("http://www.google.com");
        //URL to hit
        driver.quit();
        //Close the browser
    }

}
