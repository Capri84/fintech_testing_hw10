package espresso.screens;

import static android.support.test.espresso.intent.Intents.release;

public class MainFeedPage extends Page {

    public void openDrawer() {
        getDrawer().perform(open());
    }

    public void intentsRelease() {
        release();
    }
}
