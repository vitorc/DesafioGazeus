package test.mobiletest.appium.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects_EnglishLabels {

    public static final String IDVIPBADGE = "com.jogatina.buraco:id/imageViewVipBadge";
    public static final String XPATHTEXTTAKEPARTINTHERANK = "//android.widget.TextView[@text='Take part in the ranking']";
    public static final String XPATHTEXTPLAYWITHOUTADS = "//android.widget.TextView[@text='Play without ads']";
    public static final String XPATHTEXTCHANGEYOURPROFILEPHOTO = "//android.widget.TextView[@text='Change your profile photo']";
    public static final String XPATHTEXTBTNSEVENDAYS = "//android.widget.Button[@text='7 days free']";
    public static final String XPATHTEXTFREETRIAL = "//android.widget.TextView[@text='Free trial for 7 days, then R$9.99 / week']";
    public static final String XPATHANNUALLYSUBSCRIPTION = "//android.widget.TextView[@text='Annually Subscription']";
    /*Label assinatura mensal nao foi traduzida na aplicação*/
    public static final String XPATHTEXTBTNPLAYNOW = "//android.widget.Button[@text='PLAY NOW!']";
    public static final String XPATHTEXTCHOOSEGAMETYPE = "//android.widget.TextView[@text='Choose the Buraco game mode:']";
    public static final String XPATHTEXTWITHOUTTHREEOFAKIND= "//android.widget.TextView[@text='- Without three of a kind']";
    public static final String XPATHTEXTOPENDISCARDPILE = "//android.widget.TextView[@text='- Open Discard Pile']";
    public static final String XPATHTEXTGOOUTWITHCLEANCANASTRA= "//android.widget.TextView[@text='- Go out with Clean Canasta']";

    @FindBy(id = IDVIPBADGE)
    protected WebElement vipBadge;

    @FindBy(xpath = XPATHTEXTTAKEPARTINTHERANK)
    protected WebElement textTake;

    @FindBy(xpath = XPATHTEXTPLAYWITHOUTADS)
    protected WebElement textPlayWithout;

    @FindBy(xpath = XPATHTEXTCHANGEYOURPROFILEPHOTO)
    protected WebElement textChangeProfilePhoto;

    @FindBy(xpath = XPATHTEXTBTNSEVENDAYS)
    protected WebElement textSevenDays;

    @FindBy(xpath = XPATHTEXTFREETRIAL)
    protected WebElement textFreeTrial;

    @FindBy(xpath = XPATHANNUALLYSUBSCRIPTION)
    protected WebElement textAnnually;

    @FindBy(xpath = XPATHTEXTBTNPLAYNOW)
    protected WebElement textPlayNow;

    @FindBy(xpath = XPATHTEXTCHOOSEGAMETYPE)
    protected WebElement textChooseGameType;

    @FindBy(xpath = XPATHTEXTWITHOUTTHREEOFAKIND)
    protected WebElement textWithoutThreeKind;

    @FindBy(xpath = XPATHTEXTOPENDISCARDPILE)
    protected WebElement textOpenPile;

    @FindBy(xpath = XPATHTEXTGOOUTWITHCLEANCANASTRA)
    protected WebElement textWithCleanCanastra;

}
