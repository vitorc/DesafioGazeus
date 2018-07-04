package test.mobiletest.englishlabels.features;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import test.mobiletest.appium.commonMethods.CommonPageObjects;
import test.mobiletest.appium.interactions.Interactions_EnglishLabels;
import test.mobiletest.appium.interactions.Interactions_Game;
import test.mobiletest.appium.interactions.Interactions_MainScreen;
import test.mobiletest.appium.pageObjects.PageObjects_EnglishLabels;
import test.mobiletest.appium.pageObjects.PageObjects_Game;
import test.mobiletest.appium.pageObjects.PageObjects_MainScreen;

import java.net.MalformedURLException;

public class Step_EnglishLabels extends  DriverInstanceMobile{

    public Step_EnglishLabels() throws MalformedURLException {
    }

    private AndroidDriver driver = instanceMobile();
    CommonPageObjects common = new CommonPageObjects(driver);
    Interactions_MainScreen mainscreeen = PageFactory.initElements(driver, Interactions_MainScreen.class);
    Interactions_Game game = PageFactory.initElements(driver, Interactions_Game.class);
    Interactions_EnglishLabels english = PageFactory.initElements(driver, Interactions_EnglishLabels.class);

    @Dado("^que estou na tela VIP$")
    public void que_estou_na_tela_VIP()  {
        common.aguardarElementoById(PageObjects_EnglishLabels.IDVIPBADGE);
    }

    @Quando("^Eu valido os textos traduzidos na tela vip para o idioma ingles \\(Americano\\)$")
    public void eu_valido_os_textos_traduzidosna_tela_vip_para_o_idioma_ingles_Americano()  {
        common.aguardarElementoByXpath(PageObjects_EnglishLabels.XPATHTEXTTAKEPARTINTHERANK);
        english.labelsvipscreentake("Take part in the ranking");
        common.aguardarElementoByXpath(PageObjects_EnglishLabels.XPATHTEXTPLAYWITHOUTADS);
        english.labelsvipscreenplaywithout("Play without ads");
        common.aguardarElementoByXpath(PageObjects_EnglishLabels.XPATHTEXTCHANGEYOURPROFILEPHOTO);
        english.labelsvipscreenchangeprofilephoto("Change your profile photo");
         common.aguardarElementoByXpath(PageObjects_EnglishLabels.XPATHTEXTFREETRIAL);
        english.labelsvipscreenfreetrial("Free trial for 7 days, then R$9.99 / week");
             /*Label assinatura mensal nao foi traduzida na aplicação*/
    }

    @Quando("^eu pressiono o botao sair da tela vip$")
    public void eu_pressiono_o_botao_sair_da_tela_vip()  {

        common.aguardarElementoById(PageObjects_MainScreen.IDBTNCLOSEVIP);
        mainscreeen.pressionarBtnCloseVip();
    }

    @Quando("^que estou na tela inicial do aplicativo$")
    public void que_estou_na_tela_inicial_do_aplicativo()  {
        common.aguardarElementoByXpath(PageObjects_EnglishLabels.XPATHTEXTBTNPLAYNOW);
        english.mainscreen("PLAY NOW!");
    }

    @Quando("^eu pressiono o botao Play Now$")
    public void eu_pressiono_o_botao_Play_Now()  {

        common.aguardarElementoById(PageObjects_MainScreen.IDBTNSINGLEPLAYER);
        mainscreeen.pressionarBtnSinglePlayer();
    }

    @Quando("^eu valido o texto do header em ingles \\(Choose the buraco game mode\\)$")
    public void eu_valido_o_texto_do_header_em_ingles_Choose_the_buraco_game_mode()  {

        common.aguardarElementoByXpath(PageObjects_EnglishLabels.XPATHTEXTCHOOSEGAMETYPE);
        english.choosegametypemain("Choose the Buraco game mode:");
    }

    @Quando("^eu pressiono o botao Buraco aberto$")
    public void eu_pressiono_o_botao_Buraco_aberto()  {

        common.aguardarElementoById(PageObjects_Game.IDBTNBURACOABERTO);
        game.acessarBuracoAberto();

    }

    @Entao("^eu valido as regras do jogo traduziadas para o idioma ingles \\(Americano\\)$")
    public void eu_valido_as_regras_do_jogo_traduziadas_para_o_idioma_ingles_Americano()  {
common.aguardarElementoByXpath(PageObjects_EnglishLabels.XPATHTEXTWITHOUTTHREEOFAKIND);
english.rulewithoutthreeofakind("- Without three of a kind");
common.aguardarElementoByXpath(PageObjects_EnglishLabels.XPATHTEXTOPENDISCARDPILE);
english.ruleopenpile("- Open Discard Pile");
common.aguardarElementoByXpath(PageObjects_EnglishLabels.XPATHTEXTGOOUTWITHCLEANCANASTRA);
english.ruleowithoucanastra("- Go out with Clean Canasta");

    }

}
