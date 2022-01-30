package mingtoy.domain.theater;

import lombok.Builder;

@Builder
public class Theater {

    private TicketOffice office;

    public void enter(Audience audience) {
        office.sellTicket(audience);
    }
}
