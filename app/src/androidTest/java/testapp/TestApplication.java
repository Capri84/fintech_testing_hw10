package testapp;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.Until;

import java.util.Objects;

import screens.AboutPage;
import screens.DescriptionPage;
import screens.DrawerMenuPage;
import screens.MainFeedPage;
import screens.SettingsPage;
import screens.SubmitFeedbackPage;
import screens.ThemesPage;
import screens.TrendingPage;

public class TestApplication {

    private static final int LAUNCH_TIMEOUT = 5000;
    public AboutPage aboutPage;
    public MainFeedPage mainFeedPage;
    public DrawerMenuPage drawerMenuPage;
    public TrendingPage trendingPage;
    public SettingsPage settingsPage;
    public ThemesPage themesPage;
    public SubmitFeedbackPage submitFeedbackPage;
    public DescriptionPage descriptionPage;
    private UiDevice device;

    public TestApplication() {
        // Connect to device
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();

        // Get launch intent
        String packageName = InstrumentationRegistry.getTargetContext().getPackageName();
        Context context = InstrumentationRegistry.getContext();
        Intent intent = Objects.requireNonNull(context.getPackageManager()
                .getLaunchIntentForPackage(packageName))
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

        // Start application
        context.startActivity(intent);
        device.wait(Until.hasObject(By.pkg(packageName).depth(0)), LAUNCH_TIMEOUT);

        // Screens
        mainFeedPage = new MainFeedPage(device);
        drawerMenuPage = new DrawerMenuPage(device);
        trendingPage = new TrendingPage(device);
        settingsPage = new SettingsPage(device);
        themesPage = new ThemesPage(device);
        aboutPage = new AboutPage(device);
        submitFeedbackPage = new SubmitFeedbackPage(device);
        descriptionPage = new DescriptionPage(device);
    }

    public void close() {
        device.pressHome();
        device = null;
    }
}
