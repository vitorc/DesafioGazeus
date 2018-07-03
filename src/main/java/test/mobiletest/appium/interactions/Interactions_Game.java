package test.mobiletest.appium.interactions;

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

        public void mensagemPerdaConexao(){
        String teste = textLostConnection.getText();
           try{
               teste.equals("A conexão com o servidor foi perdida. Por favor, entre novamente");
           } catch (Exception e){
               e.getMessage();
           }
        }

        public void ConfirmarPerdaConexao(){
            btnOKLostConnection.click();
        }
}
