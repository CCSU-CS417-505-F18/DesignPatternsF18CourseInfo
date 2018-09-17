package edu.ccsu.cs417.builder.vehicle;

/**
 * Comfort decorator for Seat, for simplicity no methods
 */
public class ComfortSeat implements Seat {

  private final Seat decoratedSeat;

  public ComfortSeat(Seat seat) {
    this.decoratedSeat = seat;
  }

  public String toString() {
    return "Comfort" + decoratedSeat.toString();
  }
}
