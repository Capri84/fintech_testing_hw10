package uiautomator.screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

public class MainFeedPage extends Page {

    public MainFeedPage(UiDevice device) {
        super(device);
    }

    public UiObject2 getHamburgerButton() {
        return getToolbar().findObject(By.clazz("android.widget.ImageButton"));
    }

    private UiObject2 getToolbar() {
        return getUiObject(By.res("com.fastaccess.github.debug:id/toolbar"));
    }
}
