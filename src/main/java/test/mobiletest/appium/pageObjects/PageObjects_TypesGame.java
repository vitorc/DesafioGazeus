package test.mobiletest.appium.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects_TypesGame {

    public static final String IDBTNBURACOABERTO = "com.jogatina.buraco:id/buttonChooseBuracoAberto";
    public static final String IDBTNBURACOFECHADO = "com.jogatina.buraco:id/buttonChooseBuracoFechado";
    public static final String IDBTNBURACOFECHADOSTBL = "com.jogatina.buraco:id/buttonChooseBuracoFechadoSTBL";
    public static final String IDBTNBACK = "com.jogatina.buraco:id/back_button";

    @FindBy(xpath = IDBTNBURACOABERTO)
    protected WebElement btnMultiPlayer;

    @FindBy(id = IDBTNBURACOFECHADO)
    protected WebElement btnLater;

    @FindBy(id = IDBTNBURACOFECHADOSTBL)
    protected WebElement progessBar;

    @FindBy(id = IDBTNBACK)
    protected WebElement btnBuracoAberto;

}


