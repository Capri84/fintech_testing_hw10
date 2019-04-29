package espresso.matchers;

import android.graphics.drawable.ColorDrawable;
import android.support.test.espresso.intent.Checks;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.view.View;

import org.hamcrest.Description;
import org.hamcrest.Matcher;

import it.sephiroth.android.library.bottomnavigation.BottomNavigation;

public class BackgroundColorMatcher {

    public static Matcher<View> withBgColor(final int initThemeColor) {
        Checks.checkNotNull(initThemeColor);
        return new BoundedMatcher<View, BottomNavigation>(BottomNavigation.class) {
            @Override
            public boolean matchesSafely(BottomNavigation navigation) {
                return initThemeColor == ((ColorDrawable) navigation.getBackground()).getColor();
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("with background color: ");
            }
        };
    }
}