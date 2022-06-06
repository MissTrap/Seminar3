package dbHandler;
import model.Sale;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * The <code>InventoryHandler</code> class handles the communication with the inventory system.
 */
public class InventoryHandler {
    private ArrayList<ItemDTO> inventory;

    /**
     * Constructs a <code>InventoryHandler</code> object with the inventory list.
     * @param inventory represent the list of items in the inventory.
     */
    public InventoryHandler(ArrayList<ItemDTO> inventory){
        this.inventory = inventory;
    }

    /**
     * Gets timestamp, fetch purchased goods from sale and would have sent this to the inventory system.
     * @param sale represent the current sale object.
     */
    public void logInventory(Sale sale){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        sale.getGoods();
    }

    /**
     * Fetches the inventory, abstraction of how it would look when made properly.
     * @return returns a array list of the inventory.
     */
    public ArrayList<ItemDTO> getInventory(){
       return inventory;
    }

}
