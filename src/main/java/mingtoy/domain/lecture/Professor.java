package mingtoy.domain.lecture;

import lombok.Setter;

@Setter
public class Professor {

    private String  professorName;
    private Lecture lecture;

    public Professor(String professorName) {

        this.professorName = professorName;
    }

    public Professor(String professorName, Lecture lecture) {

        this.professorName = professorName;
        this.lecture = lecture;
    }

    public String compileStatistics() {
        return String.format("[%s] %s - Avg: %.1f", professorName, lecture.evaluate(), lecture.average());
    }
}
