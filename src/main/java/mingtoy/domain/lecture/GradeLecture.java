package mingtoy.domain.lecture;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class GradeLecture extends Lecture {

    private List<Grade> grades;

    public GradeLecture(int pass, String title, List<Integer> scores, List<Grade> grades) {

        super(pass, title, scores);
        this.grades = grades;
    }

    @Override
    public String evaluate() {

        return super.evaluate() + ", " + gradeStatistics();
    }

    private String gradeStatistics() {

        return grades.stream()
                .map(this::format)
                .collect(joining(" "));
    }

    private String format(Grade grade) {

        return String.format("%s:%d", grade.getName(), gradeCount(grade));
    }

    private long gradeCount(Grade grade) {
        return getScores().stream()
                .filter(grade::include)
                .count();
    }

    private double gradeAverage(Grade grade) {
        return getScores().stream()
                .filter(grade::include)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public double average(String gradeName) {
        return grades.stream()
                .filter(each -> each.isName(gradeName))
                .findFirst()
                .map(this::gradeAverage)
                .orElse(0d);
    }
}
