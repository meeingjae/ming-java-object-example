package mingtoy;

import mingtoy.domain.lecture.Grade;
import mingtoy.domain.lecture.GradeLecture;
import mingtoy.domain.lecture.Lecture;
import mingtoy.domain.lecture.Professor;
import mingtoy.domain.mobile.policy.NightlyDiscountPolicy;
import mingtoy.domain.mobile.Phone;
import mingtoy.domain.mobile.policy.RateDiscountablePolicy;
import mingtoy.domain.mobile.policy.TaxablePolicy;
import mingtoy.domain.screen.Money;
import mingtoy.domain.screen.Movie;
import mingtoy.domain.screen.Screening;
import mingtoy.impldomain.screen.policy.AmountDiscountPolicy;
import mingtoy.impldomain.screen.policy.NoneDiscountPolicy;
import mingtoy.impldomain.screen.policy.condition.PeriodCondition;
import mingtoy.impldomain.screen.policy.condition.SequenceCondition;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class main {

    final static Grade A = new Grade("A", 100, 95);
    final static Grade B = new Grade("B", 94, 90);
    final static Grade C = new Grade("C", 89, 85);
    final static Grade D = new Grade("D", 84, 80);
    final static Grade F = new Grade("F", 79, 0);
    final static Grade G = new Grade("G");

    public static void main(String[] args) {

        // Movie Example
        Movie avatar = new Movie(
                "avatar",
                Duration.ofMinutes(120),
                Money.ones(10000),
                new AmountDiscountPolicy(Money.ones(800),
                        new SequenceCondition(1),
                        new SequenceCondition(3),
                        new PeriodCondition(
                                DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59))));

        Movie starwars = new Movie(
                "starwars",
                Duration.ofMinutes(140),
                Money.ones(11000),
                new NoneDiscountPolicy());

        Screening screening = new Screening(avatar, 1, LocalDateTime.MAX);
        Screening screening2 = new Screening(starwars, 2, LocalDateTime.MAX);

        System.out.println(screening.calculateFee(2).getAmount());
        System.out.println(screening2.calculateFee(2).getAmount());

        //Phone Example
        Phone phone = new Phone(
                new TaxablePolicy(0.05,
                        new RateDiscountablePolicy(Money.ones(1000),
                                new NightlyDiscountPolicy(Money.ones(1000), Money.ones(500), Duration.ofSeconds(10)))));

        //Lecture Example
        Lecture lecture = new Lecture(
                90,
                "민재학 강의",
                Arrays.asList(90, 80, 70, 99, 100, 30, 55, 70));

        Lecture renewLecture = new GradeLecture(
                90,
                "Ming theory",
                Arrays.asList(90, 80, 70, 99, 100, 30, 55, 70),
                Arrays.asList(A, B, C, D, F));

        Professor mingProfessor = new Professor("mingProfessor");

        //Lecture
        mingProfessor.setLecture(lecture);
        System.out.println(mingProfessor.compileStatistics());

        //GradeLecture
        mingProfessor.setLecture(renewLecture);
        System.out.println(mingProfessor.compileStatistics());

    }
}
