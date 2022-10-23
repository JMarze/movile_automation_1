package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

    public class AndroidCloud implements IDevice {
        @Override
        public AppiumDriver create() {

            DesiredCapabilities caps = new DesiredCapabilities();

            // Set your access credentials
            caps.setCapability("browserstack.user", "claudiasally_BvMGZD");
            caps.setCapability("browserstack.key", "xgkEp2MfyNDbLxMByiWx");

            // Set URL of the application under test
            caps.setCapability("app", "bs://21bcccce32e35452b04704387388f1b275476de5");

            // Specify device and os_version for testing
            caps.setCapability("device", "Google Pixel 3");
            caps.setCapability("os_version", "9.0");

            // Set other BrowserStack capabilities
            caps.setCapability("project", "catolica");
            caps.setCapability("build", "1.0");
            caps.setCapability("name", "WhenDO");


            // Initialise the remote Webdriver using BrowserStack remote URL
            // and desired capabilities defined above
            AndroidDriver<AndroidElement> driver;
            try {
                driver = new AndroidDriver<AndroidElement>(
                        new URL("http://hub.browserstack.com/wd/hub"), caps);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            // Write your test case statements here
            // Invoke driver.quit() after the test is done to indicate that the test is completed.
            return driver;
        }
}
