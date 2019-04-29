package espresso.screens;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

public class ThemesPage extends Page {

    public void clickFAB() {
        onView(allOf(withId(R.id.apply), isCompletelyDisplayed())).perform(click());
    }

    public void swipeTheme() {
        onView(withId(R.id.pager)).perform(swipeLeft());
    }

    public void checkThemeChangedToGray() {

    }
}
