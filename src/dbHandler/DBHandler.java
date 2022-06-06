package dbHandler;

import java.util.ArrayList;

/**
 * The class <code>DBHandler</code> handles communication between the model layer and the database.
 * Gets information from Model layer and the database and compare this information.
 */
public class DBHandler {
    private EASHandler easHandler;
    private InventoryHandler inv;

    /**
     * Constructs a <code>DBHandler</code> object with input parameters: handlers for external systems.
     * @param easHandler The external accounting system handler.
     * @param inv The inventory handler.
     */
    public DBHandler(EASHandler easHandler, InventoryHandler inv){
        this.easHandler = easHandler;
        this.inv = inv;
    }

    /**
     * Compare item ID with inventory ID's and returns item information to the Model layer.
     * @param itemID The ID of the item that wishes to be purchased.
     * @return Returns either the item information or an error message.
     */
    public ItemDTO getItemInfo(int itemID){
        ArrayList<ItemDTO> inventory = inv.getInventory();
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getItemID() == itemID)
                return inventory.get(i);
        }
        return null;
    }

}
