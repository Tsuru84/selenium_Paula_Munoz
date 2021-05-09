package Practico_3_Selenium;
//**************************** Ejercicio GIT ****************************
//Ejercicio 7
//Crear una clase llamada SpotifyWithCssSelectorTest
//Crear un método llamado spotifyByPlaceHolderTest
//Ingresar al sitio: https://www.spotify.com/uy/signup/
//Completar todos los campos con Css Selector placeholder
//Crear una rama partiendo de dev llamada practico11/ejercicio7 y subir los cambios del archivo


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SpotifyWithCssSelectorTest {

    Tools goTo = new Tools();
    String FACEBOOK_URL = "https://www.spotify.com/uy/signup/";

    @Test
    public void spotifyByPlaceHolderTest() throws InterruptedException {
        WebDriver driver = goTo.getGoogleDriver();
        driver.get(FACEBOOK_URL);

        Thread.sleep(10000);
        //Click on accept cookies:
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        //Rellenar campos formulario:
        driver.findElement(By.cssSelector("*[placeholder='Introduce tu correo electrónico.']")).sendKeys("Tester1@testing.com");
        driver.findElement(By.cssSelector("*[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("Tester1@testing.com");
        driver.findElement(By.cssSelector("*[placeholder='Crea una contraseña.']")).sendKeys("holamundo");
        driver.findElement(By.cssSelector("*[placeholder='Introduce un nombre de perfil.']")).sendKeys("SuperTester");

        //Añadir fecha cumpleaños:
        driver.findElement(By.cssSelector("*[placeholder='DD']")).sendKeys("10");
        WebElement monthsDropdown = driver.findElement(By.cssSelector("*[name='month']"));
        Select birthMonth = new Select(monthsDropdown);
        birthMonth.selectByValue("01");
        driver.findElement(By.cssSelector("*[name='year']")).sendKeys("1984");

        //Seleccionar sexo:
        driver.findElement(By.cssSelector("*[for='gender_option_male']")).click();

        //Clicar opciones marketing:
        driver.findElement(By.cssSelector("*[for='marketing-opt-checkbox']")).click();
        driver.findElement(By.cssSelector("*[for='third-party-checkbox']")).click();

    }

}


