package mingtoy.domain.theater;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Bag {

    private Long money;

    private boolean invitation;

    public boolean checkInvitation() {
        return invitation;
    }

    public Long calculateMoney(Long minus) {

        return money - minus;
    }
}
