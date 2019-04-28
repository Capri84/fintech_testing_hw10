package uiautomator.tests;

import android.support.test.uiautomator.Until;

import org.junit.Test;

import uiautomator.screens.AboutPage;
import uiautomator.screens.DescriptionPage;
import uiautomator.screens.DrawerMenuPage;
import uiautomator.screens.MainFeedPage;
import uiautomator.screens.SettingsPage;
import uiautomator.screens.SubmitFeedbackPage;
import uiautomator.screens.ThemesPage;
import uiautomator.screens.TrendingPage;

import static org.junit.Assert.assertEquals;

public class FastHubTests extends BaseRunner {

    @Test
    public void testTrending() {
        MainFeedPage mainFeedPage = app.mainFeedPage;
        mainFeedPage.getHamburgerButton().click();
        DrawerMenuPage drawerMenuPage = app.drawerMenuPage;
        drawerMenuPage.getTrending().click();
        TrendingPage trendingPage = app.trendingPage;
        trendingPage.getActivityTitle();
        assertEquals("Trending", trendingPage.getActivityTitle().getText());
    }

    @Test
    public void testTheme() {
        MainFeedPage mainFeedPage = app.mainFeedPage;
        mainFeedPage.getHamburgerButton().click();
        DrawerMenuPage drawerMenuPage = app.drawerMenuPage;
        drawerMenuPage.getSettings().click();
        SettingsPage settingsPage = app.settingsPage;
        settingsPage.getTheme().click();
        ThemesPage themesPage = app.themesPage;
        themesPage.swipeTheme();
        themesPage.getFAB().clickAndWait(Until.newWindow(), 3000);
        mainFeedPage.getHamburgerButton().click();
        drawerMenuPage.getSettings().clickAndWait(Until.newWindow(), 3000);
        settingsPage.getTheme().click();
        themesPage.checkThemeChangedToGray();
    }

    @Test
    public void testRestorePurchases() {
        MainFeedPage mainFeedPage = app.mainFeedPage;
        mainFeedPage.getHamburgerButton().click();
        DrawerMenuPage drawerMenuPage = app.drawerMenuPage;
        drawerMenuPage.scrollDrawerMenu("Restore Purchases");
        drawerMenuPage.getRestorePurchases().click();
        // Не знаю, как проверить отправку Intent-а.
    }

    @Test
    public void testToast() {
        MainFeedPage mainFeedPage = app.mainFeedPage;
        mainFeedPage.getHamburgerButton().click();
        DrawerMenuPage drawerMenuPage = app.drawerMenuPage;
        drawerMenuPage.getSendFeedback().click();
        SubmitFeedbackPage submitFeedbackPage = app.submitFeedbackPage;
        submitFeedbackPage.getOK().click();
        submitFeedbackPage.setTitleText();
        submitFeedbackPage.getDescription().click();
        DescriptionPage descriptionPage = app.descriptionPage;
        descriptionPage.checkDeviceInfo();
        descriptionPage.getSumbitBtn().clickAndWait(Until.newWindow(), 3000);
        submitFeedbackPage.getFAB().click();
    }

    @Test
    public void testAbout() {
        MainFeedPage mainFeedPage = app.mainFeedPage;
        mainFeedPage.getHamburgerButton().click();
        DrawerMenuPage drawerMenuPage = app.drawerMenuPage;
        drawerMenuPage.scrollDrawerMenu("About");
        drawerMenuPage.getAbout().clickAndWait(Until.newWindow(), 3000);
        AboutPage aboutPage = app.aboutPage;
        aboutPage.scrollScreen("About");
        aboutPage.checkSecondPosText();
        // Текст проверить можно, что и выполняет данный тест, а проверить иконку средствами
        // UiAutomator невозможно.
    }
}
