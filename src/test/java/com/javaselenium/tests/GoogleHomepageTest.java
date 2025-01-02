package com.javaselenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GoogleHomepageTest {
    private WebDriver driver;
    private static final Logger logger = LogManager.getLogger(GoogleHomepageTest.class);

    @BeforeMethod
    public void setUp() {
        // Set the path to the ChromeDriver executable
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleHomepage() {
        logger.info("Test started: testGoogleHomepage");

        logger.info("Navigating to Google...");
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        logger.info("Page Title: " + title);

        Assert.assertEquals(title, "Google", "Title does not match!");

        logger.info("Test finished: testGoogleHomepage");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
