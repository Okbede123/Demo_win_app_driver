package demowinium;


import io.appium.java_client.windows.WindowsDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoWindowApp {



    WindowsDriver driver;


    @BeforeClass
    public void beforeMethod() throws MalformedURLException {
        DesiredCapabilities d   = new DesiredCapabilities();
//        d.setCapability("platformName","Windows");
//        d.setCapability("deviceName","WindowsPC");
//        d.setCapability("platformVersion","10");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        d.setCapability("app","C:\\Users\\Admin\\AppData\\Local\\GitHubDesktop\\GitHubDesktop.exe");
        try {
            driver = new WindowsDriver(url,d);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void TC_01(){
        driver.findElement(By.xpath("//Group[@AutomationId='app-menu-&File']")).click();
    }

    public void CHeckSomeMethod(){
        System.out.println(driver.getCurrentUrl() + " get current url");
        System.out.println(driver.getPageSource() + "get page source");
        System.out.println(driver.getTitle() + " get title");
        System.out.println(driver.getSettings() + " get setting");
    }

    @AfterClass
    public void after(){
        driver.quit();
    }
}
