package mingtoy.domain.mobile.condition;

import mingtoy.domain.mobile.Call;
import mingtoy.domain.mobile.DateTimeInterval;

import java.util.List;

public interface FeeCondition {

    List<DateTimeInterval> findTimeIntervals(Call call);
}
