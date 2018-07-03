package test.mobiletest.appium.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Vitor Cardoso.
 */
public class PageObjects_MainScreen {


    public static final String IDBTNSINGLEPLAYER= "com.jogatina.buraco:id/buttonSingleplayer";
    public static final String IDBTNMULTIPLAYER = "com.jogatina.buraco:id/buttonMultiplayer";
    public static final String IDBTNACCESSVIP = "com.jogatina.buraco:id/buttonMultiplayer";
    public static final String IDBTNCLOSEVIP = "com.jogatina.buraco:id/buttonClose";
    public static final String IDBTNINVATEFRIENDS = "com.jogatina.buraco:id/buttonInviteFriends";
    public static final String IDBTNACHIEVEMENTS = "com.jogatina.buraco:id/buttonAchievements";
    public static final String IDBTNSETTINGS = "com.jogatina.buraco:id/buttonSettings";
    public static final String IDSELECIONARESTADO = "com.schibsted.bomnegocio.androidApp:id/fragment_automatic_" +
            "location_manual_button";

    @FindBy(id=IDBTNSINGLEPLAYER)
    protected  WebElement btnSinglePlayer;

    @FindBy(id=IDBTNMULTIPLAYER)
    protected  WebElement btnMultiPlayer;

    @FindBy(id=IDBTNACCESSVIP)
    protected  WebElement btnAccessVip;

    @FindBy(id=IDBTNCLOSEVIP)
    protected  WebElement btnCloseVip;

    @FindBy(id=IDBTNINVATEFRIENDS)
    protected  WebElement btnInvateFriends;

    @FindBy(id=IDBTNACHIEVEMENTS)
    protected  WebElement btnAchievements;

    @FindBy(id=IDBTNSETTINGS)
    protected  WebElement btnSettings;







}