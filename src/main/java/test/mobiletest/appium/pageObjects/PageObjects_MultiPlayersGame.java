package test.mobiletest.appium.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Vitor Cardoso
 */
public class PageObjects_MultiPlayersGame {

    public static final String XPATHBTNMULTIPLAYER = "//android.widget.Button[@text='MULTIPLAYER']";
    public static final String IDBTNLATER = "com.jogatina.buraco:id/later_button";
    public static final String IDPROGRESSBAR = "com.jogatina.buraco:id/progressBar1";
    public static final String IDBURACOABERTO = "com.jogatina.buraco:id/buttonChooseBuracoAberto";
    public static final String IDBNTTWOPLAYERS = "com.jogatina.buraco:id/btn2Players";
    public static final String IDBTNLATERFACEBOOK = "com.jogatina.buraco:id/later_button";
    public static final String XPATHLOADTEXTVIEW = "//android.widget.TextView[@text='Efetuando login como Visitante']";

    @FindBy(xpath = XPATHBTNMULTIPLAYER)
    protected WebElement btnMultiPlayer;

    @FindBy(id = IDBTNLATER)
    protected WebElement btnLater;

    @FindBy(id = IDPROGRESSBAR)
    protected WebElement progessBar;

    @FindBy(id = IDBURACOABERTO)
    protected WebElement btnBuracoAberto;

    @FindBy(id = IDBNTTWOPLAYERS)
    protected WebElement btnDTwoPlayers;

    @FindBy(id = IDBTNLATERFACEBOOK)
    protected WebElement btnLaterFa;

    @FindBy(xpath = XPATHLOADTEXTVIEW)
    protected WebElement LoadTextView;


}

