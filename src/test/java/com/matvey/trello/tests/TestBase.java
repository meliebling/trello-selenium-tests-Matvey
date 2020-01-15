package com.matvey.trello.tests;

import com.matvey.trello.fw.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() {
        app.init();
    }


    @AfterSuite

    public void tearDown() {
        app.stop();
    }

}
