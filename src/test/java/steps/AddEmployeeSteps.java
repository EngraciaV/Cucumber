package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import static utils.CommonMethods.driver;

public class AddEmployeeSteps extends CommonMethods {
    @Given("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
      //  WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        //pimOption.click();
        click(dashboardPage.pimOption);
    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
        //WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
        //addEmployeeButton.click();
        click(dashboardPage.addEmployeeButton);
    }
    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {
       // WebElement firstNameTextField = driver.findElement(By.id("firstName"));
        //WebElement lastNameTextField = driver.findElement(By.id("lastName"));
       // firstNameTextField.sendKeys("aendro");
        sendText("aendro", addEmployeePage.firstNameField);
        //lastNameTextField.sendKeys("farewell");
        sendText("farwell", addEmployeePage.lastNameField);
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        //WebElement saveButton = driver.findElement(By.id("btnSave"));
       // saveButton.click();
        click(addEmployeePage.saveButton);
    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee successfully added");
    }


    @When("user enters {string} and {string} and {string}")
    public void user_enters_and_and(String firstName, String middleName, String lastName) {
        // Write code here that turns the phrase above into concrete actions
        sendText(firstName,addEmployeePage.firstNameField);
        sendText(middleName, addEmployeePage.middleNameField);
        sendText(lastName, addEmployeePage.lastNameField);
    }
    @When("user enters {string} and {string} and {string} in data driven format")
    public void user_enters_and_and_in_data_driven_format(String firstName, String middleName, String lastName) {
        sendText(firstName,addEmployeePage.firstNameField);
        sendText(middleName,addEmployeePage.middleNameField);
        sendText(lastName,addEmployeePage.lastNameField);
    }

}
