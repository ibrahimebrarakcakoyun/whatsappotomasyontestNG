package whatsappBot.test.dosya;

import org.testng.annotations.Test;
import whatsappBot.pages.WhatsappWeb;
import whatsappBot.utilities.ConfigReader;
import whatsappBot.utilities.Driver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

import static whatsappBot.utilities.ReusableMethods.bekle;

public class DosyaGonderimiIleMesaj {

    @Test
    public void dosyaMesajı() throws AWTException {
        Driver.getDriver().get(ConfigReader.getProperty("numara1"));
        WhatsappWeb whatsappWeb = new WhatsappWeb();

        bekle(5);

        bekle(5);
        whatsappWeb.sohbeteBasla.click();
        bekle(2);
        whatsappWeb.whatsappWebkullan.click();
        bekle(30);

        whatsappWeb.textBox.click();
        StringSelection stringSelection = new StringSelection(ConfigReader.getProperty("Dosya-yolu"));
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
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
