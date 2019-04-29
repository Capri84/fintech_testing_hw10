package espresso.screens;

import android.support.test.espresso.intent.Intents;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeUp;

public class DrawerMenuPage extends Page {

    public void clickTrending() {
        getDrawerItem("Trending").perform(click());
    }

    public void clickSettings() {
        getDrawerItem("Settings").perform(click());
    }

    public void clickRestorePurchases() {
        getDrawerItem("Restore Purchases").perform(click());
    }

    public void clickSendFeedback() {
        getDrawerItem("Send feedback").perform(click());
    }

    public void clickAbout() {
        getDrawerItem("About").perform(click());
    }

    public void swipeUpDrawer() {
        getNavigationMenu().perform(swipeUp());
    }

    public void intentsInit() {
        Intents.init();
    }

}
