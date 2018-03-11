package stepdef;

import Pageobject.Homepage;
import Pageobject.PlaceBet;
import Pageobject.SportsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegistrationStepdefs {
    Homepage homepage = new Homepage();
    SportsPage sportsPage = new SportsPage();
    PlaceBet placeBet = new PlaceBet();
    String ActualTitle;

    @Given("^I am homepage$")
    public void iAmHomepage() throws Throwable {
        homepage.iAMOnHomePage();
    }

    @When("^I Hoover on main and select \"([^\"]*)\"$")
    public void iHooverOnMainAndSelect(String arg0) throws Throwable {
        homepage.hooverOnMainCentral(arg0);
    }

    @And("^I select an \"([^\"]*)\"$")
    public void iSelectAn(String arg0) throws Throwable {

        sportsPage.selectFromUpdatedSports(arg0);
    }

    @And("^I select match with South Africa and  \"([^\"]*)\"$")
    public void iSelectMatchWithSouthAfricaAnd(String arg0) throws Throwable {

        sportsPage.selectMatch(arg0);
    }

    @And("^I select  \"([^\"]*)\" match odds$")
    public void iSelectMatchOdds(String arg0) throws Throwable {

        placeBet.selectionBets(arg0);
    }

    @And("^I enter £\"([^\"]*)\" bet and select to \"([^\"]*)\"$")
    public void iEnter£BetAndSelectTo(String arg0, String arg1) throws Throwable {

        placeBet.placebettingPrice(arg0, arg1);
    }

    @And("^I click on  join now$")
    public void iClickOnJoinNow() throws Throwable {

        placeBet.clickOnJoinNow();
    }

    @Then("^I should see page for \"([^\"]*)\"$")
    public void iShouldSeePageFor(String arg0) throws Throwable {
        ActualTitle = sportsPage.windowsHandle();
        assertThat(ActualTitle, is(containsString(arg0)));

    }
}
