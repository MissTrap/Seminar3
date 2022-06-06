package model;
import java.util.ArrayList;
import dbHandler.DBHandler;
import dbHandler.ItemDTO;

/**
 * The <code>Sale</code> class handles the information and functionality for items used by the program.
 */
public class Sale {
    /**
     * The variable runningTotal keeps track of the total price for all the items in the goods arraylist.
     * The variable goods holds all the items in the sale.
     * The variable dbh is the instance of the class <code>DBHandler</code> initiated in the <code>Main</code> class.
     */
    private double runningTotal = 0;
    private ArrayList<ItemDTO> goods = new  ArrayList<ItemDTO>();
    private DBHandler dbh;

    /**
     * Constructor for the <code>Sale</code>.
     * @param dbh is the instance of the DBHander class.
     */
    public Sale(DBHandler dbh){
        this.runningTotal = runningTotal;
        this.goods = goods;
        this.dbh = dbh;
    }

    /**
     * Method for acquiring the running total of the <code>Sale</code> class.
     * @return Returns the current total price of all the items in goods.
     */
    public double getTotal(){
        return (double) Math.round(runningTotal * 100) / 100;
    }

    /**
     * Method for acquiring the items included in the transaction.
     * @return Returns the goods variable containing all the items included in the transaction.
     */
    public ArrayList<ItemDTO> getGoods(){
        return goods;
    }

    /**
     * Method for adding an item to the transaction. The item is stored in goods and the runningTotal variable is updated.
     * @param itemID Defines what item should be added.
     * @return Returns the item for displaying in the <code>View</code>.
     */
    public ItemDTO inputItem(int itemID){
        ItemDTO item = dbh.getItemInfo(itemID);
        if (item != null) {
            goods.add(item);
            runningTotal += item.getPrice() + item.getTaxRate();
            return item;
        }
        return null;
    }

    /**
     * Method for handling the payment and printing the receipt..
     * @param amount The amount payed by the customer.
     * @return Returns the change after the transaction.
     */
    public double Payment(double amount){
        Payment payment = new Payment(getTotal());
        printReceipt();
        return payment.Pay(amount);
    }

    /**
     * Method for instantiating and calling the print function in the <code>Receipt</code> class.
     */
    public void printReceipt(){
        Receipt receipt = new Receipt();
        receipt.print(this);
    }
}
