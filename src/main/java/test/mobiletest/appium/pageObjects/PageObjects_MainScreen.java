package test.mobiletest.appium.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Vitor Cardoso.
 */
public class PageObjects_MainScreen {

    public static final String IDSELECIONARESTADO = "com.schibsted.bomnegocio.androidApp:id/fragment_automatic_" +
            "location_manual_button";
    public static final String XPATHRIODEJANEIRO = "//android.widget.TextView[@text='Rio de Janeiro']";
    public static final String XPATHDDD21 = "//android.widget.TextView[@text='DDD 21 - Rio de Janeiro e região']";
    public static final String XPATHLISTAREGIAO = "//android.widget.TextView[@text='Região']";

    @FindBy(id = IDSELECIONARESTADO)
    protected WebElement btnSelecionarEstado;

    @FindBy(xpath = XPATHRIODEJANEIRO)
    protected WebElement btnSelecionarEstadoRiodeJaneiro;

    @FindBy(xpath = XPATHDDD21)
    protected WebElement btnSelecionarDDD21;

    @FindBy(xpath = XPATHLISTAREGIAO)
    protected WebElement lblRegiaoEstados;

}