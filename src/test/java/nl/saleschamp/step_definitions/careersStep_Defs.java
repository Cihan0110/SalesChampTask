package nl.saleschamp.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import nl.saleschamp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class careersStep_Defs {

    WebDriverWait wait = new WebDriverWait(Driver.get(),5);

    @Given("User wants to see open positions in salesChamp")
    public void user_wants_to_see_open_positions_in_salesChamp() {
        WebElement CareersBtn = Driver.get().findElement(By.xpath("//*[.=\"Careers\"]"));

        CareersBtn.click();
    }

    @Then("User would like to apply for the {string} role on site")
    public void user_would_like_to_apply_for_the_role_on_site(String jobsTitle) {

        WebElement ApplyBtn = Driver.get().findElement(By.xpath("//h3[contains(text(),'"+jobsTitle+"')]/../a"));

        ApplyBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(ApplyBtn));



    }

}
