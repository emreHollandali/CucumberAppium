package stepdefinitions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.ios.AllPage;
import utilities.Driver;

public class PopUpToastStepDefs {
    AllPage allPage =  new AllPage();
    @When("kullanici Expandable Lits sayfasina gidecek")
    public void kullanici_expandable_lits_sayfasina_gidecek() throws InterruptedException {
      Thread.sleep(3000);
        allPage.viewsPage().expandableLists.click();


    }

    @When("kullanici Custom Adapter sayfasina gidecek")
    public void kullanici_custom_adapter_sayfasina_gidecek() throws InterruptedException {
        Thread.sleep(3000);
        allPage.expandableListPage().customAdapter.click();
    }

    @When("kulanici People Names basili tutacak ve popup acilacak")
    public void kulanici_people_names_basili_tutacak_ve_popup_acilacak() throws InterruptedException {
        TouchAction action = new TouchAction(Driver.getAppiumDriver());
        Thread.sleep(3000);
        action.longPress(ElementOption.element(allPage.expandableListPage().peopleNames)).perform();

        Assert.assertTrue(allPage.expandableListPage().sampleAction.isDisplayed());
    }

    @When("kullanici Simple action tiklayacak")
    public void kullanici_simple_action_tiklayacak() throws InterruptedException {
        Thread.sleep(3000);
        allPage.expandableListPage().sampleAction.click();
    }

    @Then("Tost mesaj {string} icerdigini onayla")
    public void tost_mesaj_icerdigini_onayla(String toastText) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(allPage.expandableListPage().toastMessage.getAttribute("name"));
        Thread.sleep(3000);
        Assert.assertTrue(allPage.expandableListPage().toastMessage.getAttribute("name").contains(toastText));
        Assert.fail();
    }










    //PopUpToast claasínin icine koyacaksin


    @When("kullanici Popup Menu sayfasina gidecek")
    public void kullaniciPopupMenuSayfasinaGidecek() {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"))");

        allPage.popupMenuPage().popupMenu.click();

    }

    @When("kullanici Make a popup butonuna tikliyacak ve popup gorecek")
    public void kullaniciMakeAPopupButonunaTikliyacakVePopupGorecek() {
        allPage.popupMenuPage().makePopup.click();

        Assert.assertTrue(allPage.popupMenuPage().add.isDisplayed());
    }

    @When("kullanici Add butonuna basacak")
    public void kullaniciAddButonunaBasacak() {
        allPage.popupMenuPage().add.click();
    }

    @Then("toast mesaji onayliyacak {string}")
    public void toastMesajiOnayliyacak(String toastText) {
        System.out.println(allPage.popupMenuPage().toast.getAttribute("name"));

        Assert.assertEquals(toastText,allPage.popupMenuPage().toast.getAttribute("name"));

    }
}


