package tests;

import org.junit.Test;

import screens.DrawerMenuPage;
import screens.MainFeedPage;
import screens.TrendingPage;

import static org.junit.Assert.assertEquals;

    public class TrendingTest extends BaseRunner {

    @Test
    public void testTrending() {
        MainFeedPage mainFeedPage = app.mainFeedPage;
//      mainFeedPage.getHamburgerButton().click();
        mainFeedPage.openDrawerMenu();
        DrawerMenuPage drawerMenuPage = app.drawerMenuPage;
        drawerMenuPage.getTrending().click();
        TrendingPage trendingPage = app.trendingPage;
        trendingPage.getActivityTitle();
        assertEquals("Trending", trendingPage.getActivityTitle().getText());
    }
}
