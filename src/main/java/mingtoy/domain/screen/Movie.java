package mingtoy.domain.screen;

import lombok.AllArgsConstructor;
import mingtoy.domain.screen.policy.DiscountPolicy;

import java.time.Duration;

@AllArgsConstructor
public class Movie {

    private String title;
    private Duration runningTime;
    private Money          fee;
    private DiscountPolicy discountPolicy;

    public Money getFee() {

        return fee;
    }

    public Money calculateMovieFee(Screening screening) {

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
}
