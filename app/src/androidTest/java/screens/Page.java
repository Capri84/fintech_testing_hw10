package screens;

import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;

class Page {

    UiDevice device;

    Page(UiDevice device) {
        this.device = device;
    }

    UiObject2 getUiObject(BySelector selector) {
        return device.wait(Until.findObject(selector), 10000);
    }
}
