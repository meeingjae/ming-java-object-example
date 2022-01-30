package mingtoy.domain.screen;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class Screening {

    private Movie         movie;
    private int           sequence;
    private LocalDateTime whenScreened;

    public LocalDateTime getStartTime() {

        return whenScreened;
    }

    public boolean isSequence(int sequence) {

        return this.sequence == sequence;
    }

    public Money getMovieFee() {

        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
