package espresso.screens;

import android.support.v7.widget.AppCompatTextView;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class TrendingPage extends Page {

    public void checkTrending() {
        onView(allOf(withParent(withId(R.id.toolbar)), isAssignableFrom(AppCompatTextView.class)))
                .check(matches(withText("Trending")));
    }
}
