package com.matvey.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
    public boolean isElementPresent(By locator){ return wd.findElements(locator).size()>0;
    }

    public void click(By selector) {
        wd.findElement(selector).click();
    }

    public void type(By selector, String text) {
        wd.findElement(selector).click();
        wd.findElement(selector).clear();
        wd.findElement(selector).sendKeys(text);
    }

    public void returnToHomePage() {
        click(By.name("house"));
        click(By.name("house"));
    }
    public boolean moreButtonPresent() {
        return isElementPresent
                (By.cssSelector(".board-menu-navigation-item-link.js-open-more"));
    }

    public void moreButton() {
        click(By.cssSelector(".board-menu-navigation-item-link.js-open-more"));
    }

    public void goBack() {
        click(By.cssSelector("[title='Go back.']"));
    }

    public void clickMenuButton() {
        click(By.cssSelector(".js-show-sidebar"));
    }

    public boolean menuButtonPresent() {
        return isElementPresent(
                (By.cssSelector(".js-show-sidebar")));
    }
    public void clickSubmit() {
        click(By.xpath("//*[@type='submit']"));
    }



}
