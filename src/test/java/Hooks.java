import drivers.DriverPage;
import org.junit.After;
import org.junit.Before;

public class Hooks
{
    DriverPage driverBase = new DriverPage();

    @cucumber.api.java.Before
    public void projectSetup() {

        driverBase.browser();
        driverBase.navigateTo("https://www.betfair.com/");
        driverBase.maximizeScreen();
        driverBase.deleteCookies();
        driverBase.applyImplicitWait();
        driverBase.Actions();
    }

    @cucumber.api.java.After
    public void Teardown() {

        driverBase.closeBrowser();
    }
}
