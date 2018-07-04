package test.mobiletest.appium.interactions;

import org.junit.Assert;
import test.mobiletest.appium.pageObjects.PageObjects_Game;

public class Interactions_Game extends PageObjects_Game {

    public void acessarComoConvidado(){
        btnLaterFacebook.click();
        }
        public void acessarBuracoAberto(){
        bntBuracoAberto.click();
        }
        public void selecionarQuantidadeJogadores(){
        btnTwoPlayers.click();
        }

        public void mensagemPerdaConexao(String msg) {

            Assert.assertEquals(msg, textLostConnection.getText());
        }

        public void confirmarPerdaConexao(){
            btnOKLostConnection.click();
        }

        public void sairTutorial(){
        btnSairTutorial.click();
    }
}
