package mingtoy.domain.mobile;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Call {

    private LocalDateTime from;
    private LocalDateTime to;

    public Duration getDuration() {

        return Duration.between(from, to);
    }
}
