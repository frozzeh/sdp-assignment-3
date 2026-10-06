public abstract class Booking {
    protected PaymentMethod paymentMethod;

    protected Booking(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void book();
}
