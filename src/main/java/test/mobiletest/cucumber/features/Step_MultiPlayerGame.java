package test.mobiletest.cucumber.features;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import test.mobiletest.appium.commonMethods.CommonPageObjects;
import test.mobiletest.appium.interactions.Interactions_MainScreen;
import test.mobiletest.appium.interactions.Interactions_TelaInicial;
import test.mobiletest.appium.pageObjects.PageObjects_MainScreen;

import java.net.MalformedURLException;

public class Step_MultiPlayerGame extends  DriverInstanceMobile{


    public Step_MultiPlayerGame() throws MalformedURLException {
    }


    private AndroidDriver driver = instanceMobile();
    CommonPageObjects common = new CommonPageObjects(driver);
    Interactions_TelaInicial paginaInicial = PageFactory.initElements(driver, Interactions_TelaInicial.class);
    Interactions_MainScreen paginabusca = PageFactory.initElements(driver, Interactions_MainScreen.class);

    @Dado("^que o botao jogar esteja visivel na tela do aplicativo$")
    public void que_o_botao_jogar_esteja_visivel_na_tela_do_aplicativo() {

        common.aguardarElementoById(PageObjects_MainScreen.IDSELECIONARESTADO);

    }

    @Entao("^o sistema exibe a sala com dois jodores sendo um robo$")
    public void o_sistema_exibe_a_sala_com_dois_jodores_sendo_um_robo()  {

    }

}
