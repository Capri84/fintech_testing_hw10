package tests;

import org.junit.Test;

import screens.DrawerMenuPage;
import screens.MainFeedPage;
import screens.SettingsPage;
import screens.ThemesPage;

public class ThemeTest extends BaseRunner {

@Test
public void testTheme() {
    MainFeedPage mainFeedPage = app.mainFeedPage;
//        mainFeedPage.getHamburgerButton().click();
    mainFeedPage.openDrawerMenu();
    DrawerMenuPage drawerMenuPage = app.drawerMenuPage;
    drawerMenuPage.getSettings().click();
    SettingsPage settingsPage = app.settingsPage;
    settingsPage.getTheme().click();
    ThemesPage themesPage = app.themesPage;
    themesPage.swipeTheme();
    themesPage.getFAB().click();
//    assertEquals();
    }
}
