package uiautomator.screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

public class SettingsPage extends Page {

    public SettingsPage(UiDevice device) {
        super(device);
    }

    public UiObject2 getTheme() {
        return getUiObject(By.res("com.fastaccess.github.debug:id/iconItemTitle"));
    }
}
