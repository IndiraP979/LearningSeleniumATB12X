package com.thetestingacademy.ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01

{

    @Test
    public void test_Code()
    {
        Assert.assertEquals("indira","Indira");
    }

    @Test
    public void test_OpenVWOLoginPage()
    {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");

    }
}
