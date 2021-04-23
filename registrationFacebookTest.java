package Practico_2_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class registrationFacebookTest {
    Ejercicio2 GoogleDriver = new Ejercicio2();
    
    @Test
    public void fullRegistrationTest() throws InterruptedException {
        WebDriver driver = GoogleDriver.getGoogleDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);

        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(5000);

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("John");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Smith");

        WebElement mobile = driver.findElement(By.name("reg_email__"));
        mobile.sendKeys("5555555");

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("123456789");

        WebElement day = driver.findElement(By.name("birthday_day"));
        Select comboDay = new Select(day);
        comboDay.selectByVisibleText("26");

        WebElement month = driver.findElement(By.name("birthday_month"));
        Select comboMonth = new Select(month);
        comboMonth.selectByVisibleText("Jun");

        WebElement year = driver.findElement(By.name("birthday_year"));
        Select comboYear = new Select(year);
        comboYear.selectByVisibleText("1980");

        List<WebElement> genderList = driver.findElements(By.name("sex"));

        genderList.get(1).click();

    }


}

