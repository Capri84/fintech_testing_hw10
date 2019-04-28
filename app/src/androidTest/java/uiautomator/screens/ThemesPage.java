package uiautomator.screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Direction;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;

import static org.junit.Assert.assertTrue;

public class ThemesPage extends Page {

    public ThemesPage(UiDevice device) {
        super(device);
    }

    public UiObject2 getFAB() {
        return getUiObject(By.res("com.fastaccess.github.debug:id/apply"));
    }

    public void swipeTheme() {
        UiObject2 firstTheme = getUiObject(By
                .res("com.fastaccess.github.debug:id/pager"));
        firstTheme.swipe(Direction.LEFT, 0.4f);
        device.wait(Until.hasObject(By
                .res("com.fastaccess.github.debug:id/coordinatorLayout")), 5000);
    }

    public void checkThemeChangedToGray() {
        UiObject secondTheme = device.findObject(new UiSelector()
                .className("android.support.v4.view.ViewPager").instance(1));
        assertTrue(secondTheme.exists());
    }
}
