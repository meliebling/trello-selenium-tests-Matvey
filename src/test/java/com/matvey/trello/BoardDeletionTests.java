package com.matvey.trello;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if (!app.isAvatarPresent()) {
            app.trelloLoginButton();
            app.fillLoginForm("meliebling@gmail.com", "7Ig%20K8");
            app.pause(5000);

        }
    }

    @Test
    public void testDeleteLastBoard() throws InterruptedException {
        app.createBoardFromMainPage();
        app.deleteLastBoard();
    }

    @AfterClass
    public void postActions() throws InterruptedException {
        int boardsCount = app.getBoardsCount();
        if(boardsCount>4){
            app.deleteLastBoard();
        }
}

}


