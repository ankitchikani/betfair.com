package Pageobject;

import drivers.DriverPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends DriverPage {

    public boolean iAMOnHomePage() {
        System.out.println(driver.getCurrentUrl());

        return driver.getTitle().endsWith(".com/");
    }

    public void hooverONMain(String SelectMain) {
        List<WebElement> Search = driver.findElements(By.cssSelector(".main>ul>li>a>span"));

        for (WebElement element : Search) {
            System.out.println(element.getText() + " ");
            if (element.getText().equalsIgnoreCase(SelectMain)) {
                element.click();

            }

        }
    }

    public void hooverOnMainCentral(String select) {
        driver.findElement(By.cssSelector(".cssIcon.arrowUp")).click();


        List<WebElement> Search = driver.findElements(By.cssSelector(".nav.open>ul>li>a>span"));

        for (WebElement element : Search) {
            System.out.println(element.getText() + " ");
            if (element.getText().equalsIgnoreCase(select)) {
                element.click();
            }
        }
    }

}