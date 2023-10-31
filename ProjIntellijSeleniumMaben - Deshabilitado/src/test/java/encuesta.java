import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class encuesta {
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
        driver.get("https://testingqarvn.com.es/encuestas/");
    }
    @Test
    public void TestTutorial() throws InterruptedException {
        //************************************************************************************************
        //RADIO BUTTON
        //¿Cuánto tiempo lleva utilizando nuestro producto/servicio? =====================================
        Thread.sleep(500);
        WebElement md1m = driver.findElement(By.id("wsf-1-label-144-row-1"));
        if (md1m.getAttribute("disabled") == null) {
            System.out.println("El campo de menos de un mes esta habilitado.");
            //Encuentra el campo de menos de un mes y lo completa
            md1m.click();
        } else {
            System.out.println("El campo de menos de un mes no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement uno = driver.findElement(By.id("wsf-1-label-144-row-2"));
        if (uno.getAttribute("disabled") == null) {
            System.out.println("El campo de 1-6 esta habilitado.");
            //Encuentra el campo de 1-6 y lo completa
            uno.click();
        } else {
            System.out.println("El campo de 1-6 no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement dos = driver.findElement(By.id("wsf-1-label-144-row-3"));
        if (dos.getAttribute("disabled") == null) {
            System.out.println("El campo de 6-12 esta habilitado.");
            //Encuentra el campo de 6-12 y lo completa
            dos.click();
        } else {
            System.out.println("El campo de 6-12 no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement tres = driver.findElement(By.id("wsf-1-label-144-row-4"));
        if (tres.getAttribute("disabled") == null) {
            System.out.println("El campo de 1-3 años esta habilitado.");
            //Encuentra el campo de 1-3 años y lo completa
            tres.click();
        } else {
            System.out.println("El campo de 1-3 años no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement cuatro = driver.findElement(By.id("wsf-1-label-144-row-5"));
        if (cuatro.getAttribute("disabled") == null) {
            System.out.println("El campo de mas de 3 años esta habilitado.");
            //Encuentra el campo de mas de 3 años y lo completa
            cuatro.click();
        } else {
            System.out.println("El campo de masde 3 años no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement nunca = driver.findElement(By.id("wsf-1-label-144-row-6"));
        if (nunca.getAttribute("disabled") == null) {
            System.out.println("El campo de nunca esta habilitado.");
            //Encuentra el campo de nunca y lo completa
            nunca.click();
        } else {
            System.out.println("El campo de nunca no esta habilitado.");
        }

        //¿Con qué frecuencia utiliza nuestro producto/servicio? =========================================
        Thread.sleep(500);
        WebElement diario = driver.findElement(By.id("wsf-1-label-145-row-1"));
        if (diario.getAttribute("disabled") == null) {
            System.out.println("El campo de a diario esta habilitado.");
            //Encuentra el campo de a diario y lo completa
            diario.click();
        } else {
            System.out.println("El campo de a diario no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement semanalmente = driver.findElement(By.id("wsf-1-label-145-row-4"));
        if (semanalmente.getAttribute("disabled") == null) {
            System.out.println("El campo de semanalmente esta habilitado.");
            //Encuentra el campo de semanalmente y lo completa
            semanalmente.click();
        } else {
            System.out.println("El campo de semanalmente no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement mensual = driver.findElement(By.id("wsf-1-label-145-row-7"));
        if (mensual.getAttribute("disabled") == null) {
            System.out.println("El campo de mensual esta habilitado.");
            //Encuentra el campo de mensual y lo completa
            mensual.click();
        } else {
            System.out.println("El campo de mensual no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement v = driver.findElement(By.id("wsf-1-label-145-row-2"));
        if (v.getAttribute("disabled") == null) {
            System.out.println("El campo de 3 veces a la semana esta habilitado.");
            //Encuentra el campo de 3 veces a la semana y lo completa
            v.click();
        } else {
            System.out.println("El campo de 3 veces a la semana no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement m = driver.findElement(By.id("wsf-1-label-145-row-5"));
        if (m.getAttribute("disabled") == null) {
            System.out.println("El campo de 3 veces al mes esta habilitado.");
            //Encuentra el campo de 3 veces al mes y lo completa
            m.click();
        } else {
            System.out.println("El campo de 3 veces al mes no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement alm = driver.findElement(By.id("wsf-1-label-145-row-8"));
        if (alm.getAttribute("disabled") == null) {
            System.out.println("El campo de al menos 1 vez al mes esta habilitado.");
            //Encuentra el campo de al menos 1 vezal mes y lo completa
            alm.click();
        } else {
            System.out.println("El campo de al menos 1 vez al mes no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement dlm = driver.findElement(By.id("wsf-1-label-145-row-3"));
        if (dlm.getAttribute("disabled") == null) {
            System.out.println("El campo de al menos 2 veces a la semana esta habilitado.");
            //Encuentra el campo de al menos 2 veces a la semana y lo completa
            dlm.click();
        } else {
            System.out.println("El campo de al menos 2 veces a la semana no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement dvs = driver.findElement(By.id("wsf-1-label-145-row-6"));
        if (dvs.getAttribute("disabled") == null) {
            System.out.println("El campo de 2 veces al mes esta habilitado.");
            //Encuentra el campo de 2 veces al mes y lo completa
            dvs.click();
        } else {
            System.out.println("El campo de 2 veces al mes no esta habilitado.");
        }

        //¿Qué tan satisfecho está con el producto/servicio? =============================================
        Thread.sleep(500);
        WebElement ms = driver.findElement(By.id("wsf-1-label-146-row-1"));
        if (ms.getAttribute("disabled") == null) {
            System.out.println("El campo de muy satisfecho esta habilitado.");
            //Encuentra el campo de muy satisfecho y lo completa
            ms.click();
        } else {
            System.out.println("El campo de muy satisfecho no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement s = driver.findElement(By.id("wsf-1-label-146-row-2"));
        if (s.getAttribute("disabled") == null) {
            System.out.println("El campo de satisfecho esta habilitado.");
            //Encuentra el campo de satisfecho y lo completa
            s.click();
        } else {
            System.out.println("El campo de satisfecho no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement n = driver.findElement(By.id("wsf-1-label-146-row-3"));
        if (n.getAttribute("disabled") == null) {
            System.out.println("El campo de neutral esta habilitado.");
            //Encuentra el campo de neutral y lo completa
            n.click();
        } else {
            System.out.println("El campo de neutral no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement i = driver.findElement(By.id("wsf-1-label-146-row-4"));
        if (i.getAttribute("disabled") == null) {
            System.out.println("El campo de insatisfecho esta habilitado.");
            //Encuentra el campo de insatisfecho y lo completa
            i.click();
        } else {
            System.out.println("El campo de insatisfecho no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement mi = driver.findElement(By.id("wsf-1-label-146-row-5"));
        if (mi.getAttribute("disabled") == null) {
            System.out.println("El campo de muy insatisfecho esta habilitado.");
            //Encuentra el campo de muy insatisfecho y lo completa
            mi.click();
        } else {
            System.out.println("El campo de muy insatisfecho no esta habilitado.");
        }

        //¿Qué es lo que más le impresionó del producto/servicio? =======================================
        Thread.sleep(500);
        WebElement sc = driver.findElement(By.id("wsf-1-label-147-row-5"));
        if (sc.getAttribute("disabled") == null) {
            System.out.println("El campo de servicio al cliente esta habilitado.");
            //Encuentra el campo de servicio al cliente y lo completa
            sc.click();
        } else {
            System.out.println("El campo de servicio al cliente no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement p = driver.findElement(By.id("wsf-1-label-147-row-2"));
        if (p.getAttribute("disabled") == null) {
            System.out.println("El campo precio esta habilitado.");
            //Encuentra el campo de precio y lo completa
            p.click();
        } else {
            System.out.println("El campo de precio no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement ca = driver.findElement(By.id("wsf-1-label-147-row-1"));
        if (ca.getAttribute("disabled") == null) {
            System.out.println("El campo calidad esta habilitado.");
            //Encuentra el campo de calidad y lo completa
            ca.click();
        } else {
            System.out.println("El campo de calidad no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement ec = driver.findElement(By.id("wsf-1-label-147-row-3"));
        if (ec.getAttribute("disabled") == null) {
            System.out.println("El campo experiencia en compras esta habilitado.");
            //Encuentra el campo de experiencia en compras y lo completa
            ec.click();
        } else {
            System.out.println("El campo de experiencia en compras no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement u = driver.findElement(By.id("wsf-1-label-147-row-4"));
        if (u.getAttribute("disabled") == null) {
            System.out.println("El campo usabilidad esta habilitado.");
            //Encuentra el campo de usabilidad y lo completa
            u.click();
        } else {
            System.out.println("El campo de usabilidad no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement na = driver.findElement(By.id("wsf-1-label-147-row-6"));
        if (na.getAttribute("disabled") == null) {
            System.out.println("El campo nada esta habilitado.");
            //Encuentra el campo de nada y lo completa
            na.click();
        } else {
            System.out.println("El campo de nada no esta habilitado.");
        }

        //************************************************************************************************
        //INPUT
        //¿Qué le gusta del producto/servicio? ===========================================================
        WebElement prse = driver.findElement(By.name("field_148"));
        if (prse.getAttribute("disabled") == null) {
            System.out.println("El campo de que gusta del producto/servicio esta habilitado.");
            if (prse.getAttribute("required") == null){
                System.out.println("El campo de que gusta del producto/servicio es requerido.");
                //Encuentra el campo de que gusta del producto/servicio y lo completa
                driver.findElement(By.name("field_148")).sendKeys("Prueba de que gusta del producto o servicio");
            }else{
                System.out.println("El campo de que gusta del producto/servicio no es requerido.");
            }
        } else {
            System.out.println("El campo de que gusta del producto/servicio no esta habilitado.");
        }

        //¿Qué es lo que más le decepcionó del producto/servicio? ========================================

        Thread.sleep(500);
        WebElement scc = driver.findElement(By.id("wsf-1-label-149-row-5"));
        if (scc.getAttribute("disabled") == null) {
            System.out.println("El campo de servicio al cliente esta habilitado.");
            //Encuentra el campo de servicio al cliente y lo completa
            scc.click();
        } else {
            System.out.println("El campo de servicio al cliente no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement pp = driver.findElement(By.id("wsf-1-label-149-row-2"));
        if (pp.getAttribute("disabled") == null) {
            System.out.println("El campo precio esta habilitado.");
            //Encuentra el campo de precio y lo completa
            pp.click();
        } else {
            System.out.println("El campo de precio no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement caa = driver.findElement(By.id("wsf-1-label-149-row-1"));
        if (caa.getAttribute("disabled") == null) {
            System.out.println("El campo calidad esta habilitado.");
            //Encuentra el campo de calidad y lo completa
            caa.click();
        } else {
            System.out.println("El campo de calidad no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement ecc = driver.findElement(By.id("wsf-1-label-149-row-3"));
        if (ecc.getAttribute("disabled") == null) {
            System.out.println("El campo experiencia en compras esta habilitado.");
            //Encuentra el campo de experiencia en compras y lo completa
            ecc.click();
        } else {
            System.out.println("El campo de experiencia en compras no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement uu = driver.findElement(By.id("wsf-1-label-149-row-4"));
        if (uu.getAttribute("disabled") == null) {
            System.out.println("El campo usabilidad esta habilitado.");
            //Encuentra el campo de usabilidad y lo completa
            uu.click();
        } else {
            System.out.println("El campo de usabilidad no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement naa = driver.findElement(By.id("wsf-1-label-149-row-6"));
        if (naa.getAttribute("disabled") == null) {
            System.out.println("El campo nada esta habilitado.");
            //Encuentra el campo de nada y lo completa
            naa.click();
        } else {
            System.out.println("El campo de nada no esta habilitado.");
        }

        //************************************************************************************************
        //INPUT
        //¿Qué le gusta del producto/servicio? ===========================================================
        WebElement qlgustaps = driver.findElement(By.name("field_150"));
        if (qlgustaps.getAttribute("disabled") == null) {
            System.out.println("El campo de que gusta del producto/servicio esta habilitado.");
            if (qlgustaps.getAttribute("required") == null){
                System.out.println("El campo de que gusta del producto/servicio es requerido.");
                //Encuentra el campo de que gusta del producto/servicio y lo completa
                driver.findElement(By.name("field_150")).sendKeys("Prueba de que gusta del producto o servicio");
            }else{
                System.out.println("El campo de que gusta del producto/servicio no es requerido.");
            }
        } else {
            System.out.println("El campo de que gusta del producto/servicio no esta habilitado.");
        }

        //En comparación con productos similares ofrecidos por otras empresas, ¿cómo considera nuestro producto? =========
        Thread.sleep(500);
        WebElement mm = driver.findElement(By.id("wsf-1-label-151-row-1"));
        if (mm.getAttribute("disabled") == null) {
            System.out.println("El campo de mucho mejor esta habilitado.");
            //Encuentra el campo de mucho mejor y lo completa
            mm.click();
        } else {
            System.out.println("El campo de mucho mejor no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement upm = driver.findElement(By.id("wsf-1-label-151-row-2"));
        if (upm.getAttribute("disabled") == null) {
            System.out.println("El campo de un poco mejor esta habilitado.");
            //Encuentra el campo de un poco mejor y lo completa
            upm.click();
        } else {
            System.out.println("El campo un poco mejor no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement mis = driver.findElement(By.id("wsf-1-label-151-row-3"));
        if (mis.getAttribute("disabled") == null) {
            System.out.println("El campo de mismo esta habilitado.");
            //Encuentra el campo de mismo y lo completa
            mis.click();
        } else {
            System.out.println("El campo de mismo no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement ap = driver.findElement(By.id("wsf-1-label-151-row-4"));
        if (ap.getAttribute("disabled") == null) {
            System.out.println("El campo de algo peor esta habilitado.");
            //Encuentra el campo de algo peor y lo completa
            ap.click();
        } else {
            System.out.println("El campo de algo peor no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement mp = driver.findElement(By.id("wsf-1-label-151-row-5"));
        if (mp.getAttribute("disabled") == null) {
            System.out.println("El campo de mucho peor esta habilitado.");
            //Encuentra el campo de mucho peor y lo completa
            mp.click();
        } else {
            System.out.println("El campo de mucho peor no esta habilitado.");
        }

        //¿Utilizaría nuestro producto/servicio en el futuro? ============================================
        Thread.sleep(500);
        WebElement d = driver.findElement(By.id("wsf-1-label-152-row-1"));
        if (d.getAttribute("disabled") == null) {
            System.out.println("El campo de definitivamente esta habilitado.");
            //Encuentra el campo de definitivamente y lo completa
            d.click();
        } else {
            System.out.println("El campo de definitivamente no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement pr = driver.findElement(By.id("wsf-1-label-152-row-2"));
        if (pr.getAttribute("disabled") == null) {
            System.out.println("El campo de un probablemente esta habilitado.");
            //Encuentra el campo de un probablemente y lo completa
            pr.click();
        } else {
            System.out.println("El campo un probablemente no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement nes = driver.findElement(By.id("wsf-1-label-152-row-3"));
        if (nes.getAttribute("disabled") == null) {
            System.out.println("El campo de no estoy seguro esta habilitado.");
            //Encuentra el campo de no estoy seguro y lo completa
            nes.click();
        } else {
            System.out.println("El campo de no estoy seguro no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement pn = driver.findElement(By.id("wsf-1-label-152-row-4"));
        if (pn.getAttribute("disabled") == null) {
            System.out.println("El campo de probablemente no esta habilitado.");
            //Encuentra el campo de probablemente no y lo completa
            pn.click();
        } else {
            System.out.println("El campo de probablemente no no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement dm = driver.findElement(By.id("wsf-1-label-152-row-5"));
        if (dm.getAttribute("disabled") == null) {
            System.out.println("El campo de definitivamente no esta habilitado.");
            //Encuentra el campo de definitivamente no y lo completa
            dm.click();
        } else {
            System.out.println("El campo de definitivamente no no esta habilitado.");
        }

        //¿Recomendaría nuestro producto/servicio a otras personas? =========================================
        Thread.sleep(500);
        WebElement def = driver.findElement(By.id("wsf-1-label-153-row-1"));
        if (def.getAttribute("disabled") == null) {
            System.out.println("El campo de definitivamente esta habilitado.");
            //Encuentra el campo de definitivamente y lo completa
            def.click();
        } else {
            System.out.println("El campo de definitivamente no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement pro = driver.findElement(By.id("wsf-1-label-153-row-2"));
        if (pro.getAttribute("disabled") == null) {
            System.out.println("El campo de un probablemente esta habilitado.");
            //Encuentra el campo de un probablemente y lo completa
            pro.click();
        } else {
            System.out.println("El campo un probablemente no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement nese = driver.findElement(By.id("wsf-1-label-153-row-3"));
        if (nese.getAttribute("disabled") == null) {
            System.out.println("El campo de no estoy seguro esta habilitado.");
            //Encuentra el campo de no estoy seguro y lo completa
            nese.click();
        } else {
            System.out.println("El campo de no estoy seguro no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement pno = driver.findElement(By.id("wsf-1-label-153-row-4"));
        if (pno.getAttribute("disabled") == null) {
            System.out.println("El campo de probablemente no esta habilitado.");
            //Encuentra el campo de probablemente no y lo completa
            pno.click();
        } else {
            System.out.println("El campo de probablemente no no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement dmn = driver.findElement(By.id("wsf-1-label-153-row-5"));
        if (dmn.getAttribute("disabled") == null) {
            System.out.println("El campo de definitivamente no esta habilitado.");
            //Encuentra el campo de definitivamente no y lo completa
            dmn.click();
        } else {
            System.out.println("El campo de definitivamente no no esta habilitado.");
        }

        //************************************************************************************************
        //INPUT
        //¿Algún otro comentario? ===========================================================
        WebElement aoc = driver.findElement(By.name("field_154"));
        if (aoc.getAttribute("disabled") == null) {
            System.out.println("El campo de que gusta del producto/servicio esta habilitado.");
            if (aoc.getAttribute("required") == null){
                System.out.println("El campo de que gusta del producto/servicio es requerido.");
                //Encuentra el campo de que gusta del producto/servicio y lo completa
                driver.findElement(By.name("field_154")).sendKeys("ningun comentario aparte");
            }else{
                System.out.println("El campo de que gusta del producto/servicio no es requerido.");
            }
        } else {
            System.out.println("El campo de que gusta del producto/servicio no esta habilitado.");
        }

        //************************************************************************************************
        //BUTTON
        driver.findElement(By.name("field_155")).click();
    }
   @After
   public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
