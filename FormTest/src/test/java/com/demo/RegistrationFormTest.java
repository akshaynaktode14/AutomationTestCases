package com.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationFormTest extends TestBase {

    @Test
    public void fillFormUsingExcelData() {
        String[] userData = ExcelReader.getUserData("C:\\Users\\aksha\\eclipse-workspace\\FormTest\\testdata\\data.xlsx");
        if (userData == null || userData.length == 0) {
            throw new RuntimeException("Excel data is missing or unreadable.");
        }

        driver.get("https://demo.automationtesting.in/Register.html");

        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(userData[0]);
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(userData[1]);
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys(userData[2]);
        driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(userData[3]);
        driver.findElement(By.id("firstpassword")).sendKeys(userData[4]);
        driver.findElement(By.id("secondpassword")).sendKeys(userData[4]);

        driver.findElement(By.id("submitbtn")).click();
    }

//    @Test
//    public void fillFormUsingDBData() {
//        String[] userData = DBReader.getUserDataFromDB();
//        driver.get("https://demo.automationtesting.in/Register.html");
//
//        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(userData[0]);
//        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(userData[1]);
//        driver.findElement(By.cssSelector("input[type='email']")).sendKeys(userData[2]);
//        driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(userData[3]);
//        driver.findElement(By.id("firstpassword")).sendKeys(userData[4]);
//        driver.findElement(By.id("secondpassword")).sendKeys(userData[4]);
//
//        driver.findElement(By.id("submitbtn")).click();
//    }
}