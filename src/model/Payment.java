package model;

/**
 * The <code>Payment</code> class gets total and returns change.
 */
public class Payment {

    private double total;

    /**
     * Constructs a <code>Payment</code> object.
     * @param totalFinal The amount to be payed by customer.
     */
    public Payment(double totalFinal){
        this.total = totalFinal;
    }

    /**
     * Calculates change.
     * @param paidAmount The amount that is payed by customer
     * @return returns the change.
     */
    public double Pay(double paidAmount){
        return -((double)(Math.round(100*(total - paidAmount)))/100);
    }

}
