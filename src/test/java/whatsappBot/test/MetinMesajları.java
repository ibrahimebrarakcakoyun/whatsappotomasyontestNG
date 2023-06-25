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
        robot.mouseMove(699, 160);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        bekle(5);
        bekle(5);

        robot.mouseMove(1100, 220);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        bekle(5);
        whatsappWeb.sohbeteBasla.click();
        bekle(2);
        whatsappWeb.whatsappWebkullan.click();
        whatsappWeb.sohbeteBasla.sendKeys(ConfigReader.getProperty("Gönderilecek-mesaj"));
        whatsappWeb.send.click();



        Driver.getDriver().get(ConfigReader.getProperty("numara2"));

        bekle(5);

        robot.mouseMove(699, 160);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        bekle(5);
        bekle(5);

        robot.mouseMove(1100, 220);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        bekle(5);
        whatsappWeb.sohbeteBasla.click();
        bekle(2);
        whatsappWeb.whatsappWebkullan.click();
        whatsappWeb.sohbeteBasla.sendKeys(ConfigReader.getProperty("Gönderilecek-mesaj"));
        whatsappWeb.send.click();





    }





}
