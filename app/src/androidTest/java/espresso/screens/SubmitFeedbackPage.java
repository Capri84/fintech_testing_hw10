package espresso.screens;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;

public class SubmitFeedbackPage extends Page {

    public void clickOk() {
        onView(withText("OK")).perform(click());
    }

    public void setTitle() {
        onView(withClassName(containsString("TextInputEditText")))
                .perform(typeText("hello"));
    }

    public void clickDescription() {
        onView(withId(R.id.description)).perform(click());
    }

    public void clickFAB() {
        onView(withId(R.id.submit)).perform(click());
    }
}
