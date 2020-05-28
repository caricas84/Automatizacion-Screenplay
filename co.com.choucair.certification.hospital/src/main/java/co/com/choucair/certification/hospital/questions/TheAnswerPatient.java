package co.com.choucair.certification.hospital.questions;

import co.com.choucair.certification.hospital.userinterface.PatientHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswerPatient implements Question<String> {
    public static TheAnswerPatient is() {
        return new TheAnswerPatient();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PatientHomePage.THE_ANSWER_PATIENT).viewedBy(actor).asString();
    }
}
