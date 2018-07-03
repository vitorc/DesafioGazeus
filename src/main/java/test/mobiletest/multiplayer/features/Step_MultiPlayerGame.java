package test.mobiletest.multiplayer.features;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import test.mobiletest.appium.commonMethods.CommonPageObjects;
import test.mobiletest.appium.interactions.Interactions_Game;
import test.mobiletest.appium.interactions.Interactions_MainScreen;
import test.mobiletest.appium.pageObjects.PageObjects_Game;
import test.mobiletest.appium.pageObjects.PageObjects_MainScreen;

import java.net.MalformedURLException;

public class Step_MultiPlayerGame extends  DriverInstanceMobile{

    public Step_MultiPlayerGame() throws MalformedURLException {
    }

    private AndroidDriver driver = instanceMobile();
    CommonPageObjects common = new CommonPageObjects(driver);
    Interactions_MainScreen mainscreeen = PageFactory.initElements(driver, Interactions_MainScreen.class);
    Interactions_Game game = PageFactory.initElements(driver, Interactions_Game.class);

    @Dado("^que estou na tela VIP$")
    public void que_estou_na_tela_VIP() {
        common.aguardarElementoById(PageObjects_MainScreen.IDBTNCLOSEVIP);
    }

    @Quando("^Eu pressiono o bota sair$")
    public void eu_pressiono_o_bota_sair(){
        mainscreeen.pressionarBtnCloseVip();
    }

    @Quando("^que estou na tela inicial do aplicativo$")
    public void que_estou_na_tela_inicial_do_aplicativo(){
        common.aguardarElementoById(PageObjects_MainScreen.IDBTNMULTIPLAYER);
    }

    @Quando("^eu pressiono o botao multiplayer$")
    public void eu_pressiono_o_botao_multiplayer()  {
        common.aguardarElementoById(PageObjects_MainScreen.IDBTNMULTIPLAYER);
        mainscreeen.pressionarBtnMultiPlayer();
    }

    @Quando("^eu entro na sala como visitante$")
    public void eu_entro_na_sala_como_visitante() {
        common.aguardarElementoById(PageObjects_Game.IDBTNLATERFACEBOOK);
        game.acessarComoConvidado();
    }

   /* @Quando("^eu escolho o tipo de buraco: Buraco aberto$")
    public void eu_escolho_o_tipo_de_buraco_Buraco_aberto() {
        common.aguardarElementoById(PageObjects_Game.IDBTNBURACOABERTO);
        game.acessarBuracoAberto();
    }*/

    @Quando("^eu escolho a sala com dois jogadores$")
    public void eu_escolho_a_sala_com_dois_jogadores() {
        common.aguardarElementoById(PageObjects_Game.IDBTNTWOPLAYERS);
        game.selecionarQuantidadeJogadores();

    }

    @Quando("^ocorre uma queda de conexao da internet durante a partida$")
    public void ocorre_uma_queda_de_conexao_da_internet_durante_a_partida() {
        NetworkConnectionSetting lostConnection = new NetworkConnectionSetting(true,false,false);
        driver.setNetworkConnection(lostConnection);
    }

    @Entao("^o sistema exibe mensagem informando que houve um problema$")
    public void o_sistema_exibe_mensagem_informando_que_houve_um_problema() {
        game.mensagemPerdaConexao();
    }

    @Entao("^eu devo confirmar a mensagem$")
    public void eu_devo_confirmar_a_mensagem(){
        common.aguardarElementoById(PageObjects_Game.IDBTNOKLOSTCONNECTION);
        game.ConfirmarPerdaConexao();
    }

    @Entao("^o sistema retorna para a tela inicial$")
    public void o_sistema_retorna_para_a_tela_inicial() {
        common.aguardarElementoById(PageObjects_MainScreen.IDBTNMULTIPLAYER);
    }

}
