package test.mobiletest.multiplayer.features;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import static test.mobiletest.appium.utils.Constant.getPathDriver;

/**
 * Created by Vitor Cardoso
 */
public class DriverInstanceMobile {

    private static AndroidDriver driver;
    private static DesiredCapabilities capacidades;

    public static AndroidDriver instanceMobile() throws MalformedURLException {

        if (driver == null) {
            File diretorio = new File(getPathDriver());
            File app = new File(diretorio, "buraco.apk");

            capacidades = new DesiredCapabilities();
            capacidades.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            capacidades.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
            capacidades.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
            capacidades.setCapability("language", "pt-BR");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);
        }
        return driver;
    }
}
