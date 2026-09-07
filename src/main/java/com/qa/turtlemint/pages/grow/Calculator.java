package com.qa.turtlemint.pages.grow;

import com.qa.turtlemint.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Calculator extends TestBase {
    public Calculator() {

        PageFactory.initElements(driver, this);
    }


    By opengoogle = By.xpath("//span/a[@id='google-signin-button']");
    By clickemail = By.xpath("//input[@type='email']");
    By clicknext = By.xpath("//*[text()='Next']");
    By pass = By.xpath("//input[@name='Passwd']");
    By next = By.xpath("//*[text()='Next']");

    By emailgoogle = By.xpath("//input[@type=\"email\"]");

    By passworgoogle = By.xpath("//input[@type=\"password\"]");


    public void login(String email, String Pass) throws InterruptedException, AWTException {
        driver.get(prop.getProperty("uRL"));
        System.out.println("URL");
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(7000);
    }

}
