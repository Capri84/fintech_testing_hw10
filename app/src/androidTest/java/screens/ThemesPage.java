package screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.Direction;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;

public class ThemesPage extends Page {

    private BySelector themeSelector() {
        return By.res("com.fastaccess.github.debug:id/coordinatorLayout");
    }

    private BySelector fabSelector() {
        return By.res("com.fastaccess.github.debug:id/apply");
    }

    public ThemesPage(UiDevice device) {
        super(device);
    }

    public UiObject2 getFAB() {
        return getUiObject(fabSelector());
    }

    public void swipeTheme() {
        UiObject2 firstTheme = getUiObject(themeSelector());
        firstTheme.swipe(Direction.LEFT, 0.3f);
        device.wait(Until.hasObject(themeSelector()), 5000);
    }
}
