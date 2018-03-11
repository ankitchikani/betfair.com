package Pageobject;

import drivers.DriverPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SportsPage extends DriverPage {
    public String ActualTitle;

    public void selectFromUpdatedSports(String updatedSports) {

        windowsHandle();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        List<WebElement> sports = driver.findElements(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/ul/li/a"));
        for (WebElement element : sports) {
            System.out.println(element.getText() + " ");
            if (element.getAttribute("title").contains(updatedSports)) {
                element.click();
                break;
            }
        }
    }

    public String windowsHandle() {

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        System.out.println(driver.getCurrentUrl());
        ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        return ActualTitle;
    }

    public void selectMatch(String matchName) {

        List<WebElement> matches = driver.findElements(By.cssSelector(".event-list"));
        for (WebElement element : matches) {
            System.out.println(element.getText());
            if (element.getText().endsWith(matchName)) {
                element.click();
                break;
            }
        }
    }
}
