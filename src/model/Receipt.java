package model;

import java.sql.Timestamp;

/**
 * The <code>Receipt</code> class handles the print of a receipt for the current sale.
 */
public class Receipt {
    private Timestamp timestamp;

    /**
     * Constructs a <code>Receipt</code> object with the current time.
     */
    public Receipt(){
        this.timestamp = getTimestamp();
    }

    /**
     * Handles fetching the current time.
     * @return gives the current time back to the constructor <code>Receipt</code>.
     */
    public Timestamp getTimestamp() {
        timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }

    /**
     * Prints the receipt.
     * @param sale The current sale object.
     */
    public void print(Sale sale){
        System.out.println("\n-------------KVITTO-------------");
        System.out.println(this.timestamp);
        System.out.println("---------------------------------");
        for (int i = 0; i < sale.getGoods().size(); i++) {
            System.out.println(" "
                    + sale.getGoods().get(i).getItemID() + " "
                    + sale.getGoods().get(i).getName() + " "
                    + (sale.getGoods().get(i).getPrice() +
                    (sale.getGoods().get(i).getTaxRate())) + "kr Varav "
                    + sale.getGoods().get(i).getTaxRate() + "kr moms");
        }
        System.out.println("---------------------------------");
        System.out.println("Total: " + sale.getTotal() + "kr");
    }
}
