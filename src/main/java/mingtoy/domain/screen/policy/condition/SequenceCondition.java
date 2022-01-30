package mingtoy.domain.screen.policy.condition;

import lombok.AllArgsConstructor;
import mingtoy.domain.screen.Screening;

@AllArgsConstructor
public class SequenceCondition implements DiscountCondition{

    private int sequence;

    @Override
    public boolean isSatisfiedBy(Screening screening) {

        return screening.isSequence(sequence);
    }
}
