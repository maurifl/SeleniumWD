import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class entradaAlCurso {
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
        driver.get("https://testingqarvn.com.es/entrada-al-curso/");
    }
    @Test
    public void TestTutorial() throws InterruptedException {
        //************************************************************************************************
        //INPUTS
        WebElement no = driver.findElement(By.name("field_131"));
        if (no.getAttribute("disabled") == null) {
            System.out.println("El campo de nombre esta habilitado.");
            if (no.getAttribute("required") != null){
                System.out.println("El campo de nombre es requerido.");
                //Encuentra el campo de nombre y lo completa
                driver.findElement(By.name("field_131")).sendKeys("Dante");
            }else{
                System.out.println("El campo de nombre no es requerido.");
            }
        } else {
            System.out.println("El campo de nombre no esta habilitado.");
        }

        WebElement ap = driver.findElement(By.name("field_132"));
        if (ap.getAttribute("disabled") == null) {
            System.out.println("El campo de apellido esta habilitado.");
            if (ap.getAttribute("required") != null){
                System.out.println("El campo de apellido es requerido.");
                //Encuentra el campo de apellido y lo completa
                driver.findElement(By.name("field_132")).sendKeys("Fontana");
            }else{
                System.out.println("El campo de apellido no es requerido.");
            }
        } else {
            System.out.println("El campo de apellido no esta habilitado.");
        }

        WebElement em = driver.findElement(By.name("field_133"));
        if (em.getAttribute("disabled") == null) {
            System.out.println("El campo de email esta habilitado.");
            if (em.getAttribute("required") != null){
                System.out.println("El campo de email es requerido.");
                //Encuentra el campo de email y lo completa
                driver.findElement(By.name("field_133")).sendKeys("maurifl@gmail.com");
            }else{
                System.out.println("El campo de email no es requerido.");
            }
        } else {
            System.out.println("El campo de email no esta habilitado.");
        }

        WebElement te = driver.findElement(By.name("field_134"));
        if (te.getAttribute("disabled") == null) {
            System.out.println("El campo de teléfono esta habilitado.");
            if (te.getAttribute("required") != null){
                System.out.println("El campo de teléfono es requerido.");
                //Encuentra el campo de teléfono y lo completa
                driver.findElement(By.name("field_134")).sendKeys("2645152222");
            }else{
                System.out.println("El campo de teléfono no es requerido.");
            }
        } else {
            System.out.println("El campo de teléfono no esta habilitado.");
        }

        WebElement di = driver.findElement(By.name("field_135"));
        if (di.getAttribute("disabled") == null) {
            System.out.println("El campo de dirección esta habilitado.");
            if (di.getAttribute("required") != null){
                System.out.println("El campo de dirección es requerido.");
                //Encuentra el campo de dirección y lo completa
                driver.findElement(By.name("field_135")).sendKeys("Lima 333 B° Huali");
            }else{
                System.out.println("El campo de dirección no es requerido.");
            }
        } else {
            System.out.println("El campo de dirección no esta habilitado.");
        }

        WebElement di2 = driver.findElement(By.name("field_136"));
        if (di2.getAttribute("disabled") == null) {
            System.out.println("El campo de dirección 2 esta habilitado.");
            if (di2.getAttribute("required") != null){
                System.out.println("El campo de dirección 2 es requerido.");
                //Encuentra el campo de dirección 2 y lo completa
                driver.findElement(By.name("field_136")).sendKeys("Latica 444 V° San Damián");
            }else{
                System.out.println("El campo de dirección 2 no es requerido.");
            }
        } else {
            System.out.println("El campo de dirección 2 no esta habilitado.");
        }

        WebElement ci = driver.findElement(By.name("field_137"));
        if (ci.getAttribute("disabled") == null) {
            System.out.println("El campo de ciudad esta habilitado.");
            if (ci.getAttribute("required") != null){
                System.out.println("El campo de ciudad es requerido.");
                //Encuentra el campo de ciudad y lo completa
                driver.findElement(By.name("field_137")).sendKeys("Rawson");
            }else{
                System.out.println("El campo de ciudad no es requerido.");
            }
        } else {
            System.out.println("El campo de ciudad no esta habilitado.");
        }

        WebElement cp = driver.findElement(By.name("field_139"));
        if (cp.getAttribute("disabled") == null) {
            System.out.println("El campo de código postal esta habilitado.");
            if (cp.getAttribute("required") != null){
                System.out.println("El campo de código postal es requerido.");
                //Encuentra el campo de código postal y lo completa
                driver.findElement(By.name("field_139")).sendKeys("5425");
            }else{
                System.out.println("El campo de código postal no es requerido.");
            }
        } else {
            System.out.println("El campo de código postal no esta habilitado.");
        }

        WebElement ed = driver.findElement(By.name("field_140"));
        if (ed.getAttribute("disabled") == null) {
            System.out.println("El campo de edad esta habilitado.");
            if (ed.getAttribute("required") != null){
                System.out.println("El campo de edad es requerido.");
                //Encuentra el campo de edad y lo completa
                driver.findElement(By.name("field_140")).sendKeys("43");
            }else{
                System.out.println("El campo de edad no es requerido.");
            }
        } else {
            System.out.println("El campo de edad no esta habilitado.");
        }

        WebElement cm = driver.findElement(By.name("field_142"));
        if (cm.getAttribute("disabled") == null) {
            System.out.println("El campo de comentarios esta habilitado.");
            if (cm.getAttribute("required") != null){
                System.out.println("El campo de comentarios es requerido.");
                //Encuentra el campo de comentarios y lo completa
                driver.findElement(By.name("field_142")).sendKeys("Prueba del campo comentarios.");
            }else{
                System.out.println("El campo de comentarios no es requerido.");
            }
        } else {
            System.out.println("El campo de comentarios no esta habilitado.");
        }

        //************************************************************************************************
        //COMBOBOX
        Thread.sleep(500);
        // Localiza el elemento combobox
        WebElement req= driver.findElement(By.id("wsf-1-field-138"));
        WebElement hab= driver.findElement(By.id("wsf-1-field-138"));
        Select state=new Select(driver.findElement(By.id("wsf-1-field-138")));

        // Obtiene los valores de los atributos "required" y "disabled"
        String requiredAttributeValue = req.getAttribute("required");
        String disabledAttributeValue = hab.getAttribute("disabled");

        // Generamos el listado con los elementos del combobox
        List<WebElement> op=state.getOptions();

        if (hab.getAttribute("disabled")== null) {
            System.out.println("El campo de estado esta habilitado.");
            if (req.getAttribute("required") != null){
                System.out.println("El campo de estado es requerido.");
                // Itera a través de los elementos y selecciónalos
                for (WebElement option : op) {
                    state.selectByVisibleText(option.getText());
                    //Encuentra el campo de estado y lo completa
                    driver.findElement(By.id("wsf-1-field-138")).sendKeys("Florida");
                }
            }else{
                System.out.println("El campo de estado no es requerido.");
            }
        } else {
            System.out.println("El campo de estado no esta habilitado.");
        }

        //************************************************************************************************
        //RADIO BUTTON
        Thread.sleep(500);
        WebElement ma = driver.findElement(By.id("wsf-1-label-141-row-2"));
        if (ma.getAttribute("disabled") == null) {
            System.out.println("El campo de masculino esta habilitado.");
            if (ma.getAttribute("required") != null){
                System.out.println("El campo de masculino es requerido.");
                //Encuentra el campo de masculino y lo completa
                ma.click();
            }else{
                System.out.println("El campo de masculino no es requerido.");
            }
        } else {
            System.out.println("El campo de masculino no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement fe = driver.findElement(By.id("wsf-1-label-141-row-3"));
        if (fe.getAttribute("disabled") == null) {
            System.out.println("El campo de femenino esta habilitado.");
            if (fe.getAttribute("required") != null){
                System.out.println("El campo de femenino es requerido.");
                //Encuentra el campo de femenino y lo completa
                fe.click();
            }else{
                System.out.println("El campo de femenino no es requerido.");
            }
        } else {
            System.out.println("El campo de femenino no esta habilitado.");
        }

        //************************************************************************************************
        //BUTTON
        //Hace click en el botón de envío
        driver.findElement(By.name("field_143")).click();
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
