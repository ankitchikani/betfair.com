package Pageobject;

import drivers.DriverPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class PlaceBet extends DriverPage {

    public void selectionBets(String bettingValue) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> matches = driver.findElements(By.cssSelector(".com-bet-button"));
        for (WebElement element : matches) {
            System.out.println(element.getText());
            if (element.getText().equalsIgnoreCase(bettingValue)) {
                element.click();
                break;
            }
        }
    }

    public void placebettingPrice(String betPrice, String SelectionControl) {
        driver.findElement(By.cssSelector(".stake")).sendKeys(betPrice);
        List<WebElement> Control = driver.findElements(By.cssSelector(".controls>div"));
        for (WebElement element : Control) {
            System.out.println(element.getText() + " ");
            if (element.getText().contains(SelectionControl)) {
                element.click();
                break;
            }
        }

    }

    public void clickOnJoin(String JoinOrLogin) {
        List<WebElement> Control = driver.findElements(By.cssSelector(".yui3-widget-body>div"));
        for (WebElement element : Control) {
            System.out.println(element.getText() + " ");
            if (element.getText().equalsIgnoreCase(JoinOrLogin)) {
                new Actions(driver).moveToElement(element).click().build().perform();
                break;
            }
        }

    }

    public void clickOnJoinNow() {
        driver.findElement(By.cssSelector(".yui3-widget-body>div>a")).click();
    }


}
