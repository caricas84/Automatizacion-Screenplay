package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AcademyChoucairLoginPage extends PageObject {

    /*public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("(//strong[contains(.,'Ingresar')])[1]"));*/
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("(//STRONG[text()='Ingresar'])[1]"));
    public static final Target LOGIN_USER = Target.the("button that shows us the form to login")
            .located(By.id("username"));
    public static final Target LOGIN_PASSWORD = Target.the("button that shows us the form to login")
            .located(By.id("password"));
    public static final Target ACCES_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//button[contains(.,'Acceder')]"));
    /*public static final Target ACCES_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//BUTTON[@type='submit'][text()='Ingresar']"));*/
    }

