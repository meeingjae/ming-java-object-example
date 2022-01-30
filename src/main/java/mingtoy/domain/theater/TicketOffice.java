package mingtoy.domain.theater;

import lombok.Builder;

@Builder
public class TicketOffice {

    private TicketSeller seller;

    public void sellTicket(Audience audience) {
        seller.sellTo(audience);
    }
}
