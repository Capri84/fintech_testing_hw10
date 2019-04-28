package uiautomator.tests;

import org.junit.After;
import org.junit.Before;

import uiautomator.testapp.TestApplication;

public class BaseRunner {

    TestApplication app;

    @Before
    public void setUp() {
        app = new TestApplication();
    }

    @After
    public void tearDown() {
        app.close();
    }
}
