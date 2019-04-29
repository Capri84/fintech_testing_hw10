package espresso.screens;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class DescriptionPage extends Page {

    public void checkDeviceInfo() {
        //   onView(withId(R.id.editText)).check(matches(Build.MANUFACTURER));
    }

    public void clickSumbitBtn() {
        onView(withId(R.id.submit)).perform(click());
    }
}
