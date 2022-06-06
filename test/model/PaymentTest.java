package model;


import org.junit.Test;


public class PaymentTest {
    @Test
    public void pay() throws Exception {
        Payment payment = new Payment(80);

        /**
         * Expected value of change if total is 80 and payed is 100
         */
        assert(20 == payment.Pay(100));

        /**
         * Expected value of change if total is 80 and payed is 60
         */
        assert(-20 == payment.Pay(60));

        /**
         * Expected value of change if total is 0 and payed is 1,006
         */
        Payment payment1 = new Payment(0);
        assert(1.01 == payment1.Pay(1.006));
    }

}
