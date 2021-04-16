import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicio14 {
    //Subir este ejercicio en a github en una rama nueva llamada selenium/ejercicio1.
    //Crear una pull request y agregar a seleniumcurso como revisor.
    //Crear un método con un nombre a seleccionar
    //Acceder a Netflix: https://www.netflix.com/uy/
    //Mostrar los elementos h1 y h2 que hay en el sitio
    //Refrescar la página
    //Mostrar el texto de los botones que se encuentran en la página
    //Mostrar la cantidad de elementos div que contiene el sitio
    //Obtener y mostrar el título de la página
    //Mostrar la cantidad de elementos de tipos link

    @Test
    public void netflixTest(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/uy/");

        List <WebElement> ListaH1s = driver.findElements(By.tagName("h1"));
        System.out.println("La página contiene " + ListaH1s.size()+ " elementos de tipo H1:");
        for (WebElement h1 : ListaH1s){
            System.out.println(" H1 -->" + h1.getText());
        }
        List <WebElement> ListaH2s = driver.findElements(By.tagName("h2"));
        System.out.println("La página contiene " + ListaH2s.size()+ " elementos de tipo H2:");
        for (WebElement h2 : ListaH2s){
            System.out.println(" H2 -->" + h2.getText());
        }
        driver.navigate().refresh();

        List <WebElement> ListaBotones = driver.findElements(By.tagName("button"));
        for (WebElement btn : ListaBotones){
            System.out.println("Botón -->" + btn.getText());
        }
        List<WebElement> ListaDiv = driver.findElements(By.tagName("div"));
        System.out.println("La página contiene " +ListaDiv.size() +" elementos de tipo Div.");

        String titulo = driver.getTitle();
        System.out.println("El titulo de la página es " + titulo);

        List <WebElement> ListaLinks = driver.findElements(By.tagName("a"));
        System.out.println("La página contiene un total de " + ListaLinks.size()+ " elementos de tipo Link.");

    }
}
