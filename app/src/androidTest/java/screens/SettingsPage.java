package screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

public class SettingsPage extends Page {

    private BySelector themeSelector() {
        return By.res("com.fastaccess.github.debug:id/iconItemTitle");
    }

    public SettingsPage(UiDevice device) {
        super(device);
    }

    public UiObject2 getTheme() {
        return getUiObject(themeSelector());
    }
}
