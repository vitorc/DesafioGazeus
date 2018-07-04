package test.mobiletest.appium.interactions;

import org.junit.Assert;
import test.mobiletest.appium.pageObjects.PageObjects_EnglishLabels;

public class Interactions_EnglishLabels extends PageObjects_EnglishLabels {

    public void labelsvipscreentake(String take){

        Assert.assertEquals(take, textTake.getText());
    }

    public void labelsvipscreenplaywithout(String playwithout){

        Assert.assertEquals(playwithout, textPlayWithout.getText());
    }

    public void labelsvipscreenchangeprofilephoto(String change){

        Assert.assertEquals(change, textChangeProfilePhoto.getText());
    }

    public void labelsvipscreensevendaysfree(String sevendays){

        Assert.assertEquals(sevendays, textSevenDays.getText());
    }

    public void labelsvipscreenfreetrial(String freetrial){

        Assert.assertEquals(freetrial, textFreeTrial.getText());
    }

    public void labelsvipscreenAnnually(String annually){

        Assert.assertEquals(annually, textAnnually.getText());
    }

    public void mainscreen(String playnow){

        Assert.assertEquals(playnow, textPlayNow.getText());
    }

    public void choosegametypemain(String choosegametype){

        Assert.assertEquals(choosegametype, textChooseGameType.getText());
    }

    public void rulewithoutthreeofakind(String three){

        Assert.assertEquals(three, textWithoutThreeKind.getText());
    }

    public void ruleopenpile(String openpile){

        Assert.assertEquals(openpile, textOpenPile.getText());
    }

    public void ruleowithoucanastra(String withoutcanastra){

        Assert.assertEquals(withoutcanastra, textWithCleanCanastra.getText());
    }

}

