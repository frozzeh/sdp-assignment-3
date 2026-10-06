public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod payPal = new PayPalPayment();

        Booking hotelBooking =
                new HotelBooking("Astana Grand Hotel", 3, 80.0, creditCard);

        System.out.println("=== Hotel Booking ===");
        hotelBooking.book();

        System.out.println("\nSwitching payment implementation at runtime...");
        hotelBooking.setPaymentMethod(payPal);
        hotelBooking.book();

        Booking flightBooking =
                new FlightBooking("Almaty", 120.0, payPal);

        System.out.println("\n=== Flight Booking ===");
        flightBooking.book();

        System.out.println("\nSwitching payment implementation at runtime...");
        flightBooking.setPaymentMethod(creditCard);
        flightBooking.book();
    }
}
