import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contacto2 {
    private WebDriver driver;

    @Before
    public void setUp() {
        //inicializamos el webdriver para chrome
        driver = new ChromeDriver();
        //maximizamos la pantalla del navegador chrome
        driver.manage().window().maximize();
        //Borramos la Caché
        driver.manage().deleteAllCookies();
        //abrimos la página de sesión
        driver.get("https://testingqarvn.com.es/contacto-2/");
    }

    @Test
    public void TestTutorial() throws InterruptedException {

        //************************************************************************************************
        //INPUTS
        WebElement no = driver.findElement(By.name("field_110"));
        if (no.getAttribute("required") != null) {
            System.out.println("El campo de nombre es requerido.");
            //Encuentra el campo de nombre y lo completa
            driver.findElement(By.name("field_110")).sendKeys("Dante");
        } else {
            System.out.println("El campo de nombre no es requerido.");
        }

        WebElement ap = driver.findElement(By.name("field_111"));
        if (ap.getAttribute("required") != null) {
            System.out.println("El campo de apellido es requerido.");
            //Encuentra el campo de apellido y lo completa
            driver.findElement(By.name("field_111")).sendKeys("Fontana");
        } else {
            System.out.println("El campo de apellido no es requerido.");
        }

        WebElement em = driver.findElement(By.name("field_112"));
        if (em.getAttribute("required") != null) {
            System.out.println("El campo de email es requerido.");
            //Encuentra el campo de email y lo completa
            driver.findElement(By.name("field_112")).sendKeys("maurifl@gmail.com");
        } else {
            System.out.println("El campo de email no es requerido.");
        }

        WebElement te = driver.findElement(By.name("field_113"));
        if (te.getAttribute("required") != null) {
            System.out.println("El campo de teléfono es requerido.");
            //Encuentra el campo de teléfono y lo completa
            driver.findElement(By.name("field_113")).sendKeys("2645152222");
        } else {
            System.out.println("El campo de teléfono no es requerido.");
        }

        //Encuentra el campo de consulta y lo completa
        WebElement co = driver.findElement(By.name("field_114"));
        if (co.getAttribute("required") != null) {
            System.out.println("El campo de consulta es requerido.");
            //Encuentra el campo de consulta y lo completa
            driver.findElement(By.name("field_114")).sendKeys("prueba de testeo.");
        } else {
            System.out.println("El campo de consulta no es requerido.");
        }

        //************************************************************************************************
        //Encuentra el checkbox y completa
        WebElement req = driver.findElement(By.name("field_115[]"));
        if (req.getAttribute("required") != null) {
            System.out.println("El campo de checkbox es requerido.");
            WebElement ch = driver.findElement(By.id("wsf-1-label-115-row-1"));
            Thread.sleep(500);
            ch.click();
        } else {
            System.out.println("El campo de checkbox no es requerido.");
        }

        //************************************************************************************************
        //BUTTON
        //Hace click en el botón de envío
        driver.findElement(By.name("field_116")).click();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}