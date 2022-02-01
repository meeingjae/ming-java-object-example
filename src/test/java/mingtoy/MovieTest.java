package mingtoy;

import mingtoy.domain.screen.Money;
import mingtoy.domain.screen.Movie;
import mingtoy.impldomain.screen.policy.AmountDiscountPolicy;
import mingtoy.impldomain.screen.policy.condition.PeriodCondition;
import mingtoy.impldomain.screen.policy.condition.SequenceCondition;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class MovieTest {

    @Test
    public void firstTest() {
        Movie avatar = new Movie(
                "avatar",
                Duration.ofMinutes(120),
                Money.ones(10000),
                new AmountDiscountPolicy(Money.ones(800),
                        new SequenceCondition(1),
                        new SequenceCondition(3),
                        new PeriodCondition(
                                DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59))));
    }
}
