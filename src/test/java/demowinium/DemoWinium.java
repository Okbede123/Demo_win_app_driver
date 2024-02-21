//package demowinium;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.net.OlderWindowsVersionEphemeralPortDetector;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.winium.DesktopOptions;
//import org.openqa.selenium.winium.WiniumDriver;
//import org.testng.annotations.Test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class DemoWinium {
//    WebDriver driver;
//
//    @Test
//    public void TC_01() throws MalformedURLException {
//        String appPath = "C:\\Users\\Admin\\AppData\\Local\\GitHubDesktop\\GitHubDesktop.exe";
//        DesktopOptions desktopOptions = new DesktopOptions();
//        desktopOptions.setApplicationPath(appPath);
//
//        URL url = new URL("http://localhost:9999/");
//        driver = new WiniumDriver(url,desktopOptions);
//        sleepInTime(3);
//        driver.findElement(By.name("Branch")).click();
//    }
//
//
//    @Test
//    public void TC_02() throws MalformedURLException {
//        DesktopOptions desktopOptions = new DesktopOptions();
//        desktopOptions.setApplicationPath("D:\\Microsoft VS Code\\Code.exe");
//        WiniumDriver winiumDriver = new WiniumDriver(new URL("http://localhost:9999/"),desktopOptions);
//        winiumDriver.findElementByXPath("//*[@Name='File']").click();
//        winiumDriver.quit();
//
//    }
//
//
//    @Test
//    public void TC_03() throws MalformedURLException {
//        DesktopOptions desktopOptions = new DesktopOptions();
//        desktopOptions.setApplicationPath("C:\\Users\\Admin\\AppData\\Local\\GitHubDesktop\\GitHubDesktop.exe");
//        WiniumDriver winiumDriver = new WiniumDriver(new URL("http://localhost:9999/"),desktopOptions);
//        winiumDriver.findElementByXPath("//*[@AriaRole='menuitem']").click();
//        winiumDriver.quit();
//
//    }
//
//
//    public void sleepInTime(int time){
//        try {
//            Thread.sleep(time* 1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//}
