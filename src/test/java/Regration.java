import Pageobject.Homepage;
import Pageobject.PlaceBet;
import Pageobject.SportsPage;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Regration {
    Homepage homepage=new Homepage();
    SportsPage sportsPage=new SportsPage();
    PlaceBet placeBet= new PlaceBet();
    String ActualTitle;


    @Test
    public void xyzTest(){
        homepage.iAMOnHomePage();
        //homepage.hooverONMain("cricket");
        homepage.hooverOnMainCentral("Cricket");
        //sportsPage.windowsHandle();
        sportsPage.selectFromUpdatedSports("Test Matches");
        sportsPage.selectMatch("Australia");
        placeBet.selectionBets("4/1");
        placeBet.placebettingPrice("10","Place Bets");
        //placeBet.clickOnJoin("Join Now");
        placeBet.clickOnJoinNow();
        ActualTitle=sportsPage.windowsHandle();
        assertThat(ActualTitle,is (containsString ("Register for a Betfair Account")));


    }
}
