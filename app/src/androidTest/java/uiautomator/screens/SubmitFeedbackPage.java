package uiautomator.screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

public class SubmitFeedbackPage extends Page {

    public SubmitFeedbackPage(UiDevice device) {
        super(device);
    }

    public UiObject2 getOK() {
        return getUiObject(By.res("android:id/button1"));
    }

    private UiObject2 getTitle() {
        return getUiObject(By.clazz("android.widget.EditText"));
    }

    public void setTitleText() {
        getTitle().setText("hello");
    }

    public UiObject2 getDescription() {
        return getUiObject(By.res("com.fastaccess.github.debug:id/description"));
    }

    public UiObject2 getFAB() {
        return getUiObject(By.res("com.fastaccess.github.debug:id/submit"));
    }
}
