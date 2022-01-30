package mingtoy.domain.screen;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Reservation {

    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;
}
