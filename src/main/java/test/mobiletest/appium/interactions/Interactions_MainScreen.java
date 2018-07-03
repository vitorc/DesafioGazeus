package test.mobiletest.appium.interactions;

import test.mobiletest.appium.pageObjects.PageObjects_TelaBusca;

/**
 * Created by Vitor Cardoso
 */
public class Interactions_MainScreen extends PageObjects_TelaBusca{

    public void pressionarBtnOKEntendi()
    {

        btnOKEntendi.click();

    }

    public void pressionarBtnBuscar()
    {

        btnBuscar.click();

    }

    public void digitarProdutoCaixaTxt(String produto)
    {

        //O \n serve para submeter a busca
        campoCaixaTxt.sendKeys(produto + "\n");

    }
}
