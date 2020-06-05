package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.AcademyChoucairLoginPage;

public class Login implements Task {
    public static Login onThePage() {

        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AcademyChoucairLoginPage.LOGIN_BUTTON),
        /*actor.attemptsTo(Click.on(AcademyChoucairLoginPage.LOGIN_BUTTON),*/
                Enter.theValue("ccastanog").into(AcademyChoucairLoginPage.LOGIN_USER),
                Enter.theValue("Cava0710*").into(AcademyChoucairLoginPage.LOGIN_PASSWORD),
                Click.on(AcademyChoucairLoginPage.ACCES_BUTTON));
    }
}
