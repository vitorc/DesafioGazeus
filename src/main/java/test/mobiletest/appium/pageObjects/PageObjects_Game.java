package test.mobiletest.appium.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects_Game {

    public static final String IDBTNBURACOABERTO = "com.jogatina.buraco:id/buttonChooseBuracoAberto";
    public static final String IDBTNBURACOFECHADO = "com.jogatina.buraco:id/buttonChooseBuracoFechado";
    public static final String IDBTNBURACOFECHADOSTBL = "com.jogatina.buraco:id/buttonChooseBuracoFechadoSTBL";
    public static final String IDBTNBACK = "com.jogatina.buraco:id/back_button";
    public static final String IDBTNTWOPLAYERS = "com.jogatina.buraco:id/btn2Players";
    public static final String IDBNTFOURPLAYERS = "com.jogatina.buraco:id/btn4Players";
    public static final String IDPROGRESSBAR = "com.jogatina.buraco:id/progressBar1";
    public static final String IDBTNLATERFACEBOOK = "com.jogatina.buraco:id/later_button";
    public static final String XPATHLOADTEXTVIEWGUEST = "//android.widget.TextView[@text='Efetuando login como Visitante']";
    public static final String IDBTNLOGINORSIGNUP = "com.jogatina.buraco:id/loginOrSignup";
    public static final String XPATHTEXTLOSTCONNECTION = "//android.widget.TextView[@text='A conexão com o servidor foi perdida. Por favor, entre novamente']";
    public static final String IDBTNOKLOSTCONNECTION = "com.jogatina.buraco:id/dialog_button";
    public static final String XPATHSAIRTUTORIAL = "//android.widget.LinearLayout[@class='android.widget.LinearLayout']/android.widget.Button[1]";
	public static final String XPATHCLOSEPOPUP = "//android.widget.RelativeLayout[@class='android.widget.RelativeLayout']/android.widget.Button[0]";

    @FindBy(id = IDBTNBURACOABERTO)
    protected WebElement bntBuracoAberto;

    @FindBy(id = IDBTNBURACOFECHADO)
    protected WebElement btnBuracoFechado;

    @FindBy(id = IDBTNBURACOFECHADOSTBL)
    protected WebElement btnBuracoSTBL;

    @FindBy(id = IDBTNBACK)
    protected WebElement BtnBack;

    @FindBy(id = IDBTNTWOPLAYERS)
    protected WebElement btnTwoPlayers;

    @FindBy(id = IDBNTFOURPLAYERS)
    protected WebElement btnFourPlayers;

    @FindBy(id = IDPROGRESSBAR)
    protected WebElement progressBar;

    @FindBy(id = IDBTNLATERFACEBOOK)
    protected WebElement  btnLaterFacebook;

    @FindBy(id = IDBTNLOGINORSIGNUP)
    protected WebElement btnLoginOrSignup;

    @FindBy(id = IDBTNOKLOSTCONNECTION)
    protected WebElement btnOKLostConnection;

    @FindBy(xpath = XPATHTEXTLOSTCONNECTION)
    protected WebElement textLostConnection;

    @FindBy(xpath = XPATHLOADTEXTVIEWGUEST)
    protected WebElement textLoadViewGuest;

    @FindBy(xpath = XPATHSAIRTUTORIAL)
    protected WebElement btnSairTutorial;
	
	@FindBy(xpath = XPATHCLOSEPOPUP)
    protected WebElement btnClosePopup;

}


