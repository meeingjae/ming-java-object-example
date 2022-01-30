package mingtoy;

import mingtoy.domain.screen.policy.AmountDiscountPolicy;
import mingtoy.domain.screen.Money;
import mingtoy.domain.screen.Movie;
import mingtoy.domain.screen.policy.NoneDiscountPolicy;
import mingtoy.domain.screen.policy.condition.PeriodCondition;
import mingtoy.domain.screen.Screening;
import mingtoy.domain.screen.policy.condition.SequenceCondition;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class main {

    public static void main(String[] args) {

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
    }
}