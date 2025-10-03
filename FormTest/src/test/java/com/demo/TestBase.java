package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\eclipse-workspace\\FormTest\\drivers\\EdgeDriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}