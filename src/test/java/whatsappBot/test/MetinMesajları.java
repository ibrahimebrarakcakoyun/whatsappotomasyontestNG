package whatsappBot.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import whatsappBot.pages.WhatsappWeb;
import whatsappBot.utilities.ConfigReader;
import whatsappBot.utilities.Driver;
import whatsappBot.utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.InputEvent;

import static whatsappBot.utilities.Driver.driver;
import static whatsappBot.utilities.Driver.getDriver;

public class MetinMesajları extends ReusableMethods {

    @Test
    public void ilkKisi() throws AWTException {
        Driver.getDriver().get(ConfigReader.getProperty("numara1"));
        WhatsappWeb whatsappWeb = new WhatsappWeb();

        bekle(5);
        Robot robot = new Robot();
        bekle(5);
        whatsappWeb.sohbeteBasla.click();
        bekle(2);
        whatsappWeb.whatsappWebkullan.click();
        bekle(30);
        whatsappWeb.textBox.sendKeys(ConfigReader.getProperty("Gönderilecek-mesaj"));
        whatsappWeb.send.click();


        bekle(5);
        Driver.getDriver().get(ConfigReader.getProperty("numara2"));

        whatsappWeb.sohbeteBasla.click();
        bekle(2);
        whatsappWeb.whatsappWebkullan.click();
        bekle(5);

        whatsappWeb.textBox.sendKeys(ConfigReader.getProperty("Gönderilecek-mesaj"));
        whatsappWeb.send.click();

        bekle(5);
        Driver.getDriver().get(ConfigReader.getProperty("numara3"));

        whatsappWeb.sohbeteBasla.click();
        bekle(2);
        whatsappWeb.whatsappWebkullan.click();
        bekle(5);

        whatsappWeb.textBox.sendKeys(ConfigReader.getProperty("Gönderilecek-mesaj"));
        whatsappWeb.send.click();





    }





}
