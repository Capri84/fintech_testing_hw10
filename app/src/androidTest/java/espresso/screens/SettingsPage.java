package espresso.screens;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class SettingsPage extends Page {

    public void clickTheme() {
        onView(allOf(withId(R.id.iconItemTitle), withText("Theme"))).perform(click());
    }
}
