package controller;
import dbHandler.ItemDTO;
import dbHandler.DBHandler;
import model.*;

/**
 * The <code>Controller</code> class represent the controller layer and therefore handles communication between
 * the View layer and the Model layer.
 */
public class Controller {
    private Sale sale;
    private DBHandler dbh;

    /**
     * Constructs a <code>Controller</code> object.
     * @param dbh represent an instance of the DBHandler class located in the DBHandler layer.
     */
    public Controller(DBHandler dbh){
        this.dbh = dbh;
    }

    /**
     * Call to Model to start construct a new Sale object.
     */
    public void startSale(){
        this.sale = new Sale(dbh);
    }

    /**
     * Call to Model to insert a new item into the Sale object.
     * @param itemID represent ID for the item.
     * @return returns item information and running total.
     */
    public ItemDTO addItem(int itemID){
        return sale.inputItem(itemID);
    }

    /**
     * Call to Model to get the total cost.
     * @return returns total.
     */
    public double getTotal(){
        return sale.getTotal();
    }

    /**
     * Call to Model to get amount of change given the amount payed.
     * @param amount The amount payed by customer.
     * @return Returns the amount of change, negative if customer haven't payed enough.
     */
    public double enterPayment(double amount){
        return sale.Payment(amount);
    }
}
