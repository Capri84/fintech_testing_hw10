package espresso.tests;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import espresso.base.BaseRunner;
import espresso.screens.DescriptionPage;
import espresso.screens.DrawerMenuPage;
import espresso.screens.MainFeedPage;
import espresso.screens.SettingsPage;
import espresso.screens.SubmitFeedbackPage;
import espresso.screens.ThemesPage;
import espresso.screens.TrendingPage;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FastHubTestsEspresso extends BaseRunner {

    @Test
    public void trendingTest() {
        MainFeedPage mainFeedPage = new MainFeedPage();
        mainFeedPage.openDrawer();
        DrawerMenuPage drawerMenuPage = new DrawerMenuPage();
        drawerMenuPage.clickTrending();
        TrendingPage trendingPage = new TrendingPage();
        trendingPage.checkTrending();
    }

    @Test
    public void themeTest() {
        MainFeedPage mainFeedPage = new MainFeedPage();
        mainFeedPage.openDrawer();
        DrawerMenuPage drawerMenuPage = new DrawerMenuPage();
        drawerMenuPage.clickSettings();
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.clickTheme();
        ThemesPage themesPage = new ThemesPage();
        themesPage.swipeTheme();
        themesPage.clickFAB();
        themesPage.checkThemeChangedToGray();
    }

    @Test
    public void restorePurchasesTest() {
        MainFeedPage mainFeedPage = new MainFeedPage();
        mainFeedPage.openDrawer();
        DrawerMenuPage drawerMenuPage = new DrawerMenuPage();
        drawerMenuPage.swipeUpDrawer();
        drawerMenuPage.intentsInit();
        drawerMenuPage.clickRestorePurchases();
        mainFeedPage.checkIntent();
        mainFeedPage.intentsRelease();
    }

    @Test
    public void toastTest() {
        MainFeedPage mainFeedPage = new MainFeedPage();
        mainFeedPage.openDrawer();
        DrawerMenuPage drawerMenuPage = new DrawerMenuPage();
        drawerMenuPage.swipeUpDrawer();
        drawerMenuPage.clickSendFeedback();
        SubmitFeedbackPage submitFeedbackPage = new SubmitFeedbackPage();
        submitFeedbackPage.clickOk();
        submitFeedbackPage.setTitle();
        submitFeedbackPage.clickDescription();
        DescriptionPage descriptionPage = new DescriptionPage();
        descriptionPage.checkDeviceInfo();
        descriptionPage.clickSumbitBtn();
        submitFeedbackPage.clickFAB();
        //check Toast
    }

    @Test
    public void aboutTest() {
        MainFeedPage mainFeedPage = new MainFeedPage();
        mainFeedPage.openDrawer();
        DrawerMenuPage drawerMenuPage = new DrawerMenuPage();
        drawerMenuPage.swipeUpDrawer();
        drawerMenuPage.clickAbout();
        //scroll
        //Changelog + Drawable
        //onView(allOf(withId(R.id.mal_list_card_title), withText("About"))).perform(scrollTo());
        //onData(withId(R.id.mal_card_recyclerview));
    }
}
