package whatsappBot.test.metin;

import org.testng.annotations.Test;
import whatsappBot.pages.WhatsappWeb;
import whatsappBot.utilities.ConfigReader;
import whatsappBot.utilities.Driver;
import whatsappBot.utilities.ReusableMethods;

import java.awt.*;

public class MetinMesajları5Kisilik extends ReusableMethods {

    @Test
    public void metinMesajı() throws AWTException {
        Driver.getDriver().get(ConfigReader.getProperty("numara1"));
        WhatsappWeb whatsappWeb = new WhatsappWeb();


        bekle(8);
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

        bekle(5);
        Driver.getDriver().get(ConfigReader.getProperty("numara4"));

        whatsappWeb.sohbeteBasla.click();
        bekle(2);
        whatsappWeb.whatsappWebkullan.click();
        bekle(5);

        whatsappWeb.textBox.sendKeys(ConfigReader.getProperty("Gönderilecek-mesaj"));
        whatsappWeb.send.click();

        bekle(5);
        Driver.getDriver().get(ConfigReader.getProperty("numara5"));

        whatsappWeb.sohbeteBasla.click();
        bekle(2);
        whatsappWeb.whatsappWebkullan.click();
        bekle(5);

        whatsappWeb.textBox.sendKeys(ConfigReader.getProperty("Gönderilecek-mesaj"));
        whatsappWeb.send.click();





    }





}
