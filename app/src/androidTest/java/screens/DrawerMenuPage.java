package screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

public class DrawerMenuPage extends Page {

    private BySelector trendingSelector() {
        return By
                .res("com.fastaccess.github.debug:id/design_menu_item_text")
                .text("Trending");
    }

    private BySelector settingsSelector() {
        return By
                .res("com.fastaccess.github.debug:id/design_menu_item_text")
                .text("Settings");
    }

    public DrawerMenuPage(UiDevice device) {
        super(device);
    }

    public UiObject2 getTrending() {
        return getUiObject(trendingSelector());
    }

    public UiObject2 getSettings() {
        return getUiObject(settingsSelector());
    }

    public void scrollMenu(UiObject2 element) {
        UiScrollable drawer = new UiScrollable(new UiSelector().scrollable(true));
        UiSelector simpleMarkdownSelector = new UiSelector().resourceId("com.fastaccess.github.debug:id/design_navigation_view");
        try {
            drawer.scrollIntoView(simpleMarkdownSelector);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        try {
            device.findObject(simpleMarkdownSelector).clickAndWaitForNewWindow();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }
}
