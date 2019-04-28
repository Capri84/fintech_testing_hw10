package uiautomator.screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AboutPage extends Page {

    public AboutPage(UiDevice device) {
        super(device);
    }

    private List<UiObject2> getAboutList() {
        return device.findObjects(By
                .res("com.fastaccess.github.debug:id/mal_card_recyclerview"));
    }

    public void scrollScreen(String menuItem) {
        UiScrollable drawer = new UiScrollable(new UiSelector()
                .resourceId("com.fastaccess.github.debug:id/mal_list_card_title"));
        try {
            drawer.scrollTextIntoView(menuItem);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }

    private UiObject2 getSecondChild() {
        return getAboutList().get(1).findObject(By.text("Changelog"));
    }

    public void checkSecondPosText() {
        assertEquals("Changelog", getSecondChild().getText());
    }
}
