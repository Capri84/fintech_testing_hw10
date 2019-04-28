package uiautomator.screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

public class DrawerMenuPage extends Page {

    public DrawerMenuPage(UiDevice device) {
        super(device);
    }

    public UiObject2 getTrending() {
        return getUiObject(By
                .res("com.fastaccess.github.debug:id/design_menu_item_text")
                .text("Trending"));
    }

    public UiObject2 getSettings() {
        return getUiObject(By
                .res("com.fastaccess.github.debug:id/design_menu_item_text")
                .text("Settings"));
    }

    public UiObject2 getRestorePurchases() {
        return getUiObject(By
                .res("com.fastaccess.github.debug:id/design_menu_item_text")
                .text("Restore Purchases"));
    }

    public UiObject2 getSendFeedback() {
        return getUiObject(By
                .res("com.fastaccess.github.debug:id/design_menu_item_text")
                .text("Send feedback"));
    }

    public UiObject2 getAbout() {
        return getUiObject(By.text("About"));
    }

    public void scrollDrawerMenu(String menuItem) {
        UiScrollable drawer = new UiScrollable(new UiSelector()
                .className("android.support.v7.widget.RecyclerView"));
        try {
            drawer.scrollTextIntoView(menuItem);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }
}
