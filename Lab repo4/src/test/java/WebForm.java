// Page URL: https://formy-project.herokuapp.com/form
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "Mennah";
    private final String LAST_NAME = "Fetouh";
    private final String JOB_TITLE = "student";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id = "job_title")
    private WebElement job_title;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }

    public void enterJobTitle(){
        this.last_name.sendKeys(JOB_TITLE);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }
}
