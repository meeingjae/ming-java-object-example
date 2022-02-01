package mingtoy.impldomain.screen.policy.condition;

import lombok.AllArgsConstructor;
import mingtoy.domain.screen.Screening;
import mingtoy.domain.screen.policy.condition.DiscountCondition;

@AllArgsConstructor
public class SequenceCondition implements DiscountCondition {

    private int sequence;

    @Override
    public boolean isSatisfiedBy(Screening screening) {

        return screening.isSequence(sequence);
    }
}
