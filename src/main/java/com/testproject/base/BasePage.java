package com.testproject.base;

import com.testproject.utils.Driver;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class BasePage <T extends BasePage<T>> extends Page {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public boolean urlContains(String url) {
        boolean contains;
        contains = Driver.get().getCurrentUrl().contains(url);
        return contains;
    }

    public boolean isDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(10));
        return wait.until((ExpectedCondition<Boolean>) wd -> element.isDisplayed());
    }

    public static void switchToWindow(String targetTitle) {
        String origin = Driver.get().getWindowHandle();
        for (String handle : Driver.get().getWindowHandles()) {
            Driver.get().switchTo().window(handle);
            if (Driver.get().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.get().switchTo().window(origin);
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeToWaitSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor)Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static WebElement waitToBeClickable(WebElement element, int timeToWaitSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeToWaitSec));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemText = new ArrayList<>();
        for (WebElement el : list) {
            elemText.add(el.getText());
        }
        return elemText;
    }

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String DatePicker() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }

    public static void takeScreenShot() throws IOException {
        String path;
        WebDriver augmentedDriver = new Augmenter().augment(Driver.get());
        File source = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
        path = "./target/screenshots/" + source.getName();
        FileUtils.copyFile(source, new File(path));

    }

}
