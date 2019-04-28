package uiautomator.screens;

import android.os.Build;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

import static org.junit.Assert.assertTrue;

public class DescriptionPage extends Page {

    public DescriptionPage(UiDevice device) {
        super(device);
    }

    private UiObject2 getDeviceInfo() {
        return getUiObject(By.res("com.fastaccess.github.debug:id/editText"));
    }

    public void checkDeviceInfo() {
        assertTrue(getDeviceInfo().getText().contains(Build.MANUFACTURER));
    }

    public UiObject2 getSumbitBtn() {
        return getUiObject(By.res("com.fastaccess.github.debug:id/submit"));
    }
}
