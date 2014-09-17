package com.timetoknow;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class AdminTests extends com.timetoknow.pages.TestBase {
private boolean acceptNextAlert = true;
private StringBuffer verificationErrors = new StringBuffer () ;
@Test
public void testLogin () throws Exception {
    driver.get(baseUrl + "/admin/?ad=oo");
    driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("time.to.know");
    driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
    driver.findElement(By.xpath("//*[@id=\"login\"]/input[@type=\"submit\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"all-content\"]/div[4]/section/section[1]/section/section/section/div/a")).click();
    driver.findElement(By.xpath("//div[@id=\"showCustomizations\"]")).click();
}

private boolean isElementPresent (By by) {
try {
driver.findElement (by);
return true;
} catch (NoSuchElementException e) {
return false;
}
}

private String closeAlertAndGetItsText() {
try {
Alert alert = driver.switchTo().alert();
String alertText = alert.getText ();
if (acceptNextAlert) {
alert.accept();
} else {
alert.dismiss();
}
return alertText;
} finally {
acceptNextAlert = true;
}
}
}

