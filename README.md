# Assignment #3 — Bridge Pattern

## Topic
Travel Booking System

## Description
This Java project demonstrates the Bridge structural design pattern by separating
booking types from payment methods. Both sides can vary independently.

## Bridge roles

### Abstraction
`Booking` — abstract class that stores a reference to `PaymentMethod`.

### Refined Abstractions
- `HotelBooking`
- `FlightBooking`

### Implementor
`PaymentMethod` — interface for payment operations.

### Concrete Implementors
- `CreditCardPayment`
- `PayPalPayment`

### Client
`Main` creates booking objects with payment implementations and demonstrates
switching the implementation at runtime without changing the booking abstraction.

## Clean Code principles used

1. **Separation of responsibilities**  
   Booking classes contain booking logic, while payment classes contain payment logic.

2. **Meaningful names**  
   Names such as `HotelBooking`, `FlightBooking`, `PaymentMethod`, and
   `CreditCardPayment` clearly describe each class's responsibility.

3. **Small and focused classes**  
   Each class has one clear purpose.

4. **No duplicated payment logic**  
   Booking classes delegate payment to the `PaymentMethod` interface instead of
   implementing payment behavior themselves.

5. **Open/Closed and backward-compatible design**  
   A new payment method can be added by implementing `PaymentMethod` without
   modifying `Booking`, `HotelBooking`, or `FlightBooking`.

## Compile and run

```bash
javac src/*.java
java -cp src Main
```

## Expected behavior
The program creates hotel and flight bookings, processes payments, and then
switches payment implementations at runtime to demonstrate the Bridge pattern.
