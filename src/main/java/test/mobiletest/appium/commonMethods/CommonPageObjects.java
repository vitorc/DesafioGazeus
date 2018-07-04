package test.mobiletest.appium.commonMethods;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by Vitor Cardoso
 */
public class CommonPageObjects {

    private static WebDriver driver;

    public CommonPageObjects(WebDriver driver) {

        this.driver = driver;

    }



    public void fluentWaitElementoByCss(String locator) {

        fluentWait(driver.findElement(By.cssSelector(locator)));

    }

    public void fluentWaitElementoById(String locator) {

        fluentWait(driver.findElement(By.id(locator)));

    }

    public void fluentWaitElementoByXpath(String locator) {

        fluentWait(driver.findElement(By.xpath(locator)));

    }

    private WebElement fluentWait(WebElement button) {

        new FluentWait<WebElement>(button)
                .withTimeout(180, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class)
                .until(new Function<WebElement, Boolean>() {
                    public Boolean apply(WebElement w) {
                        return w.isDisplayed();
                    }
                });
        return button;
    }

    public void aguardarElementoByXpath(String locator) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By

                .xpath(locator)));
    }

    public void aguardarElementoById(String locator) {

        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.presenceOfElementLocated(By

                .id(locator)));
    }

    public void aguardarElementoByCssSelector(String locator) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By

                .cssSelector(locator)));
    }
}
