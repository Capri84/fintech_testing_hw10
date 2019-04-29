package espresso.screens;

import android.support.test.espresso.ViewInteraction;

import com.fastaccess.R;
import com.fastaccess.ui.modules.main.donation.CheckPurchaseActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

class Page {

    ViewInteraction getDrawer() {
        return onView(withId(R.id.drawer));
    }

    ViewInteraction getDrawerItem(String itemName) {
        return onView(allOf(withId(R.id.design_menu_item_text), withText(itemName)));
    }

    ViewInteraction getNavigationMenu() {
        return onView(withId(R.id.mainNav));
    }

    public void checkIntent() {
        intended(hasComponent(CheckPurchaseActivity.class.getName()));
    }
}
