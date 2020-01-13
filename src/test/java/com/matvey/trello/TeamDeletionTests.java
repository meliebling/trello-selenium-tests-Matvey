package com.matvey.trello;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamDeletionTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if (!app.isAvatarPresent()) {
            app.trelloLoginButton();
            app.fillLoginForm("meliebling@gmail.com", "7Ig%20K8");
            app.pause(5000);

        }
    }

    @Test
    public void testDeleteLastTeam() throws InterruptedException {
        app.createTeamFromMainPage();
        app.deleteLastTeam();

    }

    @AfterClass
    public void postActions() throws InterruptedException {
        int teamsCount = app.getTeamsCount();
        if(teamsCount>2){
            app.deleteLastTeam();
        }
    }

    }

