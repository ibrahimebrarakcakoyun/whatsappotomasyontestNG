package whatsappBot.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import whatsappBot.pages.WhatsappWeb;
import whatsappBot.utilities.Driver;
import whatsappBot.utilities.ReusableMethods;

import static whatsappBot.utilities.Driver.driver;
import static whatsappBot.utilities.Driver.getDriver;

public class MetinMesajları extends ReusableMethods {

    @Test
    public void ilkKisi() {
        Driver.getDriver().get("http://wa.me/905541284253");
        WhatsappWeb whatsappWeb = new WhatsappWeb();

        bekle(5);
        getDriver().switchTo().alert().accept();
        whatsappWeb.sohbeteBasla.click();
        bekle(2);




    }





}
