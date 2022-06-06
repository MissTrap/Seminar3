package dbHandler;

/**
 * The <code>ItemDTO</code> class consists of objects with information related to an item.
 * A object, or a DTO, that have all information of a item.
 */
public class ItemDTO {
    private int itemID;
    private String name;
    private double price;
    private double taxRate;
    private String description;

    /**
     * Constructs a <code>ItemDTO</code> object with specified information.
     * @param itemID the item identification.
     * @param name the name of the item.
     * @param price the price of the item.
     * @param taxRate the tax rate for that item.
     * @param description item description.
     */
    public ItemDTO(int itemID, String name, double price, double taxRate, String description){
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
        this.description = description;
    }

    /**
     * Fetch method for ID.
     * @return returns item ID.
     */
    public int getItemID(){
        return itemID;
    }

    /**
     * Fetch method for name.
     * @return returns item name.
     */
    public String getName(){
        return name;
    }

    /**
     * Fetch method for price.
     * @return returns item price.
     */
    public double getPrice(){
        return price;
    }

    /**
     * Fetch method for taxrate.
     * @return returns item taxrate.
     */
    public double getTaxRate(){
        return taxRate;
    }

    /**
     * Fetch method for description.
     * @return returns item description.
     */
    public String getDescription(){
        return description;
    }
}
