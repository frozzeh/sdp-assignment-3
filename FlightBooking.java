public class FlightBooking extends Booking {
    private final String destination;
    private final double ticketPrice;

    public FlightBooking(
            String destination,
            double ticketPrice,
            PaymentMethod paymentMethod) {
        super(paymentMethod);
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void book() {
        System.out.println("Flight booking to: " + destination);
        paymentMethod.pay(ticketPrice);
    }
}
