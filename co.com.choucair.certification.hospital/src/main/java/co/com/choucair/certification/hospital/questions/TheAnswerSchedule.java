package co.com.choucair.certification.hospital.questions;

import co.com.choucair.certification.hospital.userinterface.ScheduleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswerSchedule implements Question<String> {
    public static TheAnswerSchedule is() {
        return new TheAnswerSchedule();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ScheduleHomePage.THE_ANSWER_SCHEDULE).viewedBy(actor).asString();
    }
}


