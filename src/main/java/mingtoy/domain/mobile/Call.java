package mingtoy.domain.mobile;

import lombok.AllArgsConstructor;

import java.time.Duration;
import java.time.LocalDateTime;

@AllArgsConstructor
public class Call {

    private LocalDateTime from;
    private LocalDateTime to;

    public Duration getDuration() {

        return Duration.between(from, to);
    }
}
