package screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.Direction;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;

import com.fastaccess.R;

public class MainFeedPage extends Page {

 /*   private BySelector hamburgerButtonSelector() {
        return By
                .pkg("com.fastaccess.github.debug")
                .clazz("android.widget.ImageButton")
                .descContains("Navigate up");
}*/

    private BySelector drawerSelector() {
        return By.res("com.fastaccess.github.debug:id/mainNav");
    }

    private BySelector recyclerSelector() {
        return By.res("com.fastaccess.github.debug:id/recycler");
    }

    public MainFeedPage(UiDevice device) {
        super(device);
    }

/*    public UiObject2 getHamburgerButton() {
        return getUiObject(hamburgerButtonSelector());
    }*/

    public void openDrawerMenu() {
        UiObject2 recycler = getUiObject(recyclerSelector());
        recycler.swipe(Direction.RIGHT, 0.3f);
        device.wait(Until.hasObject(drawerSelector()), 10000);
    }
}
