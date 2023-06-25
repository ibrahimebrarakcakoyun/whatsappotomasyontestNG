package whatsappBot.pages;

import whatsappBot.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatsappWeb {

    public WhatsappWeb() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//span[.='Sohbete Başla']")
    public WebElement sohbeteBasla;

    @FindBy(xpath = "//span[.=\"WhatsApp Web'i kullanın\"]")
    public WebElement whatsappWebkullan;

    @FindBy(xpath = "//div[@class='to2l77zo gfz4du6o ag5g9lrv bze30y65 kao4egtt']/p[@class='selectable-text copyable-text iq0m558w']")
    public WebElement textBox;

    @FindBy(xpath = "//button[@class='tvf2evcx oq44ahr5 lb5m6g5c svlsagor p2rjqpw5 epia9gcq']/span[1]")
    public WebElement send;

    @FindBy(xpath = "//div[@class='_1OT67']//div[@class='_3ndVb']/span[1]")
    public WebElement ekle;

}