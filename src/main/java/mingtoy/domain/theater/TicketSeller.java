package mingtoy.domain.theater;

import lombok.Builder;

@Builder
public class TicketSeller {

    public void sellTo(Audience audience) {
        audience.buyTicket();
    }
}
