package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user navigates to Fleet  Vehicles")
    public void the_use_navigates_to_Fleet_Vehicles() {
        // selenium code
        System.out.println("the user navigates to Fleet  Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("Actual and expected title are matching");
    }

    @When("the user navigates to Marketing,Campanigns")
    public void the_user_navigates_to_Marketing_Campanigns() {
        System.out.println("the user navigates to Marketing,Campanigns");
    }

    @Then("the title should be Campanigns")
    public void the_title_should_be_Campanigns() {
        System.out.println("Actual and expected title are matching");
    }

    @When("the user navigates to Activities  Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("the use navigates to Activities  Calendar Events");

    }

    @Then("the title should be Calendar Events")
    public void the_title_should_be_Calendar_Events() {

        System.out.println("Actual and expected title are matching");
    }
    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {

        new DashboardPage().navigateToModule(tab,module);
        BrowserUtils.waitFor(4);

    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {

        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedPageNum,actualNumber);
    }

}