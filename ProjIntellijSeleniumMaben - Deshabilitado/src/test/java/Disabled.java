import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Disabled {
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
        driver.get("https://testingqarvn.com.es/campos-disabled/");
    }

    @Test
    public void TestTutorial() throws InterruptedException {

        //************************************************************************************************
        //INPUTS
        WebElement nombre = driver.findElement(By.id("wsf-1-field-117"));
        boolean des = !nombre.isEnabled();
        System.out.println("¿El campo nombre está deshabilitado? " + des);

        WebElement apellido = driver.findElement(By.id("wsf-1-field-118"));
        boolean des1 = !apellido.isEnabled();
        System.out.println("¿El campo apellido está deshabilitado? " + des1);

        WebElement mail = driver.findElement(By.id("wsf-1-field-119"));
        boolean des2 = !mail.isEnabled();
        System.out.println("¿El campo mail está deshabilitado? " + des2);

        WebElement tel = driver.findElement(By.id("wsf-1-field-120"));
        boolean des3 = !tel.isEnabled();
        System.out.println("¿El campo teléfono esta deshabilitado? " + des3);

        WebElement dir = driver.findElement(By.id("wsf-1-field-121"));
        boolean des4 = !dir.isEnabled();
        System.out.println("¿El campo dirección esta deshabilitado? " + des4);

        //************************************************************************************************
        System.out.println("CHECKBOX");
        //************************************************************************************************
        //CHECKBOX - CHECK
        WebElement php = driver.findElement(By.id("wsf-1-label-122-row-1"));
        boolean des5 = !php.isEnabled();
        System.out.println("¿El campo php esta deshabilitado? " + des5);

        WebElement py = driver.findElement(By.id("wsf-1-label-122-row-2"));
        boolean des6 = !py.isEnabled();
        System.out.println("¿El campo python esta deshabilitado? " + des6);

        WebElement js = driver.findElement(By.id("wsf-1-label-122-row-3"));
        boolean des7 = !js.isEnabled();
        System.out.println("¿El campo javascript esta deshabilitado? " + des7);

        //************************************************************************************************
        System.out.println("RADIOBUTTONS");
        //************************************************************************************************
        //RADIO BUTTONS
        Thread.sleep(500);
        WebElement cy = driver.findElement(By.id("wsf-1-label-123-row-1"));
        boolean des8 = !cy.isEnabled();
        System.out.println("¿El campo cypress esta deshabilitado? " + des8);

        Thread.sleep(500);
        WebElement wd = driver.findElement(By.id("wsf-1-label-123-row-2"));
        boolean des9 = !wd.isEnabled();
        System.out.println("¿El campo webdriver esta deshabilitado? " + des9);

        Thread.sleep(500);
        WebElement se = driver.findElement(By.id("wsf-1-label-123-row-3"));
        boolean des10 = !se.isEnabled();
        System.out.println("¿El campo selenium esta deshabilitado? " + des10);

        //************************************************************************************************
        System.out.println("COMBOBOX");
        //************************************************************************************************
        //COMBOBOX
        WebElement cb = driver.findElement(By.id("wsf-1-field-124"));
        Select CBox= new Select(cb);
        boolean des11 = !CBox.getWrappedElement().isEnabled();
        System.out.println("¿El campo sistema operativo esta deshabilitado? " + des11);

        WebElement cb1=driver.findElement(By.id("wsf-1-field-125"));
        Select CBox1 = new Select(cb1);
        boolean des12 = !CBox1.getWrappedElement().isEnabled();
        System.out.println("¿El campo opciones de SO esta deshabilitado? " + des12);

        //************************************************************************************************
        System.out.println("CALENDARIOS");
        //************************************************************************************************
        //Calendar
        WebElement dt=driver.findElement(By.id("wsf-1-field-128"));
        Select DT = new Select(cb1);
        boolean des13 = !DT.getWrappedElement().isEnabled();
        System.out.println("¿El campo eventos esta deshabilitado? " + des13);

        WebElement dt1= driver.findElement(By.id("wsf-1-field-129"));
        Select DT1 = new Select(cb1);
        boolean des14 = !DT1.getWrappedElement().isEnabled();
        System.out.println("¿El campo calendario de SO esta deshabilitado? " + des14);


        //************************************************************************************************
        //BUTTON
        WebElement submit = driver.findElement(By.id("wsf-1-field-130"));
        submit.click();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
