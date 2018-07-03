package test.mobiletest.appium.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Vitor Cardoso
 */
public class PageObjects_MultiPlayersGame {

    public static final String XPATHBTNMULTIPLAYER = "//android.widget.Button[@text='MULTIPLAYER']";
    public static final String IDMAISTARDE = "com.jogatina.buraco:id/later_button";
    public static final String IDPROGRESSBAR = "com.jogatina.buraco:id/progressBar1";
    public static final String IDBURACOABERTO = "com.jogatina.buraco:id/buttonChooseBuracoAberto";
    public static final String IDBNTDOISJOGADORES = "com.jogatina.buraco:id/btn2Players";
    public static final String IDTELABUSCA = "com.schibsted.bomnegocio.androidApp:id/content_frame";

    @FindBy(xpath = XPATHBTNMULTIPLAYER)
    protected WebElement btnMultiPlayer;

    @FindBy(id = IDMAISTARDE)
    protected WebElement btnMaisTarde;


    @FindBy(id = IDPROGRESSBAR)
    protected WebElement progessBar;

    @FindBy(id = IDBURACOABERTO)
    protected WebElement btnBuracoAberto;

    @FindBy(id = IDBNTDOISJOGADORES)
    protected WebElement btnDoisJogadores;

    @FindBy(id = IDTELABUSCA)
    protected WebElement telaFiltro;

}

